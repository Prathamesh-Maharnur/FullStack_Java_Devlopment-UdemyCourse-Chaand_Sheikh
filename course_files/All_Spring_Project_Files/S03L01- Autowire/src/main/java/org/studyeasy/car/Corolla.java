package org.studyeasy.car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	@Autowired(required = false)
	Engine engine;
	
	@Override
	public void specs() {
		System.out.println("Sedan form Toyota with engine as "+engine.type);

	}

}
