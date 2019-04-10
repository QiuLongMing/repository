package org.qlm.hadooptest.service.imp;
import org.qlm.hadooptest.service.HadoopService;
import org.qlm.hadooptest.utils.HadoopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.OutputStream;


@Service
public class HadoopServiceImpl implements HadoopService {
   @Autowired
   private HadoopUtils hadoopUtils;



    @Override
    public Integer upLoadFile(MultipartFile file) throws Exception {

        hadoopUtils.hadoopUpLoad(file);
        return 1;
    }

    @Override
    public Integer downFile(String fileName) throws Exception {
        hadoopUtils.hadoopDownFile(fileName);
        return 1;
    }

    @Override
    public Integer downFile2(String HDFSFileName, OutputStream localFileOutPut) throws Exception {

        hadoopUtils.downloadFromHDFS(HDFSFileName,localFileOutPut);
        return 1;
    }

    @Override
    public Integer createFiles(String fileName) throws Exception {
        hadoopUtils.createFiles(fileName);
        return 1;
    }
}
