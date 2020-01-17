package com.example.testsummeryreport.resource;

import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.testsummeryreport.model.Team;
import com.example.testsummeryreport.model.Tsr;
import com.example.testsummeryreport.repository.TestSummaryReportRepository;

@Service
public class TestSummaryReportImpl implements TestSummaryReportService {

    @Autowired
    private TestSummaryReportRepository testSummaryReportRepository;
    private static Logger logger;
    private Team team;
    
    @Override
    public Tsr createTsr(Tsr tsr) {
        testSummaryReportRepository.save(tsr);
        return tsr;
    }

    @Override
    public List<Tsr> getAll() {
        return testSummaryReportRepository.findAll();
    }

    @Override
    public Tsr getTsr(String changeTicketId) {
        Tsr tsr1 = null;
        Optional<Tsr> tsr2 = this.testSummaryReportRepository.findById(changeTicketId);

        if (tsr2.isPresent()) {
            tsr1 = tsr2.get();
        }
        return tsr1;
    }

    @Override
    public Tsr updateTsr(String changeTicketId, Tsr updatedTsr) {
        Tsr tsr2 = null;
        Optional<Tsr> tsr1 = this.testSummaryReportRepository.findById(changeTicketId);
        
        System.out.println(updatedTsr.getRelease().getQaTeamConfidenceLevelComments());

        if (tsr1.isPresent()) {
           System.out.println("tsr1 is present");
            tsr2 = tsr1.get();
            System.out.println("tsr2 qe lead is: " + tsr2.getTeam().getQeLeadName());
            testSummaryReportRepository.save(updatedTsr);
        }
        System.out.println("final final final");
        return tsr2;
        
        
        
    }

    @Override
    public void deleteTsr(String changeTicketId) {
        testSummaryReportRepository.deleteById(changeTicketId);
    }

//    @Override
//    public MultipartFile uploadImage(MultipartFile file) {
//        testSummaryReportRepository.save(file);
//        return file;
//        
//    }

}
