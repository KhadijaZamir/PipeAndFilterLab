/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author khadi
 */
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border and price");
      circle.draw();
      System.out.println(circle.getPrice());

      System.out.println("\nCircle of red border an its price");
      redCircle.draw();
       System.out.println(redCircle.getPrice());

      System.out.println("\nRectangle of red border and its price");
      redRectangle.draw();
      System.out.println(redRectangle.getPrice());
   }
}