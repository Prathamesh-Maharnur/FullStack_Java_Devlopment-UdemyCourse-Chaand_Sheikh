package org.studyeasy.car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;


public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;


	@Override
	public void specs() {
		System.out.println("Sedan form Toyota with engine as "+engine.specs());

	}




}
