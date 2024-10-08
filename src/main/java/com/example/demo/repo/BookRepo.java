package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BooksEntity;

@Repository
public interface BookRepo extends JpaRepository<BooksEntity, Integer> {

}
