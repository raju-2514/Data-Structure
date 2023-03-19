public class selection_sort {
    public static void main(String[] args) {
        int arr[]={5,71,8,89,45,5};
        int i,j,k;
        int temp;
        System.out.println("Original array=");
        for (i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter sorting");
        int min;

        // loop for compare value
        for (i=0;i<arr.length;i++)
        {
            min=i;
            //loop for test data value
            for (j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;


                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;

            }
            System.out.print(arr[i]+" ");

        }


    }
}
