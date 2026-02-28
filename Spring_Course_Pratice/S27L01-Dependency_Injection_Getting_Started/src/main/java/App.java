import org.maharnur.prathamesh.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.maharnur.prathamesh.car.Swift;
//import org.maharnur.prathamesh.car.Corolla;

public class App {
		public static void main(String[] args) {
			
			// We cannot change the object reference from Swift to Corrolla or vice versa at Runtime
			/*
			Car car1 = new Swift();
			car1.specs();
			
			Car car2 = new Corolla();
			car2.specs();
			*/
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			Car myCar = context.getBean(Car.class);
			myCar.specs();
			context.close();
			
		}
}
