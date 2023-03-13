import java.util.Scanner;

public class array_value_print {
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




    }
}
