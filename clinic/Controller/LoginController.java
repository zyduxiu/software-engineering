package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.UserAuth;
import com.clinicappoint.clinic.Service.UserAuthService;
import com.clinicappoint.clinic.Util.SessionUtils;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    UserAuthService userAuthService;
    @CrossOrigin
    @GetMapping("/login")
    public UserAuth checkLogin(String username, String password){
        if(userAuthService.getLogininformation(username,password)!=null){
            SessionUtils.setSession(userAuthService.getLogininformation(username,password));
        }
        return userAuthService.getLogininformation(username,password);
    }

    @CrossOrigin
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody signupbody pd){
        if(userAuthService.Signup(pd.getUsername(),pd.getPassword(),pd.getEmail())){
            return ResponseEntity.ok("Success");
        }
        else{
            return ResponseEntity.badRequest().body(pd.getUsername());
        }
    }

    @Data
    static class signupbody{
        String username;
        String password;
        String email;
    }
}
