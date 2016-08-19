package com.peploleum.jeecdi.service;

import javax.enterprise.inject.Alternative;

@Alternative
public class UserContextBean implements UserContextService {

	@Override
	public UserContextDto getSomething() {
		return new UserContextDto();
	}

}
