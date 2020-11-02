package no.oboy.filter;

import no.oboy.model.BaggageRecord;
import no.oboy.util.DateTimeUtil;

import java.time.LocalDateTime;

public class July2020BaggageEventsOnly implements Filter {
    private final LocalDateTime startOfJuly = LocalDateTime.of(2020,7,1,0,0);
    private final LocalDateTime endOfJuly = LocalDateTime.of(2020,7,31,0,0);

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return DateTimeUtil.isBetween(record.getBagEventTimestamp(), startOfJuly, endOfJuly);
    }
}
