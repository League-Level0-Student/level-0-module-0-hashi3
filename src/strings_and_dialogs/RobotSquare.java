package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
    	
    	Robot jama = new Robot();
    	jama.turn(90);
    	String hashi = JOptionPane.showInputDialog("sides");
    	int Slide= Integer.parseInt(hashi);
    	for (int i = 0; i < Slide ; i++) { 
    	    jama.setSpeed(15);
    	    jama.penDown();
    		jama.move(80);
    		jama.turn(360/Slide);
    		
    	
   
    
    	}
    
    
    	
 
    	// 1. Make a new Robot


        // 3. Put the robot's pen down


        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
