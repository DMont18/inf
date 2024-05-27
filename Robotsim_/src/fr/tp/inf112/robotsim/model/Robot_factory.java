package fr.tp.inf112.robotsim.model;
import java.util.Arrays;


public class Robot_factory extends Component {
    
    private double speed;
	private boolean enable;
	private int battery;
	private short poste;
    
    public Robot_factory (String name, double posX, double posY, double[] dimension, double speed, boolean enable, int battery, short poste) {
        super(name, posX, posY, dimension);
        this.speed = speed;
        this.enable = enable;
        this.battery = battery;
        this.poste = poste;
    }
    
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    
    public boolean getState() {
        return enable;
    }
    
    public void setState(boolean enable) {
        this.enable = enable;
    }
    
    
    public int getBattery() {
        return battery;
    }
    
    public void setBattery(int battery) {
        this.battery = battery;
    }

    
    public short getPoste() {
        return poste;
    }
    
    public void setPoste(short poste) {
        this.poste = poste;
    }
    
    
    @Override
    public String toString() {
        return "BondConveyor [name= " + name + ", posX= " + posX + ", posY= " + posY + ", dimension = " + Arrays.toString(dimension) + ", speed =" + speed + "state = " + enable + "battery = " + battery + "poste = " + poste + "]";
    }
}
