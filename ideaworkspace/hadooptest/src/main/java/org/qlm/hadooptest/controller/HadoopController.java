package org.qlm.hadooptest.controller;
import org.apache.commons.lang.StringUtils;
import org.qlm.hadooptest.message.ApiMsgEnum;
import org.qlm.hadooptest.message.BaseReturnVO;
import org.qlm.hadooptest.service.HadoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@RestController
@RequestMapping("/hadoop")
public class HadoopController {
@Autowired
private   HadoopService hadoopService;

    /**
     * 创建文件夹
     * @param path
     * @return
     * @throws Exception
     */
    @PostMapping("/mkdir")
    public Object mkdir(@RequestParam("path") String path) throws Exception {
        if (StringUtils.isEmpty(path)) {
            return new BaseReturnVO(ApiMsgEnum.PARAM_IS_NULL);
        }
         Integer isOk=hadoopService.createFiles(path);
        if (isOk>0) {
            return new BaseReturnVO("创建成功");
        } else {
            return new BaseReturnVO(500,"创建失败");
        }
    }


    /**
     * 上传文件
     * @param
     * @return
     * @throws Exception
     */
    @PostMapping("/createFile")
    public Object createFile( @RequestParam("file") MultipartFile file) throws Exception {
        if ( null == file.getBytes()) {
            return new BaseReturnVO(ApiMsgEnum.PARAM_IS_NULL);
        }
        hadoopService.upLoadFile(file);
        return new BaseReturnVO("上传成功");
    }
    /**
     * 下载文件到本地
     * @param path
     * @param
     * @return
     * @throws Exception
     */
    @GetMapping("/downloadFile")
    public Object  downloadFile(@RequestParam("path") String path) throws Exception {
   hadoopService.downFile(path);
        return new BaseReturnVO("下载成功");
    }


    /**
     * 客户端通过浏览器下载文件
     * @param path
     * @param
     * @return
     * @throws Exception
     */
    @GetMapping("/downloadFile2")
    public void  downloadFile2(@RequestParam("path") String path, HttpServletResponse response) throws Exception {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        response.setHeader("charset", "utf-8");
        response.setContentType("application/force-download");//force not to open downloaded file
        response.setHeader("Content-Transfer-Encoding", "binary");
        response.setHeader("Content-Disposition", "attachment;filename=\"" + path + "\"");
        OutputStream os = null;
        os = response.getOutputStream();
        hadoopService.downFile2(path,os);
        os.close();
    }
}
