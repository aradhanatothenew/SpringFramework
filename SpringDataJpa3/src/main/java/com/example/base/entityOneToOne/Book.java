package com.example.base.entityOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
    private String bookName;

    @Id
    @OneToOne
    @JoinColumn(name = "author_id")
    Author author;
}
