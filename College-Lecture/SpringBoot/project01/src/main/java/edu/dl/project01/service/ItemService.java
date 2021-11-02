package edu.dl.project01.service;

import edu.dl.project01.domain.Member;
import edu.dl.project01.domain.item.Item;
import edu.dl.project01.repository.ItemRepository;
import edu.dl.project01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //JPA서비스는 트랜잭션 내에서 실행
@Transactional(readOnly = true) //읽기 성능 최적화
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }
}
