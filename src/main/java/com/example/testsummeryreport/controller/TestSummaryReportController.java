package com.example.testsummeryreport.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.testsummeryreport.model.Tsr;
import com.example.testsummeryreport.resource.TestSummaryReportService;
import com.google.common.net.HttpHeaders;

import io.swagger.models.Model;

@CrossOrigin
@RestController
@RequestMapping(value = "/tsr-items")
public class TestSummaryReportController {
    @Autowired
    private TestSummaryReportService testSummaryReportService;
    
    @PostMapping("/tsr")
    public Tsr createTsr(@RequestBody Tsr tsr) {
        return testSummaryReportService.createTsr(tsr);
    }

    @GetMapping("/")
    public List<Tsr> getAll() {
        return testSummaryReportService.getAll();
    }

    @GetMapping("/{id}")
    public Tsr getTsr(@PathVariable String id) {
        return testSummaryReportService.getTsr(id);
    }

    @PutMapping("/{id}")
    public Tsr updateTsr(@PathVariable String id, @RequestBody Tsr tsr) {
        return testSummaryReportService.updateTsr(id, tsr);
    }

    @DeleteMapping("/{id}")
    public void deleteTsr(@PathVariable String id) {
        testSummaryReportService.deleteTsr(id);
    }

}

