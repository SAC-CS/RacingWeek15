/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingweek15;

/**
 *
 * @author uyen
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author uyen
 */
import java.util.ArrayList;

import java.util.Scanner;

import java.util.InputMismatchException;

public class RacingWeek15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfDice=0;
        Truck_SubClass Truck = new Truck_SubClass(2000,"Ford","F150","Big Truck",3);
        Thread t1 = new Thread(Truck);
        Van_SubClass Van = new Van_SubClass(2010,"Dodge","Ram","R1500",4);
        Thread t2 = new Thread(Van);
        Sport_SubClass Sportcar = new Sport_SubClass(1990,"Chevy","Impala","Deer",6);
        Thread t3 = new Thread(Sportcar);
        try{
            System.out.println("Enter the number of dices to throw:");
            numberOfDice=input.nextInt();
        }
        catch(InputMismatchException inputMismatchException)
        {
            System.err.printf("\nException: %s\n",inputMismatchException);
            System.out.println("You cannot enter a leter. Please try again.");
        }
        int RaceCycles=Dice.Throw(numberOfDice);
        System.out.printf("Race Cycles %d",RaceCycles);
       /* Truck.SetCycle(RaceCycles);
        Van.SetCycle(RaceCycles);
        Sportcar.SetCycle(RaceCycles);
        t1.start();
        t2.start();
        t3.start();*/
        String RaceStatus1 = "";
        String RaceStatus2 = "";
        String RaceStatus3 = "";
        String RaceStatus = "";
        t1.start();
        for(int cycle=1; cycle<=RaceCycles;cycle++)
        {
            Truck.SetCycle(cycle);
            Truck.setSound();
            if(RaceCycles-cycle==1)
                System.out.println("Race in Yellow flag!");
            System.out.println(Truck.toString());
            System.out.println("Race Cycle:" + Integer.toString(cycle));
            System.out.println(RaceStatus);
        }
        t2.start();
        for(int cycle=1; cycle<=RaceCycles;cycle++)
        {
            Van.SetCycle(cycle);
            Van.setSound();
            if(RaceCycles-cycle==1)
                System.out.println("Race in Yellow flag!");
            System.out.println(Van.toString());
            System.out.println("Race Cycle:" + Integer.toString(cycle));
            System.out.println(RaceStatus);
        }
        t3.start();
        for(int cycle=1; cycle<=RaceCycles;cycle++)
        {
            Sportcar.SetCycle(cycle);
            Sportcar.setSound();
            if(RaceCycles-cycle==1)
                System.out.println("Race in Yellow flag!");
            System.out.println(Sportcar.toString());
            System.out.println("Race Cycle:" + Integer.toString(cycle));
            System.out.println(RaceStatus);
        }
        RaceStatus1 = Truck.GetName() + ": Distance Travel= " + Truck.GetDistance() + "\t";
        RaceStatus2 = Van.GetName() + ": Distance Travel= " + Van.GetDistance() + "\t";
        RaceStatus3 = Sportcar.GetName() + ": Distance Travel= " + Sportcar.GetDistance() + "\t";
        System.out.println("Race Result");
        System.out.println(RaceStatus1);
        System.out.println(RaceStatus2);
        System.out.println(RaceStatus3);
        System.out.println("Goodbye!");
    }
}