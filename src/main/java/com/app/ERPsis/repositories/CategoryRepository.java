package com.app.ERPsis.repositories;

import com.app.ERPsis.model.Category;
import com.app.ERPsis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
