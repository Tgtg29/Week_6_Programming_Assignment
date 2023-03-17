import java.util.Arrays;
import java.util.ArrayList;
public class StatsCalculator {
    private double[] values;
    private double[] sortedValues;

    public StatsCalculator(){
       values = new double[20];
    }

    public StatsCalculator(double[] val) {
        values = val;
    }

    public void sortData(){
        sortedValues = values;
        Arrays.sort(sortedValues);
    }

    public double calculateMax() {
        int maxIndex = 0;
        double maxValue = 0.0;
        for (int i = 0; i < sortedValues.length; i++){
            if (sortedValues[i] > sortedValues[maxIndex]) {
                maxValue = sortedValues[i];
            }
        }
        return maxValue;
    }

    public double calculateMin(){
        double minValue = sortedValues[0];
        return minValue;
    }

    public double calculateFirstQuartile(){
        int temp = 0;
        double firstQuart = 0.0;
        if((sortedValues.length % 2) == 0){
            temp = (sortedValues.length * 1/4);
            if(temp % 2 == 0){
                firstQuart = sortedValues[temp - 1];
            }else if(temp % 3 == 0){
                firstQuart = sortedValues[temp - 1];
            }else if(temp % 5 == 0){
                firstQuart = sortedValues[temp - 1];
            }else if(temp % 7 == 0){
                firstQuart = sortedValues[temp - 1];
            }else if(temp % 9 ==0){
                firstQuart = sortedValues[temp - 1];
            }else{
                firstQuart = (sortedValues[temp] + sortedValues[temp - 1]) / 2.0;
            }
        }else{
            temp = (sortedValues.length * 1/4);
            if(calculateMedian() % 2 != 0){
                firstQuart = (sortedValues[temp] + sortedValues[temp - 1]) / 2.0;
            }else{
                firstQuart = sortedValues[temp];
            }
        }
        return firstQuart;
    }

    public double calculateThirdQuartile(){
        int temp = 0;
        double thirdQuart = 0.0;
        if((sortedValues.length % 2) == 0){
            temp = (sortedValues.length * 3/4);
            if(temp % 3 == 0){
                thirdQuart = sortedValues[temp];
            }else{
                thirdQuart = (sortedValues[temp] + sortedValues[temp + 1]) / 2.0;
            }
        }else{
            temp = (sortedValues.length * 3/4);
            thirdQuart = sortedValues[temp];
        }
        return thirdQuart;
    }

    public double calculateMedian(){
        double median = 0.0;
        int temp = 0;
        if(sortedValues.length % 2 != 0) {
            temp = (sortedValues.length / 2);
            median = sortedValues[temp];
        }else {
            temp = (sortedValues.length / 2);
            median = (sortedValues[temp] + sortedValues[temp - 1])/2.0; //-1 because lists start with index 0
        }
        return median;
    }

    public double calculateSum(){
        double sum = 0.0;
        for (int i = 1; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    public double calculateMean(){
        double sum = 0.0;
        double mean = 0.0;
        for (int i = 1; i < values.length; i++){
            sum += values[i];
            mean = sum/i;
        }
        return mean;
    }

    public void print(){
        System.out.print("Your data is:");
        for(double vals : values){
            System.out.print(" " + vals);
        }
        System.out.println();
    }

    public void printSorted(){
        System.out.print("Your data is:");
        for(double vals : sortedValues){
            System.out.print(" " + vals);
        }
        System.out.println();
    }

    public void printFiveNumberSummary(){
        System.out.println("The Five Number Summary is:\n" + "Minimum: " + calculateMin() + "\n" + "First Quartile: " + calculateFirstQuartile() + "\n" + "Median: " + calculateMedian() + "\n" + "Third Quartile: " + calculateThirdQuartile() + "\n" + "Maximum: " + calculateMax());
    }


}