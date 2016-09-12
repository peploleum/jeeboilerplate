package com.peploleum.jeecdi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.peploleum.jeecdi.flexibus.FlexibusEntityDescriptor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class DtoGenerator {
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

    public static FlexibusEntityDescriptor generateFlexibusEntityRootMock() {
        final FlexibusEntityDescriptor fed = new FlexibusEntityDescriptor();
        fed.setName("Root");
        fed.setLabel("Root");
        final FlexibusEntityDescriptor fruits = new FlexibusEntityDescriptor();
        fruits.setName("Fruits");
        fruits.setLabel("Fruits");
        final FlexibusEntityDescriptor animals = new FlexibusEntityDescriptor();
        animals.setName("Animals");
        animals.setLabel("Animals");
        final FlexibusEntityDescriptor dog = new FlexibusEntityDescriptor();
        dog.setName("Dog");
        dog.setLabel("Dog");
        final FlexibusEntityDescriptor cat = new FlexibusEntityDescriptor();
        cat.setName("Cat");
        cat.setLabel("Cat");
        final FlexibusEntityDescriptor otter = new FlexibusEntityDescriptor();
        otter.setName("Otter");
        otter.setLabel("Otter");
        animals.setSubDescriptors(Arrays.asList(new FlexibusEntityDescriptor[]{dog, cat, otter}));
        final FlexibusEntityDescriptor apple = new FlexibusEntityDescriptor();
        apple.setName("Apple");
        apple.setLabel("Apple");
        final FlexibusEntityDescriptor orange = new FlexibusEntityDescriptor();
        orange.setName("Orange");
        orange.setLabel("Orange");
        fruits.setSubDescriptors(Arrays.asList(new FlexibusEntityDescriptor[]{apple, orange}));

        fed.setSubDescriptors(Arrays.asList(new FlexibusEntityDescriptor[]{animals, fruits}));
        return fed;
    }

}
