package com.example.testsummeryreport.resource;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.testsummeryreport.model.Tsr;

public interface TestSummaryReportService {

    Tsr createTsr(Tsr tsr);

    List<Tsr> getAll();

    Tsr getTsr(String changeTicketId);

    Tsr updateTsr(String changeTicketId, Tsr updatedTsr);

    void deleteTsr(String changeTicketId);

//    MultipartFile uploadImage(MultipartFile file);


}
