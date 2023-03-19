import java.sql.SQLOutput;
import java.util.Scanner;

public class Search_insert_and_delete_in_an_unsorted_array {
    public static void main(String[] args) {
      int arr[]={7,5,8,4,10,15};
        System.out.println("Enter the value that want to find :");
        Scanner scan=new Scanner(System.in);
        int i ,j,n,x;
        n=scan.nextInt();
        // searching value
        int count=0;
        for(i=0;i<arr.length;i++)
        {

            if(n==arr[i])
            {
                System.out.println("Your enter value find "+i+" th position and value ="+n);
            }

        }



        //insert value
        System.out.println("Enter the index where you insert the value");
        x=scan.nextInt();

        try
        {
            if(x>arr.length)
            {
                System.out.println("You enter the position that is not exist in this array");
            }

            else
            {
                System.out.println("Enter value that you want to insert into "+x +"th position");
                int v=scan.nextInt();
                int temp[] = new int[arr.length+1];


                System.out.println("After inset the value arrray will be :");
                for (j=0;j<x;j++)
                {

                    temp[j]=arr[j];
                    System.out.print(" "+temp[j]);

                }

                temp[x]=v;
                System.out.print(" "+temp[x]);

                for (int k=x-1;k<=arr.length+1;k++)
                {
                    temp[k]=arr[k+1];
                    System.out.print(" "+temp[k]);
                }
                System.out.println("\n");


            }
        }
        catch(ArrayIndexOutOfBoundsException e) {

        }

// Delete array

        System.out.println("\nEnter the index that you want to delete :");
        x=scan.nextInt();

        try
        {
            if(x>arr.length)
            {
                System.out.println("You enter the position that is not exist in this array");
            }

            else
            {
//                System.out.println("Enter value that you want to insert into "+x +"th position");
//                int v=scan.nextInt();
                int temp[] = new int[arr.length+1];


                System.out.println("After delete the value arrray will be :");
                for (j=0;j<x;j++)
                {

                    temp[j]=arr[j];
                    System.out.print(" "+temp[j]);

                }

//                temp[x]=v;
//                System.out.print(" "+temp[x]);

                for (int k=x;k<=arr.length+1;k++)
                {
                    temp[k]=arr[k+1];
                    System.out.print(" "+temp[k]);
                }
                System.out.println("\n");


            }
        }
        catch(ArrayIndexOutOfBoundsException e) {

        }
    }
}
