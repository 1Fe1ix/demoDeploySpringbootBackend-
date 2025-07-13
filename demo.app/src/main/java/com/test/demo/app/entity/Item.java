package com.test.demo.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(length = 1, nullable = false, name = "item_name")
    private String value;

    // Getter & Setter
    public Long getItemId() {
        return itemId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value == null || value.length() != 1) {
            throw new IllegalArgumentException("Wert muss genau ein Zeichen lang sein.");
        }
        this.value = value;
    }
}

