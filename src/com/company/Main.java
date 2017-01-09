package com.company;

import java.util.Scanner;

public class Main extends pricing{

    public static void main (String[] args) {
	// write your code here

        Scanner picking = new Scanner(System.in);
        System.out.println("Are you a member, guest, or employee");
        String answer = picking.next();

        pricing whichStatus = new pricing();
        double finalPrice = whichStatus.PriceOut(answer);
        System.out.println("$"+finalPrice + " is your monthly expense");


  


    }
}
