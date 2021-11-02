package edu.dl.project01.controller;

import edu.dl.project01.domain.item.Item;
import edu.dl.project01.domain.item.PC;
import edu.dl.project01.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping(value = "/items/new")
    public String createForm(Model model) {
        model.addAttribute("form", new PCForm());
        return "item/createItemForm";
    }

    @PostMapping(value = "/items/new")
    public String create(PCForm form) {
        PC pc = new PC();
        pc.setName(form.getName());
        pc.setPrice(form.getPrice());
        pc.setStockQuantity(form.getStockQuantity());
        pc.setManufacturer(form.getManufacturer());
        pc.setSerialNumber(form.getSerialNumber());
        itemService.saveItem(pc);
        return "redirect:/items";
    }

    @GetMapping(value = "/items")
    public String list(Model model) {
        List<Item> items = itemService.findItems();
        model.addAttribute("items", items);
        return "item/itemList";
    }

}
