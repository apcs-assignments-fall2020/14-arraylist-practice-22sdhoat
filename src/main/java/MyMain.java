import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int counter = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 1 || list.get(i) % 2 == -1){
                counter++;
            }
        }
        return counter;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++) {
            int list_1 = list1.get(i);
            for (int x = 0; x < list2.size(); x++) {
                int list_2 = list2.get(x);
                if (list_1 == list_2) {
                    return true;   
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr_list.add(i , arr[i]);
        }
        return arr_list;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?");
        int num = scan.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the " + num + " numbers now.");
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = scan.nextInt();
        convertToArrayList(array);
        }
    }
}
