package no.oboy.model;

import com.opencsv.bean.AbstractBeanField;

public class BagEventDescriptionConverter extends AbstractBeanField<String, BagEventDescription> {
    @Override
    protected Object convert(String s) {
        return BagEventDescription.fromValue(s);
    }
}
