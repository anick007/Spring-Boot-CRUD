package com.example.mongodb.DAO;

import com.example.mongodb.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
