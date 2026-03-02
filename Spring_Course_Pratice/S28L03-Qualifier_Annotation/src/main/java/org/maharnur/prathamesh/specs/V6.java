package org.maharnur.prathamesh.specs;

import org.maharnur.prathamesh.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class V6 implements Engine{

	@Override
	public String specs() {
		return "V6";
	}

}
