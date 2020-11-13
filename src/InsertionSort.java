import java.util.Arrays;

//Insertion Sort Algorithm
//It makes more sense to use it in arrays that are partly sorted. (Or just to make sure that the arrays we think might be sorted.)
//It gives the best practical performance for small input sizes (~20)
// • In place? --> Yes
// • Stable? --> Yes
// • Running time --> Worst case: O(N^2) // Best case (is input already sorted): O(N)

public class InsertionSort {

    private static final int ARRAY[] = {1,4,9,16,3,2,9,2,7,3,5,20,16,4};

    public static void main(String[] args) {

        insertionSort(ARRAY,ARRAY.length);
        //Print all elements
        System.out.print("Selection Sort Algorithm Result: " + Arrays.toString(ARRAY));

    }

    private static void insertionSort(int array[], int length){

        if (length == 1)//there is no need to sort
            return;

        for (int i = 0; i<length; i++){//We are selecting an element to compare others and insert it
            int selectedElement = array[i];//save the selected element
            int j = i -1;
            while (j >= 0 && array[j] > selectedElement){//Now we are looking for the right place to insert it
                //Right place will be between a smaller element and a larger element.
                //Until we find this place, we go back and check all the elements before it.
                //We shift each element one index to the right until we find the right place.

                array[j + 1] = array[j];
                j--;

                //If we can't find it, j will be -1 and we'll exit the loop.
                // In this case, we have chosen the smallest element of our array and we have to place it at the very beginning.
                // We can use j+1 as index in any case, since j can be -1 at least.
            }
            array[j+1] = selectedElement;
        }
    }

}
