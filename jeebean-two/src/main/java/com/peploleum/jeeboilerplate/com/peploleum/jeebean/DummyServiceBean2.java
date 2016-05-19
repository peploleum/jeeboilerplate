package com.peploleum.jeeboilerplate.com.peploleum.jeebean;

import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyDto;
import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyService;

public class DummyServiceBean2 implements DummyService {

	public DummyDto produce() {
		final DummyDto dummyDto = new DummyDto();
		dummyDto.setDummyContent("dummyContentValue2");
		dummyDto.setDummyDescription("dummyDescriptionValue2");
		return dummyDto;
	}

}
