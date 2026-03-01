import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("swift", Car.class);
		myCar.specs();
		context.close();

	}

}
