package robotsim;

import java.util.ArrayList;

import fr.tp.inf112.robotsim.model.Factory;
import fr.tp.inf112.robotsim.model.Robot;

public class TestRobotSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot myRobot = new Robot("Robot 1", 5);
		System.out.println(myRobot);
		
		ArrayList<Robot> robots = new ArrayList<Robot>();
		Factory myFactory = new Factory("usineTestNumero1");
		
		myFactory.addRobot("michel");
		myFactory.addRobot("michel");
		myFactory.addRobot("michmich");
		myFactory.addRobot("michou");
		myFactory.addRobot("michie");
		myFactory.addRobot("mich");
		
		myFactory.printToConsole();
		
		
		
	}
	

}