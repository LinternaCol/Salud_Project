package com.ramostear.springboot.uploadfile.service.impl.carry;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ReadInterface {
    public void archvio(MultipartFile file) throws IOException;
}
