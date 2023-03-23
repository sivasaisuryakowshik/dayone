import java .util.Scanner;

class hello{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            System.out.println("it is a vowel");
        else if (c >= 65 && c <= 90 || c >= 97 && c <= 122)
            System.out.println("it is a constant");
        else
            System.out.println("invalid input");
    }
}
