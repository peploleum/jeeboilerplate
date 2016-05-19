package com.peploleum.jeecdi.service;

import javax.enterprise.inject.Default;

@Default
public class SomethingServiceBean2 implements SomethingService {

	@Override
	public String getSomething() {
		return "something2";
	}

}
