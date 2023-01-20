package OOPHomeWork;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String [][] groceryList={{"Cucumber","Avocado","Spinach","Carrots"},
                                 {"Apple","Cherry","Banana","Strawberry"},
                                 {"Milk","Yogurt","Cheese","Butter"},
                                 {"Nutella","Cookies","Cake","Muffins"}};

        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(Arrays.toString(groceryList[i]));
        }
        for (String[] shoppingList:groceryList) {
            System.out.println(Arrays.toString(shoppingList));
        }
    }
}
