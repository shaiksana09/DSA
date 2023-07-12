public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 8, 2, 10, 15, 5};
        int search = 10;
        int temp = 0;
        System.out.println("Length of the array: "+arr.length);
        for(int i=0; i<arr.length;i++) {
            if(arr[i]==search) {
                temp = -1;
                System.out.println("Found "+arr[i]);
            }
        }
        if(temp != -1)
        System.out.println("Did not find the value: "+search);
    }
}

//time complexity for this program is O(n)