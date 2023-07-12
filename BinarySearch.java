public class BinarySearch {

    public static void binary(int arr[], int search) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        var val = 0;
        while(start <= end){
            mid = (start+end)/2;
            if(search == arr[mid]){
                val = -1;
                System.out.println("Value is found; "+arr[mid]);
                break;
            }
            if(search < arr[mid]) {
                end = mid-1;
                start = 0;
            }
            else if(search > arr[mid]) {
                start = mid+1;
                end = arr.length;
            }
            if(val==0)
            System.out.println("Value is not present");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 10, 15};
        int search = 0;
        binary(arr, search);
    }
}
