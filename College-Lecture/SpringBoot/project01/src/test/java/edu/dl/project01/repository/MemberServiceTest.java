package edu.dl.project01.repository;

import edu.dl.project01.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback(value = false)
class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void joinMemberTest() {
        Member member = new Member();
        member.setId("mp");
        member.setName("Park");

        String saveId = memberService.join(member);
        System.out.println("##########" + saveId);

        Member member1 = memberRepository.fineone(saveId);
        System.out.println("##########" + member1.getId());

        assertEquals(saveId, member1.getId());
    }

}