/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author khadi
 */
public class RedShapeDecorator extends ShapeDecorator {
    
    private double decorationPrice = 5.0;
    
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
   public double computeCost() {
        return decoratedShape.getPrice() + decorationPrice;
    }
}