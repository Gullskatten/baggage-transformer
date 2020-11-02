package no.oboy.model;

import com.opencsv.bean.AbstractBeanField;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class LocalDateTimeConverter extends AbstractBeanField<String, LocalDateTime> {

    public static final DateTimeFormatter AVINOR_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS");

    @Override
    protected Object convert(String s) {
        if(StringUtils.isEmpty(s) || !s.startsWith("2")) {
            return null;
        }
        TemporalAccessor parse = AVINOR_DATE_FORMATTER.parse(s);
        return LocalDateTime.from(parse);
    }
}
