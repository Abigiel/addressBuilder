package com.pluralsight;
import java.util.Scanner;
import java.lang.*;

public class addressBuilder {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please provide the following information.");
        System.out.println("Full name: ");
        String fullName= myScanner.nextLine();
        System.out.println("Billing Street: ");
        String billingStreet= myScanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity= myScanner.nextLine();
        System.out.println("Billing State: ");
        String billingState= myScanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip= myScanner.nextLine();
        System.out.println("Shipping Street: ");
        String shipStreet= myScanner.nextLine();
        System.out.println("Shipping City: ");
        String shipCity= myScanner.nextLine();
        System.out.println("Shipping State: ");
        String shipState= myScanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shipZip= myScanner.nextLine();

        StringBuilder address =new StringBuilder();
        address.append(fullName + "\n");
        address.append("Billing Address: \n");
        address.append(billingStreet+ "\n");
        address.append(billingCity +", "+ billingState +" "+ billingZip +"\n");
        address.append("Shipping Address: \n");
        address.append(shipStreet+ "\n");
        address.append(shipCity +", "+ shipState +" "+ shipZip + "\n");

        String outAddress = address.toString();
        System.out.println(outAddress);

    }
}
