package no.oboy.filter;

import no.oboy.model.BaggageRecord;

public class AlwaysFalseTestFilter implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return false;
    }

}
