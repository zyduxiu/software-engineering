package com.clinicappoint.clinic.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class checksessionController {
    @CrossOrigin
    @GetMapping("/checksession")
    public ResponseEntity<String> checksession(HttpServletRequest request){
        if(request.getSession(false)!=null){
            return ResponseEntity.ok("yes");
        }
        return ResponseEntity.badRequest().body("no");
    }
}
