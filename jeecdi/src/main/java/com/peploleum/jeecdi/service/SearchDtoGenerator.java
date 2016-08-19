package com.peploleum.jeecdi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class SearchDtoGenerator {
    public static void main(String[] args) throws IOException {
        final ArrayList dtoList = new ArrayList<SearchDto>();
        for (int i = 0; i < 10000; i++) {
            final SearchDto searchDto = new SearchDto();
            searchDto.setId(UUID.randomUUID().toString());
            searchDto.setValue(String.valueOf(Math.random()));
            dtoList.add(searchDto);
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("c:\\searchDtoList.json"), dtoList);

    }

}
