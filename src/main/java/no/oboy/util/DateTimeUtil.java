package no.oboy.util;

import java.time.LocalDateTime;

public class DateTimeUtil {
    public static boolean isBetween(LocalDateTime dateToCompare, LocalDateTime startDate, LocalDateTime endDate) {
        return (dateToCompare.isEqual(startDate) || dateToCompare.isAfter(startDate))
                && (dateToCompare.isEqual(endDate) || dateToCompare.isBefore(endDate
        ));
    }
}
