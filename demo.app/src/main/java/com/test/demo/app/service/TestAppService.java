package com.test.demo.app.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.test.demo.app.entity.Item;
import com.test.demo.app.repository.itemRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TestAppService {
    
    @Autowired
    private itemRepository itemRepository;

    
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<Item>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    public Item getItemById(@PathVariable Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item mit ID " + id + " nicht gefunden"));
    }

}
