package com.peploleum.jeecdi.service;

import javax.enterprise.inject.Alternative;

@Alternative
public class SomethingServiceBean implements SomethingService {

	@Override
	public String getSomething() {
		return "something";
	}

}
