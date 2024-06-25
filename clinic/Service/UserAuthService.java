package com.clinicappoint.clinic.Service;

import com.clinicappoint.clinic.Entity.UserAuth;
import com.clinicappoint.clinic.Repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserAuthService {
    public UserAuth getLogininformation(String username,String password);

    public boolean Signup(String username,String password,String email);
}
