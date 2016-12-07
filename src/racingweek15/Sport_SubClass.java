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

public class Sport_SubClass extends Automobile implements Runnable
{
    int RaceCycles;
    String RaceStatus = "";
    Automobile myAuto = new Automobile();
    public Sport_SubClass(int year, String make, String model, String name, int numberofgears)
    {
        super(year, make, model, name, numberofgears);
    }
    public void setRaceCycles(int loop)
    {
        RaceCycles = loop;
    }
    public int getRaceCycles()
    {
        return RaceCycles;
    }
    public void run()
    {
        System.out.println("Truck thread is running...\n");
    
        for(int cycle=1; cycle<=RaceCycles;cycle++)
        {
            myAuto.SetCycle(cycle);
            myAuto.setSound();
            if(RaceCycles-cycle==1)
                System.out.println("Race in Yellow flag!");
            System.out.println(myAuto.toString());
            System.out.println("Race Cycle:" + Integer.toString(cycle));
            System.out.println(RaceStatus);
        }
    }
}
