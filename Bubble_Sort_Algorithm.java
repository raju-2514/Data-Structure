public class Bubble_Sort_Algorithm {
    public static void main(String[] args) {
        int arr[]={7,8,4,4,78,1,3,564};
        int i,j,temp;
        System.out.println("Before sort the array =");
        for (i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Bubble Sort the value ");
        for (i=0;i<arr.length;i++)
        {
            //loop for compare value with j+1 and i value
            for (j=0;j<arr.length-1-i;j++)
            {
                //swap if the value is less than j value
                if(arr[j]<arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.print(arr[j]+" ");
        }

    }
}
