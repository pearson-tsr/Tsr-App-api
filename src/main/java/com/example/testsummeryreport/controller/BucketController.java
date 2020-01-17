package com.example.testsummeryreport.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.testsummeryreport.resource.AmazonClient;

@CrossOrigin
@RestController
@RequestMapping(value = "/files")
public class BucketController {
    
    private AmazonClient amazonClient;

    @Autowired
    BucketController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestBody MultipartFile file, String id) {
        System.out.println("image id passed to the backend : " + id);
        return this.amazonClient.uploadFile(file, id);
    }

    @DeleteMapping("/{id}")
    public String deleteFile(@PathVariable String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
    
    @GetMapping("/{id}")
    public byte[] getFile(@PathVariable String id) throws IOException {
        System.out.println("Hellooooooooooooooo");
        byte[] data = amazonClient.getFile(id);
        ByteArrayResource resource = new ByteArrayResource(data);
        
        byte[] encoded = Base64.getEncoder().encode(data);
        System.out.println(new String(encoded)); 
        
        return encoded;

    }
    
    
}
