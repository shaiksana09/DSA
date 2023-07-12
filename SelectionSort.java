public class SelectionSort {
    public static int[] print(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(temp > arr[j]){
                    temp = arr[j];
                }
            }
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 7, 3, 4};
        int res[] =  print(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(res);
        }
    }
}


