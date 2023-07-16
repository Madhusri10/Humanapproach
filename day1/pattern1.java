// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i==1)||(i==5)||(j==1)||(j==5))
                    System.out.printf("*");
                else
                    System.out.printf(".");
            }
            System.out.println( );
        }
    }
}