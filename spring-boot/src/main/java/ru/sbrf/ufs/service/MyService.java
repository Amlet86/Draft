package ru.sbrf.ufs.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String get() {
        return "test";
    }

    public String get(String header) {
        return "header: " + header;
    }
}
