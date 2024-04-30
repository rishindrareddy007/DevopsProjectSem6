package com.LibraryManagement.Base.repository;

import com.LibraryManagement.Base.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository <Book, Integer>{
}
