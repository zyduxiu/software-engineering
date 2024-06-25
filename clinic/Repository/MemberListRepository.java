package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.MemberList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberListRepository extends JpaRepository<MemberList,Integer> {
    MemberList findByMemberPhone(String memberPhone);
    List<MemberList> findByMemberName(String memberName);

}
