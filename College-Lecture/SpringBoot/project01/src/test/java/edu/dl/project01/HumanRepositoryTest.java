package edu.dl.project01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HumanRepositoryTest {
    @Autowired HumanRepository humanRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testHuman(){
        //객체 생성
        Human human = new Human();
        human.setName("Alan");

        //객체 저장 -> DB
        Long savedId = humanRepository.save(human);
        //객체 조회 <- DB
        Human fineHuman = humanRepository.find(savedId);

        //테스트
        Assertions.assertEquals(fineHuman.getId(), human.getId());
        Assertions.assertEquals(fineHuman.getName(), human.getName());
    }
}