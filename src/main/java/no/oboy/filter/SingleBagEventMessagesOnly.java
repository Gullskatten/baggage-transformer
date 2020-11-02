package no.oboy.filter;

import no.oboy.model.BaggageRecord;

/**
 * Some bag tag generated events are duplicated for both ARRIVAL and DEPARTURE in each leg
 * This filter removes all generated events (for other than the first leg, which has all the necessary information)
 */
public class SingleBagEventMessagesOnly implements Filter {

    @Override
    public boolean evaluateItem(BaggageRecord record) {
        return record.getLeg0DepartureAirportIATA() != null && (
                record.getLeg0DepartureAirportIATA().equals(record.getBagEventAirportIATA()));
    }
}
