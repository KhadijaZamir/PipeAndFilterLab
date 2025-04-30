/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DecoratorPattern.filedecorators;

import java.nio.charset.StandardCharsets;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        String utf8String = new String(utf8Bytes, StandardCharsets.UTF_8);
        super.writeData(utf8String);
    }

    @Override
    public String readData() {
        String data = super.readData();
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Bytes, StandardCharsets.UTF_8);
    }
}

