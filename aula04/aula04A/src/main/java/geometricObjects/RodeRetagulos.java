/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricObjects;

/**
 *
 * @author lab9
 */
public class RodeRetagulos {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        
        rectangleReport(rectangle);
    }
    
    private static void rectangleReport(Rectangle ret) {
        print("\nUm retangulo " + ret.toString());
        print("\nA area é: " + ret.getArea() + " m^2");
        print("\ne o seu perimetro: " + ret.getPerimeter() + " m\n");
    }
    
    private static void print (String s) {
        System.out.print(s);
    }
}
