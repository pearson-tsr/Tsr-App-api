package com.example.testsummeryreport.model;

import org.springframework.data.annotation.Id;
import org.springframework.web.multipart.MultipartFile;

public class Tsr {

    @Id
    private String changeTicketId;

    private String tsrState;

    private MultipartFile file;

    private Team team;

    private Product product;

    private Release release;

    private Defect defect;

    private TotalTests totalTests;

    public Tsr() {
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getTsrState() {
        return tsrState;
    }

    public void setTsrState(String tsrState) {
        this.tsrState = tsrState;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Defect getDefect() {
        return defect;
    }

    public void setDefect(Defect defect) {
        this.defect = defect;
    }

    public TotalTests getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(TotalTests totalTests) {
        this.totalTests = totalTests;
    }

}
