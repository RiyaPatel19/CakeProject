package com.sheryians.major.repository;

import com.sheryians.major.model.Category;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
