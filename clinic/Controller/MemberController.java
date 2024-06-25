package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.VisitRecords;
import com.clinicappoint.clinic.Repository.MemberListRepository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.clinicappoint.clinic.Entity.MemberList;
import com.clinicappoint.clinic.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Data
@RestController
@RequestMapping("/api/members")
@CrossOrigin
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    MemberService memberService;

    @Autowired
    private MemberListRepository memberRepository;

    private MemberList memberList;

    @GetMapping
    public List<MemberList> getAllMembers() {
        return memberService.findAllMembers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberList> getMemberById(@PathVariable Integer id) {
        return memberService.findMemberById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/hey")
    public ResponseEntity<List<MemberList>> getMemberByName(@RequestParam String name) {
        List<MemberList> members = memberRepository.findByMemberName(name);
        if (members.isEmpty()) {
            System.out.println("No Members Found with name" + name);
            return ResponseEntity.notFound().build();
        }
        System.out.println("Members Found with name" + name);
        return ResponseEntity.ok(members);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addMember(@RequestBody MemberList memberList) {
        try {
            MemberList savedMember = memberService.addMember(memberList);
            if (savedMember == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(new HashMap<String, String>() {{
                            put("error", "Member not saved");
                            put("status", "error");
                        }});
            }
            return ResponseEntity.ok(savedMember);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new HashMap<String, String>() {{
                        put("error", e.getMessage());
                        put("status", "error");
                    }});
        }
    }

    @PostMapping("/memberPay")
    public String addVisitRecordAndDeductFees(@RequestParam String phoneNumber, @RequestBody VisitRecords visitRecord, @RequestParam int cost) {
        try {
            memberService.addVisitRecordAndDeductFees(phoneNumber, visitRecord, cost);
            return "Success";
        } catch (RuntimeException e) {
            return "Error: " + e.getMessage();
        }
    }

    public MemberList save(MemberList member) {
        return memberRepository.save(member);
    }



}
