import java.util.Scanner;

public class reverse_of_array {
    public static void main(String[] args) {
    int array[]={5,7,8,4,5};
        System.out.println("Reverse array are :");

        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(" "+array[i]);
        }
    }
}
