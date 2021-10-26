package edu.dl.project01.repository;

import edu.dl.project01.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    // Register
    @Transactional(readOnly = false)
    public String join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMember = memberRepository.findById(member.getId());
        if(!findMember.isEmpty()) {
            throw new IllegalStateException("존재하는 회원");
        }
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Member findOne(String id) {
        return  memberRepository.fineone(id);
    }
}
