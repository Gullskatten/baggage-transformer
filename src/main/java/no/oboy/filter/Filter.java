package no.oboy.filter;

import no.oboy.model.BaggageRecord;

public interface Filter {
    boolean evaluateItem(BaggageRecord record);
}
