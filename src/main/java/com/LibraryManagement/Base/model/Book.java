package com.LibraryManagement.Base.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(nullable = false)
    private String bookName;

    @Column(nullable = false)
    private String publicationYear;

    @Column(nullable = false)
    private Double bookPrice;

    @Column(nullable = false)
    private String edition;

    @Column(nullable = false)
    private String category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @CreationTimestamp
    private LocalDateTime insertionTime;
    @UpdateTimestamp
    private LocalDateTime deletionTime;
}
