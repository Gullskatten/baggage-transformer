package no.oboy.filter;

import no.oboy.model.BaggageRecord;
import no.oboy.util.DateTimeUtil;

import java.time.LocalDateTime;

public class IsDateBetween10thOr16thOfAnyMonth implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getBagEventTimestamp().getDayOfMonth() >= 10 && record.getBagEventTimestamp().getDayOfMonth() <= 16;
    }
}
