import java.io.*;
import java.util.*;



public abstract class Polygon {

protected int n; 
protected double[] sides; 
protected double area;

/*Constructor*/ 
public Polygon(int nb) {
n = nb;
sides = new double[n]; 

}

//Method
public double getArea() {
 
 
return this.area;

}

abstract public void calArea();
}
