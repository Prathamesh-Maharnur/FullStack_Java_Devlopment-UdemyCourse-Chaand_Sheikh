package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Swift implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	
	@Override
	public void specs() {
			System.out.println("Hatchback from Suzuki has engine: "+engine.specs());
	}

}
