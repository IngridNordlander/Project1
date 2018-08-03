package Projekt1;

public class Circle {
    
    private final double PI = 3.1415;
    private double radie;
    
        //Constructor:
    public Circle(double radie) { //Sent in from main:  Cirkel c = new Cirkle(p);
    this.radie = radie;
    } 
    public double getRadie() {
        return radie;
    }
    public void setRadie(double radie) {
        this.radie = radie;
    }  //End Constructor
//_______________________________________________________________________
    
    public double area() {
        double area = PI * radie * radie;
        return area;

    }
    public double omkrets() {
        double omkrets = PI * radie * 2;
        return omkrets;
    }
   
}    