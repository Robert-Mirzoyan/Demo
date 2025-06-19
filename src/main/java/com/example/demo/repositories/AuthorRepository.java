package com.example.demo.repositories;

import com.example.demo.domain.Author;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    @Query(value = "select a.lastName from Author a where a.firstName = :name")
    Optional<Author> findByName(@Param("name") String name);
}
