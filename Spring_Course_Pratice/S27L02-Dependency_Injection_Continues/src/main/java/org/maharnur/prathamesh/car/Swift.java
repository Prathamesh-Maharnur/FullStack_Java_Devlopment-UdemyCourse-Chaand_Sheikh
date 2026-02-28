package org.maharnur.prathamesh.car;

import org.maharnur.prathamesh.interfaces.Car;
import org.springframework.stereotype.Component;

@Component
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Hatchback from Suzuki");
		
	}

}
