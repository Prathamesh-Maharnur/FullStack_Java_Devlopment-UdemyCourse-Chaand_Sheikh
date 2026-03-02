package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Corolla implements Car {
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	
	@Override
	public void specs() {
			System.out.println("Sedan from Toyota has engine: "+engine.specs());
	}

}
