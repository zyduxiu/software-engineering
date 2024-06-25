package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.MemberCard;
import com.clinicappoint.clinic.Entity.MemberList;
import com.clinicappoint.clinic.Repository.MemberCardRepository;
import com.clinicappoint.clinic.Repository.MemberListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberCardController {

    @Autowired
    private MemberListRepository memberListRepository;

    @Autowired
    private MemberCardRepository memberCardRepository;

    @GetMapping("/getMemberInfo")
    public ResponseEntity<MemberCard> getMemberInfo(@RequestParam String phoneNumber) {
        MemberList member = memberListRepository.findByMemberPhone(phoneNumber);
        System.out.println(member);
        if (member == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        MemberCard memberCard = member.getCards().get(0);
        if (memberCard == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(memberCard);
    }
}
