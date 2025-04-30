/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author khadi
 */
public class Rectangle implements Shape {
    private double price = 6;
   @Override
   public void draw() {
       
      System.out.println("Shape: Rectangle");
      
   }
   public double getPrice() {
        return price;
    }
}