package org.maharnur.prathamesh.specs;

import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V8Engine")
public class V8 implements Engine{

	@Override
	public String specs() {
		return "V8";
	}

}
