package momo.springframework.spring5recipeapp.repositories;

import momo.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
