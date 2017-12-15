/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestDeliveryMan;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Food {

    public String getFoodID() {
        return FoodID;
    }

    public void setFoodID(String FoodID) {
        this.FoodID = FoodID;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    private String FoodID;
    private String FoodName;
    private String FoodType;
    private double FoodPrice;

    public Food(String FoodID, String FoodName, String FoodType, double FoodPrice) {
        this.FoodID = FoodID;
        this.FoodName = FoodName;
        this.FoodType = FoodType;
        this.FoodPrice = FoodPrice;

    }

    public Food() {

    }
    private int size = 0;
    private int totalNumAdd = 1;
    private final static int Max_Size = 100;
    Food[] listFood = new Food[Max_Size];

    @SuppressWarnings("empty-statement")
    public void addFood() {

        Scanner reader = new Scanner(System.in);
        String name, type = null;
        double price;

        System.out.println("Enter the food name:");
        name = reader.nextLine();
        int selection;
        System.out.println("Select the food type:");
        System.out.println("1.Rice");
        System.out.println("2.Noodle");
        System.out.println("3.Soup:");
        System.out.println("4.Dessert");
        System.out.println("5.Drink");
        selection = reader.nextInt();
        do {
            switch (selection) {
                case 1:
                    type = "Rice";
                    break;
                case 2:
                    type = "Noodle";
                    break;
                case 3:
                    type = "Soup";
                    break;
                case 4:
                    type = "Dessert";
                    break;
                case 5:
                    type = "Drink";
                    break;
                default:
                    System.out.println("Only can enter 1 to 5, please try agian ,thank you");
                    break;
            }
        } while (selection < 1 || selection > 5);
        System.out.println("Enter the price for food");
        price = reader.nextDouble();

        if (!name.equals("") && price != 0.0) {
            listFood[size] = new Food("F000" + totalNumAdd, name, type, price);
            size++;
            totalNumAdd++;

        } else {
            System.out.println("Please do not leave any blank space");
        }
    }

    public void showFood() {
        System.out.println("FoodID" + "       " + "FoodName" + "     RM" + "FoodPrice" + "     " + "FoodType");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < size; i++) {
            System.out.println((i+1)+".  " + listFood[i].FoodID + "   " + listFood[i].FoodName + "   RM" + listFood[i].FoodPrice + "   " + listFood[i].FoodType);
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public void removeFood() {
        if (size == 0) {
            System.out.println("The menu is nothing can be removed?");

        } else {
            try {
                int positionToRemove;
                System.out.println("Please Key in the row num wish to remove it.");
                Scanner reader = new Scanner(System.in);
                positionToRemove = reader.nextInt();

                if (positionToRemove - 1 >= size) {
                    System.out.println("Error, invalid input detected");
                   
                }else{
                     for (int i = positionToRemove; i < size; i++) {
                        listFood[i - 1] = listFood[i];
                    }
                    size--;
                }
            } catch (Exception ex) {
                System.out.println("Error, invalid input detected");

            }
        }

    }

    @Override
    public String toString() {
        return null;
    }

}
