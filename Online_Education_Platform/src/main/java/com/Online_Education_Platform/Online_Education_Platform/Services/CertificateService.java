package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Certificate;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {
    @Autowired
    CertificateRepository certificateRepository;
    public List<Certificate> getAllCertificates() {

        return certificateRepository.findAll();
    }

    public Certificate getCertificateById(Integer id) {

        return certificateRepository.findById(id).get();
    }
}
