package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int userSelection = 0;
        String cusName;
        String cusPhnNum;
        String cusContact;
        String cusSaved;



        while (userSelection < 1 || userSelection > 2){
            System.out.println("Please select which type of customer to enter.");
            System.out.println("1. Residential");
            System.out.println("2. Business");
            userSelection = getSelection("Please select 1 or 2: ");

            switch (userSelection) {
                case 1:
                    cusName = getInformation("Please Enter the name of the customer: ");
                    cusPhnNum = getInformation("Please enter the customer's phone number: ");
                    cusSaved = customerInfo(cusName, cusPhnNum);
                    System.out.println(cusSaved);
                    break;
                case 2:
                    cusName = getInformation("Please Enter the name of the customer: ");
                    cusPhnNum = getInformation("Please enter the customer's phone number: ");
                    cusContact = getInformation("Please enter the name of the contact for this customer: ");
                    cusSaved = customerInfo(cusName, cusPhnNum, cusContact);
                    System.out.println(cusSaved);
                    break;
                default:
                    System.out.println("You have entered an invalid selection.");
            }

        }
    }
    private static String customerInfo(String resName, String resPhone){
        String saved = "Customer info has been saved";
        System.out.println("You have entered: ");
        System.out.println(resName);
        System.out.println(resPhone);
        return saved;
    }
    private static String customerInfo(String busName, String busPhone, String busContact){
        String saved = "Customer info has been saved";
        System.out.println("You have entered: ");
        System.out.println(busName);
        System.out.println(busContact);
        System.out.println(busPhone);
        return saved;
    }

    private static int getSelection(String sLabel){
        int nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();
        return nItem;
    }

    private static String getInformation(String sLabel){
        String nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.next();
        return nItem;
    }


}
