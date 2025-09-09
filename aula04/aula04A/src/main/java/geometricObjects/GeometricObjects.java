/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricObjects;

/**
 *
 * @author lab9
 */
public class GeometricObjects {
    private String color = "branco";
    private boolean filled;
        
    public boolean isFilled () {
        return filled;
    }
        
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
