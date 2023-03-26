import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            if (c>=65&&c<=90||c>=97&&c<=122)
                System.out.println("it is alphabet");
            else
             System.out.println("it is not a alphabet");




    }
}