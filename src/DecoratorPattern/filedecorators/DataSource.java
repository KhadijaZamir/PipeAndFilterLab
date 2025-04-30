/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern.filedecorators;

/**
 *
 * @author khadi
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
