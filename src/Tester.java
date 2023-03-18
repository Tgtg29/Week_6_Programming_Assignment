public class Tester {
    public static void main(String[] args){
        double[ ] data = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0};
        //create a StatsCalculator object
        StatsCalculator myCalculator = new StatsCalculator(data);

        myCalculator.print();
        myCalculator.sortData(); //(5.0, 8.0, 10.0, 15.0, 20.0, 25.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0)
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println(myCalculator.calculateMedian());

    }
}
