package com.LibraryManagement.Base.repository;

import com.LibraryManagement.Base.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer>
{

    Author findByAuthorName(String authorName);
}
