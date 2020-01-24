package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
         //JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         String number = JOptionPane.showInputDialog(null, "is it a weekday?");
         
         if(number.equals("yes")) {
        	 String vacation = JOptionPane.showInputDialog(null, "are we on vaction?");
        	 if(vacation.equals("yes")) {
        		 JOptionPane.showMessageDialog(null, "Get up were on vacation!");
        	 } else {
        	 if(vacation.equals("no"));
        	 JOptionPane.showMessageDialog(null, "GET UP YOUR LATE FOR SCHOOL!");
         }
         if(number.equals("no")) {
        	 JOptionPane.showMessageDialog(null, "sleep in");
         }
         }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }

	private static void showInputDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}
