package edu.dl.project01.controller;

import edu.dl.project01.domain.item.PC;
import edu.dl.project01.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class updateItemForm {
    private final ItemService itemService;

    @GetMapping(value = "/items/{itemId}/edit")
    public String updateItemForm(@PathVariable("itemId") Long itemId, Model model) {
        PC item = (PC) itemService.findOne(itemId);

        PCForm form = new PCForm();

        form.setId(item.getId());
        form.setName(item.getName());
        form.setPrice(item.getPrice());
        form.setStockQuantity(item.getStockQuantity());
        form.setManufacturer(item.getManufacturer());
        form.setSerialNumber(item.getSerialNumber());
        model.addAttribute("form", form);
        return "item/updateItemForm";
    }
}
