package fr.tp.inf112.robotsim.model;
import java.util.Arrays;


public class puck extends Component {
    
	private boolean state;
	private short destination;
    
    public puck(String name, double posX, double posY, double[] dimension, boolean state, short destination) {
        super(name, posX, posY, dimension);
        this.state = state;
        this.destination = destination;
    }
    
    public short getDestination() {
        return destination;
    }
    public void setDestination(short destination) {
        this.destination = destination;
    }
    
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "BondConveyor [name= " + name + ", posX= " + posX + ", posY= " + posY + ", dimension = " + Arrays.toString(dimension) + "state = " + state + "destination = " + destination+ "]";
    }
}
