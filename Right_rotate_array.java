import java.util.Scanner;

public class Right_rotate_array {
    public static void main(String[] args) {
        int array[]={4,8,7,5,2,5,6,2};
        int i,j;

        System.out.println("Original array =");
        for(i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }
    int r=array.length;
        System.out.println();
        System.out.println("Enter the postion that you want to right rotate first value"+r+" left last value you enter");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();

        System.out.println("Your  right rotate value");
        for(i=r-1;i>r-n-1;i--)
        {
            System.out.print(" "+array[i]);
        }

        for(i=0;i<r-n;i++)
        {
            System.out.print(" "+array[i]);
        }
    }
}
