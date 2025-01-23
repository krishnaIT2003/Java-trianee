package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageReaderExample {
public static void main(String[] args) throws IOException {
	File inputImageFile=new File("image1.jpg");
	
	BufferedImage image=ImageIO.read(inputImageFile);
	 if (image == null) {
         System.out.println("Failed to read the image. Ensure the file format is supported.");
         return;
     }
	 else {
		 System.out.println(image);
	 }
}
}
