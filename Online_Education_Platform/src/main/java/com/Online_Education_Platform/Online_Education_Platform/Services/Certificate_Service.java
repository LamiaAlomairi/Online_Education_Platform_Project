package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Certificate;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Certificate_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Certificate_Service {
    @Autowired
    Certificate_Repository certificate_repository;
    public List<Certificate> getAllCertificates() {

        return certificate_repository.findAll();
    }

    public Certificate getCertificateById(Integer id) {

        return certificate_repository.findById(id).get();
    }
}
