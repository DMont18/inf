package fr.tp.inf112.robotsim.model;
import java.util.Arrays;


public class BondConveyor extends Component {
    
    private double speed;
	private boolean state;
	private boolean direction;
    
    public BondConveyor(String name, double posX, double posY, double[] dimension, double speed, boolean state, boolean direction) {
        super(name, posX, posY, dimension);
        this.speed = speed;
        this.state = state;
        this.direction = direction;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public boolean getState() {
        return state;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public boolean getDirection() {
        return direction;
    }
    
    public void setDirection(boolean direction) {
        this.direction = direction;
    }
    
    @Override
    public String toString() {
        return "BondConveyor [name= " + name + ", posX= " + posX + ", posY= " + posY + ", dimension = " + Arrays.toString(dimension) + ", speed =" + speed + "state = " + state + "direction = " + direction+ "]";
    }
}
