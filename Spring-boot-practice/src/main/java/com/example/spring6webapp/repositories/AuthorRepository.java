package com.example.spring6webapp.repositories;

import com.example.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
