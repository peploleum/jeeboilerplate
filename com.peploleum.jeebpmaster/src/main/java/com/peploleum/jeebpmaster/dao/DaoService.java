package com.peploleum.jeebpmaster.dao;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DaoService {

	public String produceData() {
		return "data";
	}

	@PostConstruct
	public void broadcast() {
		System.out.println("construct");
	}

}
