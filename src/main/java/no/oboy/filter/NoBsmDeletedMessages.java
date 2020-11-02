package no.oboy.filter;

import no.oboy.model.BagEventDescription;
import no.oboy.model.BaggageRecord;

public class NoBsmDeletedMessages implements Filter {
    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getBagEventDescription() != BagEventDescription.BSM_DELETED;
    }
}
