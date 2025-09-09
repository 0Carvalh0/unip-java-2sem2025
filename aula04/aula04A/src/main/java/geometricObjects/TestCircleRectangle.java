/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricObjects;
import java.util.Scanner;

/**
 *
 * @author lab9
 */
public class TestCircleRectangle {
    
    public static void main (String[] args) {
        double fator,raio;
    
        Scanner input = new Scanner(System.in);
        print("Escolha um raio: ");
        raio = input.nextDouble();
    
        print("Escolha uma cor: ");
        String cor = input.next();
    
        Circle circle = new Circle(raio, cor, true);
        circleReport(circle);
        print("\nAltere o raio, multiplique por um fator: ");
        fator = input.nextDouble();
        circle.setRadius(circle.getRadius() * fator);
        
        print("Escolha uma nova cor: ");
        String novacor = input.next();
        
        circle.setColor(novacor);
        circleReport(circle);
        print("/n O raio do circulo é: "
                +circle.getRadius()+" m.");
    }
    private static void circleReport(Circle c)
    {
        print("/n Um circulo " +
              c.toString());
      
        print("/n A cor é:" +
              c.getColor());
      
        print("/n ...e o raio:" +
              c.getRadius());
        
        print("/n a area é:" +
                String.format("%.4f", c.getArea()) + " m^2");
        
        print("\n e o seu diametro e: " + c.getDiameter() + " m.");
       
   }
    
    private static void print(String s) {
        System.out.print(s);
    }
            
}
