package edu.dl.project01.repository;

import edu.dl.project01.domain.Member;
import edu.dl.project01.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback(value = false)    //DB기록 때문
class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void joinMemberTest(){
        Member member = new Member();
        member.setId("mp");
        member.setName("이재준");
        member.setEmail("jaejoon4929@gmail.com");
        member.setAddress("하안로320");

        String savedId = memberService.join(member);
        System.out.println("###테스트 저장 아이디###" + savedId);
        Member member1 = memberRepository.fineOne(savedId);
        System.out.println("###테스트 찾은 아이디###" + member1.getId());

        assertEquals(savedId, member1.getId());
    }

}