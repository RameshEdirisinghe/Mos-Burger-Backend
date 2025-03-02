package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Item;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    final ItemService itemService;

    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }
}
