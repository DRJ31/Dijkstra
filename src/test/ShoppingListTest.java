package test;

import model.EmptyIngredientNameException;
import model.Ingredient;
import model.InvalidIngredientAmountException;
import model.ShoppingList;
import org.junit.Before;
import org.junit.Test;
import utils.UnitEnum;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShoppingListTest {

    private static ShoppingList shoppingList;
    ArrayList<Ingredient> missingIngredients = new ArrayList<Ingredient>();

    @Before
    public void setUp() throws Exception {
        shoppingList = new ShoppingList(missingIngredients);
    }

    @Test
    public void calculateMissingIngredientAmount() {
        assertEquals(2.0,shoppingList.calculateMissingIngredientAmount(3.0,5.0),0.01);
    }

    @Test
    public void getMissingIngredients(){
        assertEquals(missingIngredients,shoppingList.getMissingIngredients());
    }

    @Test
    public void addMissingIngredient() {
        Ingredient ingredient;
        try {
            ingredient = new Ingredient(1, "yeast", 100.0, UnitEnum.GRAM);
            shoppingList.addMissingIngredient(ingredient);
            assertEquals(ingredient,shoppingList.getMissingIngredients().get(0));
        } catch (EmptyIngredientNameException | InvalidIngredientAmountException e) {
            e.printStackTrace();
        }
    }
}