package Lesson8.SamplePrograms;

public class Quizreview {

    public static void main(String[] args) {
        /*
     **5 definitions:
        -Parallel arrays
        -2D arrays
        -Ragged arrays
        -Physical vs Logical size
        
      **Coding:
        1)Write a method that adds up (and returns total) of all  numbers in a 2d array
        
        2)Write a method that counts how many of a certain number are in a 1D array (similar to test)
        
        1 Coding bat  (1 of 2)  
         */

        //1)
        System.out.println("PROGRAM 1");
        int nums[][] = new int[4][5];
        for (int i = 0; i < nums.length; i++) { //first  number
            for (int j = 0; j < nums[i].length; j++) { //second number
                nums[i][j] = i * 10 + j;
                //print numbers 
                System.out.println(nums[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("The total of all numbers is ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println("" + sum);

        //2)
        System.out.println("PROGRAM 2");
        int x[] = {7, 4, 8, 9, 6, 7, 5, 6, 9, 10, 7, 3, 7, 4, 8, 0, 1, 7};
        //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
        int y[] = {7, 8, 7, 4, 5};

        //call method
        int numx7 = count7(x);
        int numy7 = count7(y);
        System.out.format("There are %d 7s in x and %d 7s in y", numx7, numy7);

        System.out.println("CODING BAT REVIEW 1\n");
        int cb1[] = fizzArray3(11, 18);
        for (int i = 0; i < cb1.length; i++) {
            System.out.println(cb1[i] + ",");
        }
        System.out.println("\nCODING BAT REVIEW 2\n");
        int cb2[] = {6, 2, 5, 3};
        cb2 = shiftLeft(cb2);
        for (int i = 0; i < cb2.length; i++) {
            System.out.println(cb2[i] + ",");
        }
    }

    public static int count7(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                total++;
            }
        }
        return total;
    }

    //Coding bat 1)
    public static int[] fizzArray3(int start, int end) {
        int result[] = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            result[index] = i;
            index++;
        }
        return result;
    }

    //Coding bat 2)
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

}
