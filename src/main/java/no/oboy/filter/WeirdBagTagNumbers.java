package no.oboy.filter;

import no.oboy.model.BaggageRecord;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeirdBagTagNumbers implements Filter {
   private final List<String> knownInvalidBagTags = Collections.unmodifiableList(
           Arrays.asList("Null","0000000000"));

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return knownInvalidBagTags.contains(record.getBagTagNumber());
    }
}
