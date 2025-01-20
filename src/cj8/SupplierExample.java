package cj8;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
public static void main(String[] args) {
	
	//Random Integer
	Supplier<Integer>randomNumber=()->new Random().nextInt(100);
	  System.out.println("Random Number 1: " + randomNumber.get());
      System.out.println("Random Number 2: " + randomNumber.get());


        // date and time
      Supplier<LocalDateTime>currentDateTimeSupplier=()->LocalDateTime.now();
      
      System.out.println("current time is "+currentDateTimeSupplier.get());
      
      
      Supplier<String>greet=()->"hi this is krishna";
      System.out.println(greet.get());



}
}
