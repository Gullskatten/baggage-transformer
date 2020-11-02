package no.oboy.filter;

import no.oboy.model.BaggageRecord;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class FilterExecutor {

    private final List<Class<? extends Filter>> filters = new ArrayList<>();

    public FilterExecutor addFilter(Class<? extends Filter> filter) {
        filters.add(filter);
        return this;
    }

    public int getFilterCount() {
        return filters.size();
    }

    /**
     * Executes all filters on a BaggageRecord
     * If one filter fails - the BaggageRecord is discarded
     * If all filters matches - the BaggageRecord is added to param list
     *
     * @param includedItems  BaggageRecords matching filters
     * @param itemToEvaluate BaggageRecord to evaluate
     */
    public void executeRules(List<BaggageRecord> includedItems, BaggageRecord itemToEvaluate) {
        Filter aFilter;
        boolean isEvaluationOk = true;

        for (final Class<? extends Filter> rule : filters) {
            try {
                aFilter = rule.getDeclaredConstructor().newInstance();

                if (!aFilter.evaluateItem(itemToEvaluate)) {
                    isEvaluationOk = false;
                    return; // Interrupt for-loop, item is not matching all filters!
                }

            } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("Invocation of rules failed. This should not happen!");
            }
        }

        if (isEvaluationOk) {
            includedItems.add(itemToEvaluate);
        }
    }

}
