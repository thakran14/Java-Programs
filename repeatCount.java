class repeatCount
{
    static void printRepeat(final int arr[], final int size) {
        final int count[] = new int[size];
        int i;
        System.out.print("The repeating digits are: ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");

            else
                count[arr[i]]++;
        }

    }

    static void countSign(int arr[], int len) {
        int i;
        System.out.println("The repating digits by using signs are ");
        for (i = 0; i < len; i++) {
            if (arr[Math.abs(arr[i])] > 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];

            else
                System.out.println(Math.abs(arr[i]));
        }
    }

    public static void main( String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2, 1 };
        int len = arr.length;
       // printRepeat(arr,7);
       countSign(arr, len);
    }
}