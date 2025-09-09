/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricObjects;

/**
 *
 * @author lab9
 */
public class Circle extends GeometricObjects {
    private double radius;
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
//    RETORNA A AREA
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    
//    RETORNA O DIAMETRO
    public double getDiameter() {
        return 2 * radius;
    }
    
//    RETORNA O PERIMETRO
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
