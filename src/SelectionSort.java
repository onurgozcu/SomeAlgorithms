import java.util.Arrays;

//Selection Sort Algorithm
// • In place? --> Yes
// • Stable? --> No
// • Running time --> O(N^2)

public class SelectionSort {

    private static final int ARRAY[] = {30,1,4,9,16,3,2,9,2,7,3,5,20,16,4};

    public static void main(String[] args) {

        selectionSort(ARRAY,ARRAY.length);
        //Print all elements
        System.out.print("Selection Sort Algorithm Result: " + Arrays.toString(ARRAY));

    }

    private static void selectionSort(int array[], int length){

        if (length == 1)//there is no need to sort
            return;

        for (int i = 0; i<length-1; i++){//We are selecting an element each loop to check all elements one by one to find min
            int min = i;//for now our min element's index is i
            for (int j = i+1; j<length; j++){//Now we are selecting all other elements one by one to compare to check is there any smaller element
                if (array[j] < array[min]){
                    //If we find smaller than our min, we should synchronize min
                    min = j;
                }
            }
            swap(array,min,i);//Bring the min starting position
        }
    }

    private static void swap(int array[], int smallerOne, int biggerOne){
        //Standart swap operation
        int temp = array[smallerOne];
        array[smallerOne] = array[biggerOne];
        array[biggerOne] = temp;
    }
}
