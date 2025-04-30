/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern.filedecorators;

/**
 *
 * @author khadi
 */
//import refactoring_guru.decorator.example.decorators.*;
import DecoratorPattern.filedecorators.CompressionDecorator;
import DecoratorPattern.filedecorators.EncryptionDecorator;
import DecoratorPattern.filedecorators.FileDataSource;
import DecoratorPattern.filedecorators.DataSource;
import DecoratorPattern.filedecorators.DataSourceDecorator;


public class Demo {
    public static void main(String[] args) {
        new java.io.File("out").mkdirs(); 

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
