package Projekt1;

import static java.lang.Math.sqrt;


public class Triangel {
      private  double x;
    private double y;
    public Triangel(double y,double x) {
        this.y = y;
        this.x = x;
    }

    public double getY() {
        return y;
    }
   
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
       
    }
      public void setX(double x) {
        this.x = x;
      }
    public double area() {
        double area = x*y/(double) 2;
        return area;

    }
    public double hypotenusan() {
        double hypotenusan = sqrt(x*x+y*y);
        return hypotenusan;

    }
    public double omkrets() {
        double omkrets = sqrt(x*x+y*y)+x+y;
        return omkrets;

    } 
}