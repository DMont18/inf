package fr.tp.inf112.robotsim.model;

import java.util.ArrayList;

public class Factory {
	
	private String name;
	private ArrayList<Robot> robots;
	
	public Factory(String name) {
		this.name = name;
		this.robots = new ArrayList<>();
	}
	
	public boolean addRobot(String name) {
		if (checkRobotName(name) == true) {
			robots.add(new Robot(name, 0));
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkRobotName(String name) {
		for (Robot myRobot : robots) {
			if (myRobot.name.equals(name)) {
				return false;
			}
		}
		return true;
	}
	
	public void printToConsole() {
		System.out.println("Usine : " + name);
		if (robots.isEmpty() == true) {
			System.out.println("Aucun robots");
		} else {
			for (Robot myRobot : robots) {
				System.out.println("Robot : " + myRobot);
			}
		}
	}
}
