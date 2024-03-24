package com.codeneeti.todo.controller;
import jakarta.servlet.http.HttpServletResponse;
//import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

@RestController
@RequestMapping("/file")
public class FileController {
    Logger logger= LoggerFactory.getLogger(FileController.class);

    @PostMapping("/single")
    public String uploadSingleFile(@RequestParam("image")MultipartFile file){
        logger.info("Name :{} :",file.getName());
        logger.info("Original Name {} :",file.getOriginalFilename());

        return null;

    }

    @PostMapping("/multi")
    public String uploadMultiFile(@RequestParam("files")MultipartFile[] files){
        Arrays.stream(files).forEach(file -> {
            logger.info("file name {}:",file.getOriginalFilename());
            System.out.println("+++++++++++++++++++++++++++++++");
        });
        return "Multi file handling";
    }

    @GetMapping("/serve-image")
    public void serveImageHandler(HttpServletResponse response) {
        try {
            InputStream fileInputStream = new FileInputStream("/home/arjun/mern/Backend/JB/TalkOpenlyDevelopOpenay/images/hanu.jpeg");
            response.setContentType(MediaType.IMAGE_JPEG_VALUE); // Use the correct class
            StreamUtils.copy(fileInputStream, response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
