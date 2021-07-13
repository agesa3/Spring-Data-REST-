package com.agesadev.springdatarest.repository;

import com.agesadev.springdatarest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "library" ,path = "library")
public interface BookRepository extends JpaRepository<Book,Integer> {

}
