package com.LibraryManagement.Base.controller;


import com.LibraryManagement.Base.model.Author;
import com.LibraryManagement.Base.service.AuthorService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/api/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Author> addNewAuthor(@RequestBody Author author){

        if(author != null){
            Author author1= authorService.addNewAuthor(author) ;
            if(author1 !=null){
                return new ResponseEntity<>(author1, HttpStatus.CREATED);
            }
        }
        return null;
    }

    @GetMapping("/{authorName}")
    public Author fetchAuthorByName(@PathVariable("authorid") String authorName){
        return authorService.fetchAuthorDetailsByName(authorName);
    }
}
