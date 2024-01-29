package com.lbg.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbg.library.domain.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
