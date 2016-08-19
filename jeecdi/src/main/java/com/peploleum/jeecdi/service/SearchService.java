package com.peploleum.jeecdi.service;

import java.util.List;

public interface SearchService {
	List<SearchDto> getResult();

	SearchDto getResultById(String id);

	List<SearchDto> getResultsByContent(String content);
}
