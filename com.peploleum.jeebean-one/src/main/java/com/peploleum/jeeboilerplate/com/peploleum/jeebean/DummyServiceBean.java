package com.peploleum.jeeboilerplate.com.peploleum.jeebean;

import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyDto;
import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyService;

public class DummyServiceBean implements DummyService {

	public DummyDto produce() {
		final DummyDto dummyDto = new DummyDto();
		dummyDto.setDummyContent("dummyContentValue1");
		dummyDto.setDummyDescription("dummyDescriptionValue1");
		return dummyDto;
	}

}
