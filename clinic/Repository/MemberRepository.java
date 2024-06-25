package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    List<Member> findByMemberName(String memberName);
}
