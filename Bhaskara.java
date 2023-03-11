/**
 * Bhaskara
 */
import java.util.Random;
public class Bhaskara {
    protected double a = 0;
    protected double b = 0;
    protected double c = 0;
    protected double delta = -1;
    protected void bhaskaraSolverPart1(){
        Random rand = new Random();
        while(delta <=0){
            this.a = rand.nextDouble() * 100;
            this.b = rand.nextDouble() * 100;
            this.c = rand.nextDouble() * 100;
            this.delta = (b*b) + (-4*a*c); 
        }
    }
    protected  double bhaskaraSolverForNegative(){
        double resultNegative = ((-this.b -Math.sqrt(this.delta))/(2*this.a)); 
        return resultNegative;
    }
    protected  double bhaskaraSolverForPositive(){
        double resultPositive = ((-this.b +Math.sqrt(this.delta))/(2*this.a)); 
        return resultPositive;
    }
}

