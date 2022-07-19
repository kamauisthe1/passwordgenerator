import java.util.Random;
import javax.swing.*;
import java.util.*;

import javax.swing.JOptionPane;

public class main {

	
	public static String teste(String[] args) {
		// TODO Auto-generated method stub
		//generate a new password
		 	String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		    String numbers = "0123456789";
		    String randomc = "!@$%&/()=?»«´+~.,-";

		    // combine all strings
		    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers + randomc;

		    // create random string builder
		    StringBuilder sb = new StringBuilder();

		    // create an object of Random class
		    Random random = new Random();

		    // specify length of random string
		    int max = 20;
		    int min = 10;
		    
		    //generate a random int between max and min
		    int randomint = (int)Math.floor(Math.random()*(max-min+1)+min);
		    int length = randomint;

		    for(int i = 0; i < length; i++) {

		      // generate random index number
		      int index = random.nextInt(alphaNumeric.length());

		      // get character specified by index
		      // from the string
		      char randomChar = alphaNumeric.charAt(index);

		      // append the character to string builder
		      sb.append(randomChar);
		    }

		    String randomString = sb.toString();
		    String generated = randomString;
		    return generated;
	}
		    

			public static void main(String[] args) {
		//made by kamau
		    //create a warning message with presentation
		JOptionPane.showMessageDialog(null , "made by kamau" , "Password Generator by kamau" , JOptionPane.WARNING_MESSAGE);
		
		//would you like to generate prompt
		int dialogButton = JOptionPane.showConfirmDialog(null , "Would you like to generate a strong password?" , "Password Generator by kamau" , JOptionPane.YES_NO_CANCEL_OPTION);
		
		//if yes
		if(dialogButton == JOptionPane.YES_OPTION) {
			ProgressBarDemo demo = new ProgressBarDemo();
				
			
			
		}
		//if not or cancel
		else {
			System.exit(0);
		}
		
		
	}
	

}
