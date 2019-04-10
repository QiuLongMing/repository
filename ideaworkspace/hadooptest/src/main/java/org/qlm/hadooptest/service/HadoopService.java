package org.qlm.hadooptest.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.io.OutputStream;

public interface HadoopService {

    /*上传文件*/
    Integer upLoadFile(MultipartFile file) throws Exception;

    /*下载文件*/
    Integer downFile(String fileName) throws Exception;


    /*下载文件*/
    Integer downFile2(String HDFSFileName, OutputStream localFileOutPut) throws Exception;


    /*创建文件夹*/
    Integer createFiles(String fileName) throws Exception;
}
