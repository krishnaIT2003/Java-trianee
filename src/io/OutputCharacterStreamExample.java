package io;

import java.io.FileWriter;
import java.io.IOException;

public class OutputCharacterStreamExample {
public static void main(String[] args) {
	try (FileWriter fw = new FileWriter("output.txt")) {
        fw.write("Hello, this is a character stream example!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
