package com.uniqpay.onboardservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController 
@RequestMapping("/onboard")
public class ClientOnboard {
    @GetMapping("/status")
    public ResponseEntity<String> getOnboardClientsDetails(){
        Map m1=new HashMap<>();
        m1.put("name","Deepak");
        m1.put("phoneNumber","9164226179");
        return ResponseEntity.ok("client details found");
    }
}
