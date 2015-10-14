package com.peploleum.jeebpmaster.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.peploleum.jeebpmaster.dao.DaoService;

@Default
public class SomethingServiceBean2 implements SomethingService {

	@Inject
	private DaoService daoService;

	@Override
	public String getSomething() {
		return daoService.produceData() + " added 2";
	}

}
