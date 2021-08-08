package sampleprogram;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toBeAdded = 1234;
		int sum = 0;
		
		while (toBeAdded !=0)
		{
			sum = sum + toBeAdded%10; // modulo gives the remainder alone
			toBeAdded = toBeAdded/10;
			
			System.out.println("Sum Of The Number Is "+ sum);
			
		}

	}

}
