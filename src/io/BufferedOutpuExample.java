package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedOutpuExample {
public static void main(String[] args) {
	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
         bw.write("This is a buffered writer example!");
     } catch (IOException e) {
         e.printStackTrace();
     }
}
}
