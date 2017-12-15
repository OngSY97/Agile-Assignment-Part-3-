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
public class fastDeliveryMan {
    private static Affiliate affiliate;
    
    public static void registerAffiliate(){
        //this method is for restaurant onwer to register as an affiliate
        
        Scanner reader = new Scanner(System.in);
        
        String ownerName, restaurantName, address;
        
        System.out.println("Enter owner name: ");
        ownerName = reader.nextLine();
        System.out.println("Enter restaurant name: ");
        restaurantName = reader.nextLine();
        System.out.println("Enter address of restaurant: ");
        address = reader.nextLine();
        
        if(!ownerName.equals("") && !restaurantName.equals("") && !address.equals("")){
            affiliate = new Affiliate(ownerName,"B001", restaurantName, address);
            //continue here
            //save in to .dat file
        }
        else{
            System.out.println("Please do not leave blank");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        registerAffiliate();
        System.out.println(affiliate.toString());
    }
    
}
