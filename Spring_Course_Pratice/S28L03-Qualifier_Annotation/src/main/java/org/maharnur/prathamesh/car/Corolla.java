package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	
	@Override
	public void specs() {
		System.out.println("Sedan from Toyata has engine: "+engine.specs());
	}

}
