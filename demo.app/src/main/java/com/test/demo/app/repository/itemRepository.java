package com.test.demo.app.repository;

import com.test.demo.app.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<Item, Long> {
    // Optional: eigene Query-Methoden
}