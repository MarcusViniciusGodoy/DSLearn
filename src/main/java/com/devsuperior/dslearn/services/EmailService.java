package com.devsuperior.dslearn.services;

import com.devsuperior.dslearn.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
