package Projekt1;


public class Rektangel {
    private  double x;
    private double y;

    public Rektangel(double y,double x) {
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
        double area = x*y;
        return area;

    }
    public double omkrets() {
        double omkrets = 2*x+2*y;
        return omkrets;

    }
}