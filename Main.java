import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter no. of Elements for Array");
        int n = sc.nextInt();
        char [] abc = new char[n];
        System.err.println("Enter the " + n + "Elements");

        for(int i = 0; i<n;i++){
            abc[i] = sc.nextLine();
        }

        System.err.println("The elements are : ");

        for(int i = 0; i < n; i++){
            System.err.print(abc[i] + " ");
        } 
        System.err.println();
            System.err.println("The Sorted array is : ");
            Arrays.sort(abc);
            for(int i = 0; i < n; i++){
                System.err.print(abc[i] + " ");
            }

            Arrays.toString(abc);
            System.err.println(abc);
    }

}