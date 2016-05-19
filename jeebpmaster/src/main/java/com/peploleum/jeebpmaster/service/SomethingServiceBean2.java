package com.peploleum.jeebpmaster.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.peploleum.jeebpmaster.dao.DaoService;

@Default
public class SomethingServiceBean2 implements SomethingService {

	@Inject
	private DaoService daoService;
	private String requestInfo;

	@Override
	public String getSomething() {
		return this.daoService.produceData() + " added 2 " + this.requestInfo;
	}

	@Override
	public void setRequestInfo(final String requestInfo) {
		this.requestInfo = requestInfo;

	}

}
