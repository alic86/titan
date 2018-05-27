package com.alic.controller;

import com.alic.common.file.FileForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 文件上传控制器
 *
 * @author suxingzhe
 * @create 2018-05-24
 **/
@Controller
public class FileUploadController {
    /**
     * 存储文件流
     */
    private void storeFile(byte[] fileBytes){

    }

    private String directPath(MultipartFile file){
        if (file.isEmpty()) {
            return "redirect:uploadFailure";
        }

        try {
            byte[] fileBytes = file.getBytes();
            if(fileBytes.length == 0){
                return "redirect:uploadFailure";
            }

            storeFile(fileBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:uploadFailure";
        }

        return "redirect:uploadSuccess";
    }

    @PostMapping("/form")
    public String handleFormUpload(@RequestParam("name") String name,
                                   @RequestParam("file") MultipartFile file) throws IOException {

        return directPath(file);
    }

    @PostMapping("/form")
    public String handleFormUpload(FileForm form, BindingResult errors) {
        MultipartFile file = form.getFile();
        return directPath(file);
    }
}
