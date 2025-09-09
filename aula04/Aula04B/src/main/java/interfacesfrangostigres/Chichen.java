/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesfrangostigres;

/**
 *
 * @author lab9
 */
public class Chichen extends Animal implements Edible {
    @Override
    public String sound() {
        return "coco";
    }
    
    @Override
    public String howToEat() {
        return "frito";
    }
    }

