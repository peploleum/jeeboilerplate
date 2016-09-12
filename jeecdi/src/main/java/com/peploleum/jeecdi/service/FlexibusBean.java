package com.peploleum.jeecdi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.peploleum.jeecdi.flexibus.FlexibusEntityDescriptor;

import java.io.IOException;
import java.io.InputStream;

import static com.peploleum.jeecdi.service.DtoGenerator.generateFlexibusEntityRootMock;

public class FlexibusBean implements FlexibusEntityService {
    @Override
    public FlexibusEntityDescriptor getEntity() {
        ObjectMapper om = new ObjectMapper();
        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final InputStream resourceAsStream = FlexibusBean.class.getResourceAsStream("/entityMock2.json");
        try {
            final FlexibusEntityDescriptor flexibusEntityDescriptor = om.readValue(resourceAsStream, FlexibusEntityDescriptor.class);
            return flexibusEntityDescriptor;

        } catch (IOException e) {
            return generateFlexibusEntityRootMock();
        }
    }

}
