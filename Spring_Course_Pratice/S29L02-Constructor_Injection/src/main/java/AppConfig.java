import org.maharnur.prathamesh.car.Corolla;
import org.maharnur.prathamesh.car.Swift;
import org.maharnur.prathamesh.specs.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.maharnur.prathamesh")
public class AppConfig {
		
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("UnknownEngine")
	public EngineType type() {
		return new EngineType();
	}
	
	@Bean("V6Engine")
	public EngineType v6type() {
		return new EngineType("V6 Engine");
	}
	
}
