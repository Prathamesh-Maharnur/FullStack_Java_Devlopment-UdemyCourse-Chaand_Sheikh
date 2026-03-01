package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public void specs() {
		System.out.println("Sedan form Toyota");

	}

}
