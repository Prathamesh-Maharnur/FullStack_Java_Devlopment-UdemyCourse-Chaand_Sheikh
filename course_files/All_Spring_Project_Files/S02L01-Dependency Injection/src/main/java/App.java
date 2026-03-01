import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
//		Car o1 = new Swift();
//		o1.specs();
//		Car o2 = new Swift();
//		o2.specs();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean(Car.class);
		myCar.specs();
		context.close();
		
	

	}

}
