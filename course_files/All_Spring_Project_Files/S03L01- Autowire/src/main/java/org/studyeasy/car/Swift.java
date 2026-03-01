package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Hatchback form Suzuki");

	}

}
