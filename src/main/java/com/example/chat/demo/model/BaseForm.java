package com.example.chat.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class BaseForm implements Serializable {
    private Long id;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
