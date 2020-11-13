
//Binary Search Algorithm
//We can use it for sorted arrays it is more efficient than linear search algorithm

public class BinarySearch {

    //Firstly we need a sorted array and we have to know which element we are searching for?
    //Our array -->
    private static final int SORTED_ARRAY[] = {2,5,7,9,14,17,24,32,45,56,78,99,101,115,120,122,123,128,130,136,165,166,169,170};
    //Lets search for -->
    private static final int KEY = 17;

    public static void main(String[] args) {

        //Iterative
        int index = binarySearchIterative(SORTED_ARRAY,0,SORTED_ARRAY.length-1, KEY);
        if (index == -1){
            System.out.println("(Iterative) Array doesn't contains the key :(");
        }else {
            System.out.println("(Iterative) Element is found at index: " + index);
        }


        //Recursive
        index = binarySearchRecursive(SORTED_ARRAY,0,SORTED_ARRAY.length-1, KEY);
        if (index == -1){
            System.out.print("(Recursive) Array doesn't contains the key :(");
        }else {
            System.out.print("(Recursive) Element is found at index: " + index);
        }

    }


    //Iterative Algorithm for Binary Search
    private static int binarySearchIterative(int array[], int firstIndex, int lastIndex, int key){
        //Find the middle point
        int mid = (firstIndex + lastIndex)/2;

        //Repeat it until first index <= last index because if we can't find it by then, it means the array doesn't contain the key!
        while( firstIndex <= lastIndex ){

            if ( array[mid] < key ){//if middle element < our key
                //Our key can only be on the right part of the array
                //That's why we need to synchronize the first index to the middle index.
                //Now we've eliminated half of the array
                firstIndex = mid + 1;
            }else if ( array[mid] == key ){//If we find it
                return mid;
            }else{//if middle element > our key
                //Our key can only be on the left part of the array
                //That's why we need to synchronize the last index to the middle index.
                //Now we've eliminated half of the array
                lastIndex = mid - 1;
            }
            mid = (firstIndex + lastIndex)/2;//Let's synchronize the middle with the new first and last indexes.
        }

        return -1; // If the "while" loop is finished and no value has yet been returned, then the key is not in the array.
    }



    //Recursive Algorithm for Binary Search
    private static int binarySearchRecursive(int array[], int firstIndex, int lastIndex, int key)
    {
        if (firstIndex <= lastIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;//Let's synchronize the middle with the first and last indexes.

            //If we find it
            if (array[mid] == key)
                return mid;


            //if middle element > our key
            //Our key can only be on the left part of the array
            //That's why we need to synchronize the last index to the middle index.
            //Now we've eliminated half of the array
            if (array[mid] > key)
                return binarySearchRecursive(array, firstIndex, mid - 1, key);


            //if middle element < our key
            //Our key can only be on the right part of the array
            //That's why we need to synchronize the first index to the middle index.
            //Now we've eliminated half of the array
            return binarySearchRecursive(array, mid + 1, lastIndex, key);
        }

        //The key is not in the array.
        return -1;
    }
}
