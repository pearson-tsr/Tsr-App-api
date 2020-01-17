package com.example.testsummeryreport.model;

import org.springframework.data.annotation.Id;
import org.springframework.web.multipart.MultipartFile;

public class ImageFile {

    @Id
    private String changeTicketId;

    private MultipartFile file;

    public ImageFile() {
        super();
    }

    public String getChangeTicketId() {
        return changeTicketId;
    }

    public void setChangeTicketId(String changeTicketId) {
        this.changeTicketId = changeTicketId;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

}
