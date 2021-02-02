package momo.springframework.spring5recipeapp.controllers;

import momo.springframework.spring5recipeapp.service.RecipeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeServiceImpl recipeService;

    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPag(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
