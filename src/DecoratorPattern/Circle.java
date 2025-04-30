/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author khadi
 */
public class Circle implements Shape {
    private double price = 10.0;

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

    @Override
    public double getPrice() {
        return price;
    }
}