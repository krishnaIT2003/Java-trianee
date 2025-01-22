package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputExample {
public static void main(String[] args) {
	 try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);  // reads a whole line at a time
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
}
}
