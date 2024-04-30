package com.LibraryManagement.Base.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    @Column(unique = true, nullable = false)
    private String authorName;

    private String authorAddress;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

}
