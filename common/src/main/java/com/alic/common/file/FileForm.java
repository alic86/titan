package com.alic.common.file;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传表单
 *
 * @author suxingzhe
 * @create 2018-05-24
 **/
@Data
public class FileForm {
    private MultipartFile file;
    private String fileName;
    private String filePath;
}
