/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesfrangostigres;

/**
 *
 * @author lab9
 */
public class interfacesFrangosTrigres {
    public static void main(String[] args) {
        Object[] objetos = {
            new Tiger(),
            new Chicken(),
            new Apple(),
            new Orange()
        };
        
        for (Object item : objetos) {
            if (item instanceof Edible) {
            print(((Edible)item).howtoEat());
            }
            
            if (item instanceof Animal) {
                print(((Animal)item).sound());
            }
        }
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
