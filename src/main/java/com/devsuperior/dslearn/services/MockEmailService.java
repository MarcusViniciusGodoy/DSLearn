package com.devsuperior.dslearn.services;

import com.devsuperior.dslearn.dto.EmailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MockEmailService implements EmailService{

    private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void sendEmail(EmailDTO dto){
        LOG.info("Sending email to: " + dto.getTo());
        LOG.info("Email sent!");
    }
}
