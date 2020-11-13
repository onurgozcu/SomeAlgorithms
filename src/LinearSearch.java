
//Linear Search Algorithm (Recursive)
// • Running time --> O(logn)

public class LinearSearch {

    //Firstly we need an array and we have to know which element we are searching for?
    //Our array -->
    private static final int ARRAY[] = {1,9,2,7,3,5,20,16,4};
    //Lets search for -->
    private static final int KEY = 16;

    public static void main(String[] args) {

        int index = linearSearch(ARRAY,0,ARRAY.length, KEY);
        if (index == -1){
            System.out.println("(Iterative) Array doesn't contains the key :(");
        }else {
            System.out.println("(Iterative) Element is found at index: " + index);
        }

    }

    private static int linearSearch(int array[], int index, int lenght, int key)
    {
        //No need to search
        if (lenght == 0)
            return -1;

        //If we find it
        if (array[index] == key)
            return index;

        //If we couldn't find yet
        return linearSearch(array, index+1, lenght-1, key);
    }
}
