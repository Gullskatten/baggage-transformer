package no.oboy.filter;

import no.oboy.model.BaggageRecord;
import no.oboy.util.DateTimeUtil;

import java.time.LocalDateTime;

public class Christmas2020 implements Filter {
    private final LocalDateTime startOfChristmas = LocalDateTime.of(2019,12,1,0,0);
    private final LocalDateTime endOfChristmas = LocalDateTime.of(2020,1,30,0,0);

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return DateTimeUtil.isBetween(record.getBagEventTimestamp(), startOfChristmas, endOfChristmas );
    }
}
