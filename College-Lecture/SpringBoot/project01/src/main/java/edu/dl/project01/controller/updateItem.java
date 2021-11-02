package edu.dl.project01.controller;

import edu.dl.project01.domain.item.PC;
import edu.dl.project01.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class updateItem {
    private final ItemService itemService;

    @PostMapping(value = "/items/{itemId}/edit")
    public String updateItem(@ModelAttribute("form") PCForm form) {
        PC pc = new PC();

        pc.setId(form.getId());
        pc.setName(form.getName());
        pc.setPrice(form.getPrice());
        pc.setStockQuantity(form.getStockQuantity());
        pc.setManufacturer(form.getManufacturer());
        pc.setSerialNumber(form.getSerialNumber());
        itemService.saveItem(pc);

        return "redirect:/items";
    }
}
