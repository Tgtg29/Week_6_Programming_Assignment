import java.util.Arrays;
import java.util.ArrayList;
public class StatsCalculator {
    private double[] values;
    private double[] sortedValues;

    public StatsCalculator(){
       values = new double[20];
    }

    public StatsCalculator(double[] val){
        values = val;    }
    }

    public void sortData(){
        sortedValues = values;
        Arrays.sort(sortedValues);
    }

    public double calculateMax() {
        double maxIndex = 0.0;
        for (int i = 1; i < values.length; i++){
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public double calculateMin(){
        double minIndex = 0.0;
        for (int i = 1; i < sortedValues.length; i++){
            if (sortedValues[i] < sortedValues[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public double calculateMedian(){
        double median = 0.0;
        if(sortedValues.length % 2 != 0) {
            double temp = (sortedValues.length / 2) + .5;
            median = sortedValues[temp];
        }else {
            double temp = (sortedValues.length / 2);
            median = (sortedValues[temp] + sortedValues[temp + 1.0])/2.0;
        }
    }

    public double calculateSum(){
        double sum = 0.0;
        for (int i = 1; i < values.length; i++){
            sum += values[i];
            return sum;
        }
    }

    public double calculateMean(){
        double sum = 0.0;
        double mean = 0.0;
        for (int i = 1; i < values.length; i++){
            sum += values[i];
            mean = sum/i;
            return mean;
        }
    }


}