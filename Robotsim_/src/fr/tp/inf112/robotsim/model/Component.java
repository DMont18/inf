package fr.tp.inf112.robotsim.model;

public class Component {
	
	public String name;
	public double posX;
	public double posY;
	public double[] dimension;
	
	public Component(String name, double posX, double posY, double[] dimension) {
		
		dimension = new double[3];
		this.name = name;
		this.posX = posX;
		this.posY = posY;
		this.dimension = dimension;
		
	}
	
}


