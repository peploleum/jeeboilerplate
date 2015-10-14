package com.peploleum.jeebpmaster.service;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.peploleum.jeebpmaster.dao.DaoService;

@Alternative
public class SomethingServiceBean implements SomethingService {

	@Inject
	private DaoService daoService;

	@Override
	public String getSomething() {
		return daoService.produceData();
	}

}
