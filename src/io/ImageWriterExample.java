package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageWriterExample {
public static void main(String[] args) throws IOException {
	File file=new File("image1.jpg");
	
	File file2=new File("image1.png");
	
	BufferedImage image=ImageIO.read(file);
	if(image!=null) {
		ImageIO.write(image, "png", file2);
	}
}
}
