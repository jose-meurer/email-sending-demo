package com.josemeurer.sendingemails.controllers;

import com.josemeurer.sendingemails.dto.EmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/emails")
public class EmailController {

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        return ResponseEntity.noContent().build();
    }
}
