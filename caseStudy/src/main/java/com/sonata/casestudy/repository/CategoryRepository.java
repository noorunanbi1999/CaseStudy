package com.sonata.casestudy.repository;

import com.sonata.casestudy.model.Category;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
