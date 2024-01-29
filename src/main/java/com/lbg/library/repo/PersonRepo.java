package com.lbg.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbg.library.domain.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
