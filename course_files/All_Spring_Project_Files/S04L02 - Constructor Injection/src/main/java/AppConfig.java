import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.car.Corolla;
import org.studyeasy.car.Swift;
import org.studyeasy.specs.EngineType;




@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("UnknownEngine")
	public EngineType type() {
		return new EngineType();
	}
	
	@Bean("V6Engine")
	public EngineType V6type() {
		return new EngineType("V6 Engine");
	}


}
