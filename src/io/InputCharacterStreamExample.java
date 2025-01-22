package io;

import java.io.FileReader;
import java.io.IOException;

public class InputCharacterStreamExample {
public static void main(String[] args) {
	  try (FileReader fr = new FileReader("example.txt")) {
          int data;
          while ((data = fr.read()) != -1) {
              System.out.print((char) data);  // print each character
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
}
}
