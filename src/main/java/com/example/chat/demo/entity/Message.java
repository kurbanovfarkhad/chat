package com.example.chat.demo.entity;

import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message extends BaseEntity {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
