package no.oboy.filter;

import no.oboy.model.BaggageRecord;

import static no.oboy.constants.NorwegianAirports.NORWEGIAN_AIRPORTS_LIST;

public class ToNorwegianAirportOnly implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getBagFinalAirportIATA() != null &&
                NORWEGIAN_AIRPORTS_LIST.contains(record.getBagFinalAirportIATA());
    }
}
