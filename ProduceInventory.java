/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceinventory;

import java.util.Scanner;

/**
 *
 * @author paul3
 */
public class ProduceInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATE Scanner
        Scanner scnr = new Scanner(System.in);

        //CREATE variables for oranges and apples
        //Variables for oranges
        int orangesOnHand = 0;
        int orangesFull = 0;
        int orangesToOrder = 0;

        //Variables for apples
        int applesOnHand = 0;
        int applesFull = 0;
        int applesToOrder = 0;

        //INPUT quantity from user of orangesOnHand
        System.out.println("Enter on hands of oranges: ");
        orangesOnHand = scnr.nextInt();

        //INPUT quantity to max of orangesFull
        System.out.println("Enter max amomunt of oranges to stock fully: ");
        orangesFull = scnr.nextInt();

        //CALCULATE amount of oranges needed to fulfill max amount
        orangesToOrder = (orangesFull - orangesOnHand);

        //INPUT quanity from user of applesOnHand
        System.out.println("Enter on hands of apples: ");
        applesOnHand = scnr.nextInt();

        //Input quantity to max of applesFull
        System.out.println("Enter max amount of apples to stock fully: ");
        applesFull = scnr.nextInt();

        //CALCULATE amount of apples needed to fulfill max amount
        applesToOrder = (applesFull - applesOnHand);

        //OUTPUT total amount of oranges and apples to order
        System.out.println("Total number of produce to order: " 
                + orangesToOrder + " Oranges" + " & "
                + applesToOrder + " Apples");
    }
}
