package com.clinicappoint.clinic.Service;

import com.clinicappoint.clinic.Entity.MemberCard;
import com.clinicappoint.clinic.Entity.MemberList;
import com.clinicappoint.clinic.Entity.VisitRecords;
import com.clinicappoint.clinic.Repository.MemberCardRepository;
import com.clinicappoint.clinic.Repository.MemberListRepository;
import com.clinicappoint.clinic.Repository.VisitRecordsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    MemberCardRepository memberCardRepository;
    @Autowired
    private VisitRecordsRepository visitRecordsRepository;
    @Autowired
    private MemberListRepository memberListRepository;


    public List<MemberList> findAllMembers() {
        List<MemberList> members = memberListRepository.findAll();
        if(members != null & !members.isEmpty()){
            System.out.println("Member found: " + members.size());
            for(MemberList m : members){
                System.out.println(m);
            }
        }
        else {
            System.out.println("No member found");
        }
        return members;
    }

    public Optional<MemberList> findMemberById(int id) {
        return memberListRepository.findById(id);
    }

    @Transactional
    public MemberList addMember(MemberList member) {
        MemberList newMember = new MemberList();
        newMember.setMemberAge(member.getMemberAge());
        newMember.setMemberAddress(member.getMemberAddress());
        newMember.setMemberName(member.getMemberName());
        newMember.setMemberEmail(member.getMemberEmail());
        newMember.setMemberPhone(member.getMemberPhone());
        newMember.setMemberGender(member.getMemberGender());
        newMember.setCashIn(member.getCashIn());
        List<MemberCard> newCards = new ArrayList<>();
        MemberCard mc = new MemberCard();
        mc.setCardName("无卡");
        mc.setCardBalance(member.getCashIn());
        mc.setMember(member);
        newCards.add(mc);
        member.setCards(newCards);
        memberListRepository.save(newMember);
        System.out.println("Adding member: " + newMember);
        return newMember;
    }

    public MemberList saveMember(MemberList member) {
        MemberList newMember = new MemberList();
        newMember.setMemberAge(member.getMemberAge());
        newMember.setMemberAddress(member.getMemberAddress());
        newMember.setMemberName(member.getMemberName());
        newMember.setMemberEmail(member.getMemberEmail());
        newMember.setMemberPhone(member.getMemberPhone());
        newMember.setMemberGender(member.getMemberGender());
        MemberList savedMember = memberListRepository.save(newMember);
        System.out.println("Saved Member: " + savedMember);
        return savedMember;
    }

    @Transactional
    public void addVisitRecordAndDeductFees(String memberPhone, VisitRecords visitRecords, int cost) {
        //find member
        MemberList member = memberListRepository.findByMemberPhone(memberPhone);
        if(member == null) {
            throw new RuntimeException("No member found");
        }
        int memberKey = member.getMemberKey();

        visitRecords.setMemberKey(memberKey);
        visitRecordsRepository.save(visitRecords);

        MemberCard memberCard = memberCardRepository.findByMemberKey(memberKey);
        if(memberCard == null) {
            throw new RuntimeException("No member card found");
        }

        int newBalance = memberCard.getCardBalance() - cost;
        if(newBalance < 0) {
            throw new RuntimeException("Insufficient balance!");
        }
        memberCard.setCardBalance(newBalance);
        memberCardRepository.save(memberCard);
    }

}
