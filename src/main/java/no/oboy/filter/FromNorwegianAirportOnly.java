package no.oboy.filter;

import no.oboy.model.BaggageRecord;

import static no.oboy.constants.NorwegianAirports.NORWEGIAN_AIRPORTS_LIST;

public class FromNorwegianAirportOnly implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getLeg0DepartureAirportIATA() != null &&
                NORWEGIAN_AIRPORTS_LIST.contains(record.getLeg0DepartureAirportIATA());
    }
}
