package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class Swift implements Car {

	Engine engine;
		
	@Override
	public void specs() {
		System.out.println("Hatchbatck from Suzuki has engine: "+engine.specs());
	}

}
