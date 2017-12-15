/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestDeliveryMan;

/**
 *
 * @author USER
 */
import java.util.*;

public class testMenu {

    public static void main(String[] args) {
        boolean selection = true;
        String ans;
        int choose;
        Food food = new Food();
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Selection the module you wish?");
            System.out.println("1. Add Food");
            System.out.println("2. Remove Food");
            System.out.println("3. Updates the Food Details");
            System.out.println("4. Exit");
            System.out.println("Selection:");
            choose = reader.nextInt();
            switch (choose) {
                case 1:
                    do {

                        food.addFood();

                        food.showFood();

                        System.out.print("Do you want to continous adding menu?(Y/N):");
                        ans = reader.next();
                        String answ = ans.toUpperCase();
                        if (answ.equals("Y")) {
                            selection = true;
                         
                        } else if (answ.equals("N")) {
                            selection = false;
                      
                            break;
                        } else {
                            //repleac the que.
                        }
                    }while (selection == true);
                    
                    break;
                case 2:
                    do {
                        food.showFood();
                        food.removeFood();
                        System.out.print("Do you want to continous  menu?(Y/N):");
                        ans = reader.next();
                        String answ = ans.toUpperCase();
                        if (answ.equals("Y")) {
                            selection = true;
                         
                        } else if (answ.equals("N")) {
                            selection = false;
                      
                              
                            break;
                        } else {
                            //repleac the que.
                        }
                        
                    } while (selection == true);
                    break;

                case 3:
                    //TODO:Update the detail of menu2
                    break;
                case 4:
                    System.out.println("Thank for using this system.");
                    break;

                default:
                    System.out.println("Only can enter 1 to 5, please try agian ,thank you");
                    break;
            }
        } while (choose != 4);

    }

}
