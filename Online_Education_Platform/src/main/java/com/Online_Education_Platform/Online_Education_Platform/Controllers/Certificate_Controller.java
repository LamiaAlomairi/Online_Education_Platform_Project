package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Certificate;
import com.Online_Education_Platform.Online_Education_Platform.Services.Certificate_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "certificate")
public class Certificate_Controller {
    //    http://localhost:8080/certificate/getAll
    @Autowired
    Certificate_Service certificate_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Certificate> getAllCertificates() {

        return certificate_service.getAllCertificates();
    }
    @GetMapping(value = "getById")
    public Certificate getCertificateById(@RequestParam Integer id) {

        return certificate_service.getCertificateById(id);
    }
}
