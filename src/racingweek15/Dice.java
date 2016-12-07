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
import java.util.Random;
public class Dice 
{
    private static int lastRoll=0;
    static Random random = new Random();
	
    //Generates a random number between 1 and 6
    public static int Throw()
    {
	//rolls a random number
	lastRoll = (random.nextInt(6) +1);
	return lastRoll;
    }

    //Generates a random number between 1 and 6 more than once...
    public static int Throw(int dicecount)
    {
	int dicetotal=0;
	//rolls the dice in a loop for all rolls
	for(int count=0; count<dicecount; count++)
            dicetotal=dicetotal + Dice.Throw();
	lastRoll = dicetotal;
	return lastRoll;
    }	
    
}
