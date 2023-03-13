import java.util.Scanner;

public class search_array_elements {
    public static void main(String[] args) {
        int i,n,value;
        System.out.println("Enter the size of array (n):");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
      int array[] = new int[n];
        System.out.println("Enter the array value:");


        for (i=0;i<n;i++)
        {

            array[i]=scan.nextInt();

        }
        System.out.println(" The given size of array="+n+" And arrray =");
        for (i=0;i<n;i++)
        {

            System.out.println(array[i]);

        }

        //search by array position
        int position;
        System.out.println("Enter the valid postion :");
        position=scan.nextInt();

        if (position>n)
        {
            System.out.println("Sorry! You enter the largest position that not exist in this array");
        }
        else
        {
            System.out.println(array[position]);
        }

        //search by elements
        int search_value;
        System.out.println("Enter the value ");
        search_value=scan.nextInt();
        for (i=0;i<n;i++)
        {


            if(search_value == array[i])
            {
                System.out.println("Value is found and your searching value ="+search_value+"  Is fount position "+array[i-1]);
            }

        }


    }
}
