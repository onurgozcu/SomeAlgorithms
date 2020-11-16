import java.util.Arrays;

//Bubble Sort Algorithm
//Always postpone the bigger one for ascending order
// • In place? --> Yes
// • Stable? --> Yes
// • Running time --> O(N^2)

public class BubbleSort {

    //We need an array to sort -->
    private static final int ARRAY_ITERATIVE[] = {30,1,4,9,16,3,2,9,2,7,3,5,20,16,4};
    private static final int ARRAY_RECURSIVE[] = {30,1,4,9,16,3,2,9,2,7,3,5,20,16,4};

    public static void main(String[] args) {

        bubbleSortIterative(ARRAY_ITERATIVE,ARRAY_ITERATIVE.length);
        //Print all elements
        System.out.println("(Iterative) Bubble Sort Algorithm Result: " + Arrays.toString(ARRAY_ITERATIVE));


        //git deneme


        bubbleSortRecursive(ARRAY_RECURSIVE,ARRAY_RECURSIVE.length);
        //Print all elements
        System.out.print("(Recursive) Bubble Sort Algorithm Result: " + Arrays.toString(ARRAY_RECURSIVE));

    }

    private static void bubbleSortIterative(int array[], int length){

        if (length == 1)//there is no need to sort
            return;

        for (int i = 0; i<length-1; i++){//Every time the for loop runs, the largest element will be moved to the end.
            for (int j = 0; j<length-1-i; j++){
                if (array[j] > array[j+1]){
                    //Control all elements and postpone the bigger one if we find more bigger then our biggest element we will postpone it.
                    swap(array,j);
                }
            }
        }
    }

    private static void bubbleSortRecursive(int array[], int length){

        if (length == 1)//there is no need to sort
            return;

        for (int i = 0; i<length-1; i++){
            if (array[i] > array[i+1]){//Every time the for loop runs, the largest element will be moved to the end.
                swap(array,i);
            }
        }
        bubbleSortRecursive(array,length-1);//Decrease length by 1 to eliminate sorted elements before recall the function for unsorted elements
    }

    private static void swap(int array[], int biggerElementsIndex){
        //Standart swap operation
        int smallerOne = array[biggerElementsIndex+1];
        array[biggerElementsIndex+1] = array[biggerElementsIndex];
        array[biggerElementsIndex] = smallerOne;
    }
}
