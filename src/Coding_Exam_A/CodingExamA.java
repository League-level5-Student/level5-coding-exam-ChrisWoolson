package Coding_Exam_A;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		String rnums = JOptionPane.showInputDialog("How many robots?");
		 String color = JOptionPane.showInputDialog("What color? (red green or blue)");
		String snums = JOptionPane.showInputDialog("How many sides?");
		int rnum = Integer.parseInt(rnums);
		int snum = Integer.parseInt(snums);
		ArrayList<Robot> robots = new ArrayList<Robot>();
		ArrayList<Thread>threads = new ArrayList<Thread>();
		
		
		
		for (int j = 0; j < rnum; j++) {
			System.out.println(snum);
			 threads.add(new Thread(()->{
				
			Robot r = new Robot();
			//r.setSpeed(100);
			
			
			for (int i = 0; i < snum; i++) {
				r.move(20);
				r.turn(360/snum);
				
			}
			
			
			
			}));
			
		}
		
		
		/*
		for (int i = 0; i < rnum; i++) {
			robots.add(new Robot());
		}
		
		if(color.equals("red")) {
			for (int i = 0; i < rnum; i++) {
			robots.get(i).setPenColor(Color.red);
		}
		}
		if(color.equals("blue")) {
			for (int i = 0; i < rnum; i++) {
			robots.get(i).setPenColor(Color.blue);
		}
		}
		if(color.equals("green")) {
			for (int i = 0; i < rnum; i++) {
			robots.get(i).setPenColor(Color.green);
		}
		}
		/*
		for (Robot i : robots) {
			
			 threads.add(new Thread(()->{
				
			for (int j = 0; j < snum; j++) {
				i.move(5);
				i.turn(snum/360);
			}	
			
			}));
			
		}
		
		for (int i = 0; i < args.length; i++) {
			robots.get(i).setX(i*50);
		}
		*/
		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).start();
		}

	}
}
