package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="Corolla")
public class Corolla implements Car {
	
	
	Engine engine;
	
	public Corolla(Engine engine) {
		engine.type = "V8";
		this.engine = engine;
	}
	
	@Override
	public void specs() {
		System.out.println("Sedan from Toyota has engine: "+engine.type);
	}

	@Autowired
	public void setEngine(Engine engine) {
		engine.type = "V10";
		this.engine = engine;
	}

}
