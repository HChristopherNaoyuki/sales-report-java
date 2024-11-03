// Package Declaration
package Solution;

public class SalesReport
{
    public static void main(String[] args)
    {
        // Define the sales data for each device over three months
        int[][] sales = 
        {
            {30, 15, 35},  // iPhone 7
            {20, 25, 30},  // Samsung S8
            {25, 11, 32}   // Huawei Mate 10
        };

        // Define device names
        String[] devices = {"iPhone 7", "Samsung S8", "Huawei Mate 10"};
        
        // Variables to store row and column totals
        int[] rowTotals = new int[sales.length];
        int[] colTotals = new int[sales[0].length];
        
        // Calculate row totals and column totals
        for (int i = 0; i < sales.length; i++)
        {
            for (int j = 0; j < sales[i].length; j++)
            {
                rowTotals[i] += sales[i][j];  // Sum of each row (device total)
                colTotals[j] += sales[i][j];  // Sum of each column (monthly total)
            }
        }

        // Print the report header
        System.out.println("******************************************************");
        System.out.println("TOP CELL PHONE SALES REPORT - 2018");
        System.out.println("******************************************************");
        
        // Print column headers
        System.out.printf("%-16s %6s %7s %7s %8s\n", "", "JAN", "FEB", "MAR", "TOTAL");

        // Print each device's sales data and totals
        for (int i = 0; i < sales.length; i++)
        {
            System.out.printf("%-15s", devices[i]);
            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.printf("%8d", sales[i][j]);
            }
            System.out.printf("%8d\n", rowTotals[i]);
        }

        // Print monthly totals
        System.out.println("******************************************************");
        System.out.printf("%-15s", "MONTHLY TOTAL");
        for (int colTotal : colTotals)
        {
            System.out.printf("%8d", colTotal);
        }
        System.out.println();  // Print a new line for better separation
        System.out.println("******************************************************");
    }
}
