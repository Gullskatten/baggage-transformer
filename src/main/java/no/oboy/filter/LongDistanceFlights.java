package no.oboy.filter;

import no.oboy.model.BaggageRecord;

public class LongDistanceFlights implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getLegArrayLength() > 2;
    }
}
