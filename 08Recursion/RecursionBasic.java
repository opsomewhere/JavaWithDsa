public class RecursionBasic {
    
    //ARRAY IS SHORTED OR NOT
    public static boolean isArrSorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isArrSorted(arr, i+1);
    }

    //FIRST OCCURANCE IN ARRAY 
    public static int firstOccur(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key,i+1);
    }

    //LAST OCCURANCE IN ARRAY 
    public static int LastOccur(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccur(arr, key,i+1);
        if (isFound != -1) {
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,5,6,5};

        System.out.println(isArrSorted(arr, 0));
        System.out.println(firstOccur(arr, 5,0));
        System.out.println(LastOccur(arr, 5,0));
    }
}