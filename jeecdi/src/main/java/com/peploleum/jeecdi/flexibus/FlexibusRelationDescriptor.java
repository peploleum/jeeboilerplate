package com.peploleum.jeecdi.flexibus;

import java.util.ArrayList;
import java.util.List;

public class FlexibusRelationDescriptor implements Comparable<FlexibusRelationDescriptor> {
    private String from;
    private String to;
    private String label;
    private String name;
    private List<FlexibusAttributeDescriptor> attributes;

    public String getFrom() {
        return this.from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(final String to) {
        this.to = to;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<FlexibusAttributeDescriptor> getAttributes() {
        if (this.attributes == null)
            this.attributes = new ArrayList<FlexibusAttributeDescriptor>();
        return this.attributes;
    }

    public void setAttributes(final List<FlexibusAttributeDescriptor> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null || !(obj instanceof FlexibusRelationDescriptor))
            return false;
        if (this.name == null)
            return (((FlexibusRelationDescriptor) obj).getName() == null);
        return this.name.equals(((FlexibusRelationDescriptor) obj).getName());
    }

    @Override
    public int compareTo(final FlexibusRelationDescriptor o) {
        if (equals(o))
            return 0;
        return this.name.compareTo(o.name);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
