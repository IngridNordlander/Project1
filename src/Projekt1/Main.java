package Projekt1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);
            System.out.print("Ange form: cirkel, rektangel eller triangel: ");
            String form = sc.nextLine();
            System.out.println("form: " + form);
          
            if (form.equals("cirkel")) {
                System.out.print("Ange radie: ");
                double p = sc.nextDouble();
                Circle c = new Circle(p);
                System.out.println("Radien är: " + c.getRadie());
                System.out.println("Ytan är: " + c.area() + " cm");
                System.out.println("Omkretsen är: " + c.omkrets() + " cm");

            } else if (form.equals("rektangel")) {
                System.out.print("Ange x-axel: ");
                double xaxel = sc.nextDouble();
                System.out.print("Ange y-axel: ");
                double yaxel = sc.nextDouble();
                Rektangel r = new Rektangel(xaxel, yaxel);
                System.out.println("sidorna är : " + r.getX() + " och " + r.getY());
                System.out.println("Ytan är: " + r.area() + " cm");
                System.out.println("Omkretsen är: " + r.omkrets() + " cm");
            } else if (form.equals("triangel")) {
                System.out.print("Ange x-axel: ");
                double xaxel = sc.nextDouble();
                System.out.print("Ange y-axel: ");
                double yaxel = sc.nextDouble();
                Triangel r = new Triangel(xaxel, yaxel);
                System.out.println("sidorna är : " + r.getX() + " och " + r.getY());
                System.out.println("Hypotenusan är: " + r.hypotenusan() + " cm");
                System.out.println("Ytan är: " + r.area() + " cm");
                System.out.println("Omkretsen är: " + r.omkrets() + " cm");
            }

          

    }
}