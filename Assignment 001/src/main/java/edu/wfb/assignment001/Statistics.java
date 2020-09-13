package edu.wfb.assignment001;

import java.text.DecimalFormat;
import java.util.logging.Logger;

public class Statistics {

    private Logger logger = Logger.getLogger(getClass().getName());

    public DecimalFormat format = new DecimalFormat("###,###,###.##");

    Statistics(int[] grades) {
        logger.info("Calling Concstructor");
    }

    public int getSum() {
        logger.info("Calling getSum()");
         return -1;
    }

    public double getAverage() {
        logger.info("Calling getAverage()");
        return -1;
    }

    public double getMedian() {
        logger.info("Calling getMedian()");
        
        return -1;
    }

    public double getVariance() {
        logger.info("Calling getVariance()");
        
        return -1;
    }

    public double getStandardDeviation() {
        logger.info("Calling getVariance()");

        return -1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Output for Array: {");

// To Do, you need a for loop here to output the array contents, be nice about spacing.

        stringBuffer.append("}");
        stringBuffer.append(System.lineSeparator());

        stringBuffer.append("Sum:                " + format.format(getSum()));
        stringBuffer.append(System.lineSeparator());

        stringBuffer.append("Average:            " + format.format(getAverage()));
        stringBuffer.append(System.lineSeparator());

        stringBuffer.append("Median:             " + format.format(getMedian()));
        stringBuffer.append(System.lineSeparator());

        stringBuffer.append("Variance:           " + format.format(getVariance()));
        stringBuffer.append(System.lineSeparator());

        stringBuffer.append("Standard Deviation: " + format.format(getStandardDeviation()));
        stringBuffer.append(System.lineSeparator());

        return stringBuffer.toString();

    }

    public static void main(String args[]) {
        System.out.println(new Statistics(new int[] { 98, 87, 95 }).toString());

        System.out.println(new Statistics(new int[] {105, 50, 25}).toString());   

        System.out.println(new Statistics(new int[] {50, 1000, 22}).toString());   

        System.out.println(new Statistics(new int[] {75, 100, 200}).toString());  
         
        System.out.println(new Statistics(new int[] {98, 87, 95, 100}).toString());   

        System.out.println(new Statistics(new int[] {105, 50, 25, 20}).toString());   

        System.out.println(new Statistics(new int[] {50, 1000, 22, 50}).toString());   

        System.out.println(new Statistics(new int[] {75, 100, 200, 100}).toString()); 
    }
}
