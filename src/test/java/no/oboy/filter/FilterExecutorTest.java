package no.oboy.filter;

import no.oboy.model.BaggageRecord;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class FilterExecutorTest {
    private List<BaggageRecord> allItemsToInclude;

    @BeforeEach
    public void init(){
     allItemsToInclude = new ArrayList<>();
    }

    @Test
    public void shouldNotAddRecordIfAnyFilterFails() {
        FilterExecutor filterExecutor = new FilterExecutor();
        filterExecutor
                .addFilter(AlwaysTrueTestFilter.class)
                .addFilter(AlwaysFalseTestFilter.class);

        BaggageRecord anyBaggageRecord = new BaggageRecord();

        filterExecutor.executeRules(allItemsToInclude, anyBaggageRecord);

        assertThat("Should not add any record if any filter fails.", allItemsToInclude, Matchers.empty());
    }

    @Test
    public void shouldAddRecordIfAllFiltersEvaluate() {
        FilterExecutor filterExecutor = new FilterExecutor();
        filterExecutor
                .addFilter(AlwaysTrueTestFilter.class);

        BaggageRecord anyBaggageRecord = new BaggageRecord();

        filterExecutor.executeRules(allItemsToInclude, anyBaggageRecord);

        assertThat("Should add any record if all filters evaluates to true.", allItemsToInclude, Matchers.hasSize(1));
    }

    @Test
    public void dateTimeTest() {
      String s = Double.valueOf("-\u00001\u00004\u0000.\u00002\u00008\u00002\u00007\u00009\u00009\u00007\u00002\u00001").toString();
    }
}