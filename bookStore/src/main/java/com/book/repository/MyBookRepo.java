package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.entity.MyBookList;

@Repository
public interface MyBookRepo extends JpaRepository<MyBookList, Integer>{

}
