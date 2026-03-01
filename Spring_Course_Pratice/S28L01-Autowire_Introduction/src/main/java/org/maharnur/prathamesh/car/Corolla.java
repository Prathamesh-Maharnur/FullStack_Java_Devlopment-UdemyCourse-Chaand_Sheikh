package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// by default component has lowercase classname - "corolla"
@Component("Corolla")
public class Corolla implements Car {
	// required =false makes if bean found inject else don't throw exception 
	@Autowired(required = false)
	Engine engine;
	
	@Override
	public void specs() {
			System.out.println("Sedan from Toyota with engine as: "+engine.type);
	}

}
