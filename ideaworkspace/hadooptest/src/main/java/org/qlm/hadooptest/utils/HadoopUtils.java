package org.qlm.hadooptest.utils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

@Component
public class HadoopUtils {
    @Value("${hdfs.url}")
    private String hdfsPath;
    @Value("${hdfs.hdfsName}")
    private String hdfsName;
    @Value("${hdfs.uploadpath}")
    private String uploadpath;
    /**
     * 获取HDFS配置信息
     * @return
     */
    private  Configuration getConfiguration() {

        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", hdfsPath);
        return configuration;
    }
    /**
     * 获取HDFS文件系统对象
     * @return
     * @throws Exception
     */
    public  FileSystem getFileSystem() throws Exception {
        // 客户端去操作hdfs时是有一个用户身份的,可以在构造客户端fs对象时，通过参数传递进去
        FileSystem fileSystem = FileSystem.get(new URI(hdfsPath), getConfiguration(), hdfsName);
        return fileSystem;
    }
    /*创建文件夹*/

    public void  createFiles(String path) throws Exception {
        // 文件对象
        FileSystem fs = getFileSystem();
        // 目标路径
        Path newPath = new Path(path);
        // 创建空文件夹
        boolean isOk = fs.mkdirs(newPath);
        fs.close();
    }

    /*上传文件*/
    public void hadoopUpLoad(MultipartFile file) throws Exception {
        FileSystem fs=getFileSystem();
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        // 上传时默认当前目录，后面自动拼接文件的目录
        Path newPath = new Path(uploadpath + "/" + fileName);
        // 打开一个输出流
        FSDataOutputStream outputStream = fs.create(newPath);
        outputStream.write(file.getBytes());
        outputStream.close();
        fs.close();
    }
    /*下载文件到本地*/
    public void hadoopDownFile(String path) throws Exception {
        FileSystem fs = getFileSystem();
        // 上传路径
        Path clientPath = new Path(uploadpath+"/"+path);
        // 目标路径
        Path serverPath = new Path("D:\\hadoopfile");
        // 调用文件系统的文件复制方法，第一个参数是否删除原文件true为删除，默认为false
        fs.copyToLocalFile(true, clientPath, serverPath);
        fs.close();
    }


    /*
     * Download hdfs file in URI to local file
     * 浏览器下载文件到客户端
     */
    public void downloadFromHDFS(String HDFSFileName,OutputStream localFileOutPut) throws Exception {
        FileSystem fs =getFileSystem();
        InputStream is = fs.open(new Path(uploadpath+"/"+HDFSFileName));
        IOUtils.copyBytes(is,localFileOutPut,4096, true);//close in and out stream via this API itself.
        fs.close();

    }

    public String getHdfsPath() {
        return hdfsPath;
    }

    public void setHdfsPath(String hdfsPath) {
        this.hdfsPath = hdfsPath;
    }

    public String getHdfsName() {
        return hdfsName;
    }

    public void setHdfsName(String hdfsName) {
        this.hdfsName = hdfsName;
    }
}
