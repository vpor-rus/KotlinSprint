package org.example.lesson_11

/*Дизайнер предоставил макет Android-приложения:
https://www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1

Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент*/

fun main() {

}

class RecipeCategory(
    val categoryDish: String,
    val nameDish: String,
    val recipeDish: MutableList<Recipe>,
    val favorites: Boolean = false,
)

class Recipe(
    val nameRecipe: String,
    val numberOfServings: Int,
    val listIngredientsDish: MutableList<Ingredients>,
)

class Ingredients(
    val id: Int,
    val nameIngredients: String,
    val quantityPerServing: Int,
)