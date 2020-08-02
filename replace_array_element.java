import java.util.*;
class replace_array_element 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of an array");
        int len=sc.nextInt();

        int a[]=new int[len];

        for(int i=0;i<len;i++) {
            System.out.println("Enter the value : ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the 1 for postion or 2 for number :");
        int choice=sc.nextInt();

        switch(choice) {
            case 1:
            System.out.println("Enter the postion you want to replace the number with :");
            int pos=sc.nextInt();

            System.out.println("Enter the number you want to add in array :");
            int n=sc.nextInt();

            a[pos]=n;
            break;

            case 2:
            System.out.println("Enter the value you want to get replaced :");
            int value=sc.nextInt();

            System.out.println("Enter the new value to be entered at that place :");
            int num=sc.nextInt();

            for(int i=0;i<len;i++) {
                if(a[i]==value)
                    a[i]=num;
            }
            break;
        }
        System.out.println("The final array is : ");
        System.out.print("[");
        for(int i=0;i<len;i++) {
            System.out.print(a[i]+",");
        }
        System.out.print("]");
    }
}