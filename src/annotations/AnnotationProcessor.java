package annotations;
import java.lang.reflect.Method;

class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        for (Method method : Service.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Log.class)) {
                System.out.println("Executing: " + method.getName());
                method.invoke(new Service());
            }
        }
    }
}
