/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesfrangostigres;

/**
 *
 * @author lab9
 */
class Chicken extends Animal implements Edible {
    @Override public String sound() {
        return "Frango: CÓ CÓ CÓ";
    };
    
    @Override public String howtoEat() {
        return "Frango: Frita";
    };
}
