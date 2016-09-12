package com.peploleum.jeecdi.flexibus;


import java.util.Map;

public class FlexibusAttributeDescriptor implements Comparable<FlexibusAttributeDescriptor> {
    private String name;
    private String label;
    private String type;
    private String qualifiedName;
    private Map<String, String> dictionary;

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

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

    @Override
    public int compareTo(final FlexibusAttributeDescriptor o) {
        if (this.name == null)
            return (o.getName() == null ? 0 : -1);
        return this.name.compareTo(o.getName());
    }

    public Map<String, String> getDictionary() {
        return this.dictionary;
    }

    public void setDictionary(final Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public void setQualifiedName(final String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

}
