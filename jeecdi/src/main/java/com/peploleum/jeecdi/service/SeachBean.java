package com.peploleum.jeecdi.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class SeachBean implements SearchService {
    private List<SearchDto> searchDtoList;

    @PostConstruct
    private void initBean() {
        final InputStream resourceAsStream = SeachBean.class.getResourceAsStream("/searchDtoList.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            searchDtoList = mapper.readValue(resourceAsStream, new TypeReference<List<SearchDto>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SearchDto> getResult() {
        final List<SearchDto> searchDtos = searchDtoList.subList(0, 9);
        return searchDtos;
    }

    @Override
    public SearchDto getResultById(String id) {
        if (searchDtoList != null) {
            for (SearchDto searchDto : searchDtoList) {
                if (searchDto.getId().equals(id))
                    return searchDto;
            }
        }
        return null;
    }

    @Override
    public List<SearchDto> getResultsByContent(String content) {
        ArrayList<SearchDto> resultList = new ArrayList<>();
        if (searchDtoList != null) {
            for (SearchDto searchDto : searchDtoList) {
                if (searchDto.getId().contains(content))
                {
                    if (resultList.size() < 10) {
                        resultList.add(searchDto);
                    } else {
                        break;
                    }
                }
            }
        }
        return resultList;
    }
}
