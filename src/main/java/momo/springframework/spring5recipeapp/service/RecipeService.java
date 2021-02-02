package momo.springframework.spring5recipeapp.service;

import momo.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
}
