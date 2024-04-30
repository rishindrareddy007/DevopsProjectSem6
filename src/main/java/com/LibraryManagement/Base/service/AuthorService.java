package com.LibraryManagement.Base.service;

import com.LibraryManagement.Base.model.Author;
import com.LibraryManagement.Base.repository.AuthorRepo;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    public Author addNewAuthor(Author author) {
        return authorRepo.save(author);
    }

    public Author fetchAuthorDetailsByName(String authorName) {
        return authorRepo.findByAuthorName(authorName);
    }
}
