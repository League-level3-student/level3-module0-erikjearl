package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			
		//2. create an array of 5 robots.
			Robot[] r = new Robot[5];
		//3. use a for loop to initialize the robots.
			int add = 75;
			for(int i = 0; i < r.length; i++) {
				r[i] = new Robot();
				r[i].setSpeed(100);
				r[i].setX(add);
				r[i].setY(550);
				add+=800/r.length;
			}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
			
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
			Random rand = new Random();
			boolean finished = false;
			int winner = 0;
			while(!finished) {
				for(int i =0; i < r.length; i++) {
					if(r[i].getY() > 0) {
						r[i].move(rand.nextInt(50));
					}else {
						winner = i+1;
						finished = true;
						break;
					}
				}
			}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			
		//7. declare that robot the winner and throw it a party!
			System.out.println("Robot " + winner + " won the race");
		//8. try different races with different amounts of robots.
			
	    //9. make the robots race around a circular track.
			
	}
	
}
