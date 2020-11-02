package no.oboy.filter;

import no.oboy.model.BaggageRecord;

public class AlwaysTrueTestFilter implements Filter {
    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return true;
    }
}
