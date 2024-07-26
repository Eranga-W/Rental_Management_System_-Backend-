package org.icet.crm.controller;

import lombok.RequiredArgsConstructor;
import org.icet.crm.dto.Items;
import org.icet.crm.service.ItemService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/item-controller")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {
    final ItemService service;
    @PostMapping("/add-item")
    public void addItem(@RequestBody Items items){
        service.addItem(items);
    }
}
