package fastestDeliveryMan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Affiliate {
    private String ownerName;
    private String affiliateID;
    private String restaurantName;
    private String restaurantAddress;
    
    public Affiliate(){
        
    }
    public Affiliate(String ownerName , String affiliateID , String restaurantName ,String restaurantAddress){
        this.ownerName = ownerName;
        this.affiliateID=affiliateID ;
        this.restaurantName= restaurantName ;
        this.restaurantAddress= restaurantAddress;
    }
    public void setOwnerName(String ownerName){
        this.ownerName =ownerName;
    }
    public void setAffiliateID (String affiliateID ){
        this.affiliateID=affiliateID ;   
    }
    public void setRestaurantName(String restaurantName ){
        this.restaurantName= restaurantName ; 
    }
    public void setRestaurantAddress(String restaurantAddress){
        this.restaurantAddress= restaurantAddress;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getAffiliateID(){
        return affiliateID;
    }
    public String getRestaurantName(){
        return restaurantName;
    }
    public String getRestaurantAddress(){
        return restaurantAddress;
    }
    public String toString(){
        return "Onwer Name: " + ownerName +
                "\nAffiliateID:" + affiliateID+
                "\nRestaurant Name: " + restaurantName +
                "\nAddress: " + restaurantAddress;
    }
}
