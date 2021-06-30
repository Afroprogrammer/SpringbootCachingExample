package com.example.springbootcachingex.model;

public interface BookRepository {

    Book getByIsbn(String isbn);

}