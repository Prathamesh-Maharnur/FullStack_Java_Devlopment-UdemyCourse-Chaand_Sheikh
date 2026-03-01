import org.maharnur.prathamesh.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean("Corolla",Car.class);
		
		car.specs();
		context.close();
	}
}
