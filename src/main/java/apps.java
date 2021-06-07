/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {

        double price1=calculatePrice(1);
        double price2=calculatePrice(2);
        double price3=calculatePrice(3);

        double subtotal=price1+price2+price3;
        double tax=(subtotal*0.055);
        double finaltotal=subtotal+tax;
        finaltotal=Math.round(finaltotal*100.0)/100.0;

        System.out.print("Subtotal: $"+subtotal+"\nTax: $"+tax+"\ntotal: $"+String.format("%.2f", finaltotal));


    }


    public static double calculatePrice(int numItem){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the price of item "+numItem+": ");
        String price=in.nextLine();

        System.out.print("Enter the quantity of item "+numItem+": ");
        String quantity= in.nextLine();

        int priceNum=Integer.parseInt(price);

        int quantityNum=Integer.parseInt(quantity);

        double totalPrice=(double)priceNum*(double)quantityNum;

        return totalPrice;
    }
}
