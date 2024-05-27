package fr.tp.inf112.robotsim.model;

public class Robot {
	
	String name;
	
	double speed;
	public Robot(String name, double speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Je m'appelle " + name + " et j'avance à " + speed + "km/h";
	}
}
