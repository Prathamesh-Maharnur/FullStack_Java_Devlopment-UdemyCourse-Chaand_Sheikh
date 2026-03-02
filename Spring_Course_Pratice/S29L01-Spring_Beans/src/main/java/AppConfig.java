import org.maharnur.prathamesh.car.Corolla;
import org.maharnur.prathamesh.car.Swift;
import org.maharnur.prathamesh.specs.V6;
import org.maharnur.prathamesh.specs.V8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.maharnur.prathamesh")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8();
	}
}
