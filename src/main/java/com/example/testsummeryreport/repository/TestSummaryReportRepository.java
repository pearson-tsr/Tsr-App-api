package com.example.testsummeryreport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.multipart.MultipartFile;

import com.example.testsummeryreport.model.Tsr;

public interface TestSummaryReportRepository extends MongoRepository<Tsr, String> {

//    void save(MultipartFile file);

}
