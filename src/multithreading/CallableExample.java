package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
public static void main(String[] args) {
	  ExecutorService executor = Executors.newSingleThreadExecutor();
	  Callable<String> task = () -> {
          Thread.sleep(1000); 
          return "Task completed!";
      };
      
      try {
          Future<String> result = executor.submit(task);
          System.out.println("Result: " + result.get()); // Wait for the task to finish
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          executor.shutdown();
      }
      
      
      
      
      
      
      
      
      
      
}
}
