package com.peploleum.jeecdi.flexibus;

import java.util.ArrayList;
import java.util.List;

public class FlexibusEntityDescriptor {
    private String name;
    private String label;
    private List<FlexibusEntityDescriptor> subDescriptors;
    private List<FlexibusAttributeDescriptor> attributes;
    private List<FlexibusRelationDescriptor> relations;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<FlexibusEntityDescriptor> getSubDescriptors() {
        if (this.subDescriptors == null)
            this.subDescriptors = new ArrayList<FlexibusEntityDescriptor>();
        return this.subDescriptors;
    }

    public void setSubDescriptors(final List<FlexibusEntityDescriptor> subDescriptors) {
        this.subDescriptors = subDescriptors;
    }

    public void addSubDescriptor(final FlexibusEntityDescriptor subDescriptor) {
        getSubDescriptors().add(subDescriptor);
    }

    public List<FlexibusAttributeDescriptor> getAttributes() {
        if (this.attributes == null)
            this.attributes = new ArrayList<FlexibusAttributeDescriptor>();
        return this.attributes;
    }

    public void setAttributes(final List<FlexibusAttributeDescriptor> attributes) {
        this.attributes = attributes;
    }

    public List<FlexibusRelationDescriptor> getRelations() {
        if (this.relations == null)
            this.relations = new ArrayList<FlexibusRelationDescriptor>();
        return this.relations;
    }

    public void setRelations(final List<FlexibusRelationDescriptor> relations) {
        this.relations = relations;
    }

    public void addAttribute(final FlexibusAttributeDescriptor attribute) {
        getAttributes().add(attribute);
    }

    public void addRelation(final FlexibusRelationDescriptor relation) {
        getRelations().add(relation);
    }

}
