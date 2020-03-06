package io.github.benxincaomu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    private Logger logger=LoggerFactory.getLogger(getClass());
    @PostMapping("say")
    public ResponseEntity<String> say(String str) {
        logger.info("recieve :"+str);
        return new ResponseEntity<String>("recieve :"+str, HttpStatus.OK);
    }
}