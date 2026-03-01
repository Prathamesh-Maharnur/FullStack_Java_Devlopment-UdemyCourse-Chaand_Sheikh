package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.springframework.stereotype.Component;

//by default component has lowercase classname - "corolla"
@Component("corolla")
public class Corolla implements Car {

	@Override
	public void specs() {
		System.out.println("Sedan from Toyota");
		
	}

}
