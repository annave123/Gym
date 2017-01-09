package com.company;

import java.util.Scanner;

/**
 * Created by Anthony on 1/8/2017.
 */
public class pricing {
    public double PriceOut(String typeOfMember){
        Scanner picking = new Scanner(System.in);
        String answers;
        int numberofHours = 0;
        double total = 0;
        double endingNumbers =0;
        if(typeOfMember.equals("guest") || typeOfMember.equals("employee")) {
            System.out.println("Would you like to purchase a member ship");
            answers = picking.next();
            if (answers.equals("yes") && typeOfMember.equals("guest")) {
                total = total + 65;
            } else if (answers.equals("yes") && typeOfMember.equals("employee")) {
                total = total + 1;
            }
        }
        System.out.println("Do you want to take classes this month?");
        answers = picking.next();
        if(answers.equals("yes") && typeOfMember.equals("guest")){
            total = total +10;
        }
        if(answers.equals("yes") && typeOfMember.equals("member")){
            total = total +8;
        }
        if(answers.equals("yes") && typeOfMember.equals("employee")){
            total = total +3;
        }
        if(typeOfMember.equals("member") || typeOfMember.equals("employee")) {
            System.out.println("Do you want to do aquatics");
            answers = picking.next();
            if (answers.equals("yes") && typeOfMember.equals("member")) {
                total = total + 10;
            }
            if (answers.equals("yes") && typeOfMember.equals("employee")) {
                total = total + 7;
            }
        }
        System.out.println("Do you want a personal trainer?");
        answers = picking.next();
        if(answers.equals("yes")) {
            System.out.println("How many hours?");
            numberofHours = picking.nextInt();
        }
        if(typeOfMember.equals("guest")) {
            numberofHours = numberofHours * 25;
            total = total + numberofHours;
        }
        if(typeOfMember.equals("member")){
            numberofHours = numberofHours*20;
            total = total+numberofHours;

        }
        if(typeOfMember.equals("employee")) {
            numberofHours = numberofHours * 15;
            total = total + numberofHours;
        }
        if(typeOfMember.equals("member")) {
            endingNumbers = total * 0.2;
            total = total - endingNumbers;
        }
        if(typeOfMember.equals("employee")){
            endingNumbers = total *0.1;
            total = total-endingNumbers;
        }
        return total;

    }




}
