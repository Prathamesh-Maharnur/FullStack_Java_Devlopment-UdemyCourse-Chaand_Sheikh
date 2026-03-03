package org.maharnur.prathamesh.specs;

import org.maharnur.prathamesh.interfaces.Engine;

public class EngineType implements Engine {
	String type;
	
	
	
	public EngineType() {
		type="Unknown";
	}

	public EngineType(String type) {
		super();
		this.type = type;
	}



	@Override
	public String specs() {
		return type;
	}

}
