/*Programmer: Austin Parker
Assignment: PE 7.3 countOccurrences
Description: Programs displays how many times an entered number occurs within a range of numbers using arrays*/

import java.util.Scanner;

public class countOccurrence {

    public static void main(String[] args) {
        System.out.print("Enter the numbers between 1 and 100: ");
        Scanner scan = new Scanner(System.in);
        //loop for counting to 100
        int[] counts = new int[101];
        for(int i = 0;i<counts.length;i++){
            counts[i] = 0;
        }

        String s = scan.nextLine();
        String[] splits = s.split(" ");
        for(int i = 0;i<splits.length;i++){
            //counts number of times a number occurs in range
            counts[Integer.parseInt(splits[i])] += 1;
        }

        for(int i = 1;i<counts.length;i++){
            //if statement for displaying how many times a number occurs
            if(counts[i]>1)
                System.out.println(i+" occurs "+counts[i]+" times");
            else if(counts[i]==1)
                System.out.println(i+" occurs "+counts[i]+" time");
        }
    }
}
