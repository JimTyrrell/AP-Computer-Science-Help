package edu.wfb.assignment001;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    private static Logger logger = Logger.getLogger("StatisticsTest");
    
    @Test
    @DisplayName("First Test")
    void firstTest() {
       logger.info("Running First Test");
       Statistics statistics = new Statistics(new int[] { 98, 87, 95 });

        assertEquals(280, statistics.getSum());
        assertEquals(93.33333333333333, statistics.getAverage());
        assertEquals(95, statistics.getMedian());
        assertEquals(32.33333333333333, statistics.getVariance());
        assertEquals(5.686240703077327, statistics.getStandardDeviation());
    }

    @Test
    @DisplayName("Second Test")
    void secondTest() {
        logger.info("Running Second Test");
        Statistics statistics = new Statistics(new int[] {105, 50, 25, 20});

        assertEquals(200, statistics.getSum());
        assertEquals(50, statistics.getAverage());
        assertEquals(37.5, statistics.getMedian());
        assertEquals(1516.6666666666667, statistics.getVariance());
        assertEquals(38.94440481849308, statistics.getStandardDeviation());
    }
 
    // To do!!!
    //You must add a test case for 5 and 6 integers in an array, use your low fidelity protyping tools to help you figure out the answers!!
    
}
