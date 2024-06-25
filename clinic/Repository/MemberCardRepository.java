package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.MemberCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberCardRepository extends JpaRepository<MemberCard, Integer> {
    MemberCard findByMemberKey(int memberKey);

}
