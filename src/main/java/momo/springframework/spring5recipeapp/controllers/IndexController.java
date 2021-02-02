package momo.springframework.spring5recipeapp.controllers;

import momo.springframework.spring5recipeapp.domain.Category;
import momo.springframework.spring5recipeapp.domain.UnitOfMeasure;
import momo.springframework.spring5recipeapp.repositories.CategoryRepository;
import momo.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPag() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("Unit of measure id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
