package DS;

public class Arrays {
/*
    An array organizes items sequentially, one after another in memory. Each position in the array has an index, starting at 0.
    Strengths:
        - Fast lookups. Retrieving the element at a given index takes O(1)O(1) time, regardless of the length of the array.
        - Fast appends. Adding a new element at the end of the array takes O(1)O(1) time, if the array has space.
    Weaknesses:
        - Fixed size. You need to specify how many elements you're going to store in your array ahead of time. (Unless you're using a fancy dynamic array.)
        - Costly inserts and deletes. You have to "scoot over" the other elements to fill in or close gaps, which takes worst-case O(n)O(n) time.
    Inserting
        - If we want to insert something into an array, first we have to make space by "scooting over" everything starting at the index we're inserting into.
        - In the worst case we're inserting into the 0th index in the array (prepending), so we have to "scoot over" everything in the array. That's O(n)O(n) time.
    Deleting
        - Array elements are stored adjacent to each other. So when we remove an element, we have to fill in the gap—"scooting over" all the elements that were after it.
        - In the worst case we're deleting the 0th item in the array, so we have to "scoot over" everything else in the array. That's O(n)O(n) time.
*/
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        arr[3] = 103;
        arr[4] = 104;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
