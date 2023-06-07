package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Certificate;
import com.Online_Education_Platform.Online_Education_Platform.Services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "certificate")
public class CertificateController {
    //    http://localhost:8080/certificate/getAll
    @Autowired
    CertificateService certificateService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Certificate> getAllCertificates() {

        return certificateService.getAllCertificates();
    }
    @GetMapping(value = "getById")
    public Certificate getCertificateById(@RequestParam Integer id) {

        return certificateService.getCertificateById(id);
    }
}
