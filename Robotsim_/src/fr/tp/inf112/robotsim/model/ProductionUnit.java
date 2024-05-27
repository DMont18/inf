package fr.tp.inf112.robotsim.model;
import java.util.Arrays;


public class ProductionUnit extends Component {
    
    private double rate;
    
    public ProductionUnit(String name, double posX, double posY, double[] dimension, double rate) {
        super(name, posX, posY, dimension);
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
   
    @Override
    public String toString() {
        return "BondConveyor [name= " + name + ", posX= " + posX + ", posY= " + posY + ", dimension = " + Arrays.toString(dimension) + ", production rate =" + rate + "]";
    }
}
