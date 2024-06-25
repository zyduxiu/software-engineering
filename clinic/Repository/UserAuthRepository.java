package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.UserAuth;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import com.clinicappoint.clinic.Entity.UserAuth;
import org.springframework.data.jpa.repository.Query;

public interface UserAuthRepository extends JpaRepository<UserAuth,Integer> {
    @Select("select * from clinicdata.logintable where password=#{password} AND username=#{username}")
    UserAuth findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Select("select * from clinicdata.logintable where username=#{username}")
    UserAuth findUserAuthByUsername(@Param("username") String username);
}
