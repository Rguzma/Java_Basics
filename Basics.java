import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        OddNumbers();
    }  

    /*Print 1-255
    Write a method that prints all the numbers from 1 to 255.*/
    public static void oneTo255() {
        for (int i = 1; i <= 255; i++){
            System.out.println(i);

        }
    }

    /*Print odd numbers between 1-255*/
    public static void Odds() {
        for (int i = 1; i <= 255; i++){
            if (i % 2 == 1)
            System.out.println(i);

        }
    }

    /* Sigma of 255 AKA Sum to 255
    Write a method that creates and eventually returns a sum variable that adds up all the numbers from 1 to 255.
    In this method you are not printing the sum, except to debug if you need to, the method should return the sum. 
    Note: You do not need an array to write this function. */
    
    public static int Sigmasum() {
        int sum = 0;
        for (int i = 1; i <= 255; i++){
                sum = sum + i;
           /* System.out.println(sum);*/
        }
        return sum;
    }

    /*Iterating through an array
Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. 
Being able to loop through each member of the array is extremely important.*/
    public static void IteratingArray(){
        int[] myArray = {1, 3, 5, 7, 9, 13};
        for (int i=0; i <= myArray.length -1; i++){
            System.out.println(myArray[i]);
        }
    

    }


    /*Find Max
Write a method (sets of instructions) that takes any array and prints the maximum value in the array. 
Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.*/
    public static void FindMax (int[] arr){
        int currMax = Integer.MIN_VALUE;
        for(int val:arr){
            if(val > currMax)
                currMax = val;

        }
    }

    /*Array with Odd Numbers 
Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. 
When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].*/
    public static void OddNumbers (){
        ArrayList<Integer> Y = new ArrayList<Integer>();
        for (int i=1; i <=255; i++){
            if (i%2 == 1 ){
                Y.add(i);
                System.out.println(Y);
            }
        } 
    }


    /* Get Average
Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. 
Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.*/
    public static void Average (int[] list){
        int sum = 0;
        double average = 0;
        while(i < list.length) {
            sum += list[i];
            i++;
        }
        average = (sum/list.length);
        System.out.println(average);
    }


}   
