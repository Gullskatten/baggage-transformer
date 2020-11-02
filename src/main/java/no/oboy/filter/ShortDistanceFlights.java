package no.oboy.filter;

import no.oboy.model.BaggageRecord;
import org.apache.commons.lang3.StringUtils;

public class ShortDistanceFlights implements Filter {
    /**
     *
     * @param record Any record
     * @return If record has only 1 departure and 1 arrival (1 legged)
     */
    @Override
    public boolean evaluateItem(BaggageRecord record) {

        boolean hasEmptySecondLeg = StringUtils.isEmpty(record.getLeg1DepartureAirportIATA()) &&
                !StringUtils.isEmpty(record.getLeg1ArrivalAirportIATA());
        boolean hasFirstLeg = !StringUtils.isEmpty(record.getLeg0DepartureAirportIATA()) &&
                !StringUtils.isEmpty(record.getLeg0ArrivalAirportIATA());

        return record.getLegArrayLength() == 1 ||
                (hasFirstLeg && hasEmptySecondLeg);
    }
}
