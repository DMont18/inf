package fr.tp.inf112.robotsim.model;
import java.util.Arrays;


public class ChargingPoint extends Component {
    
    private boolean enable;
    
    public ChargingPoint (String name, double posX, double posY, double[] dimension, boolean enable) {
        super(name, posX, posY, dimension);
        this.enable = enable;
    }
    
    public boolean isEnable() {
        return enable;
    }
    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
   
    @Override
    public String toString() {
        return "BondConveyor [name= " + name + ", posX= " + posX + ", posY= " + posY + ", dimension = " + Arrays.toString(dimension) + ", enable = " + enable + "]";
    }
}
