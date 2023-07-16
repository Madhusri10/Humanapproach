// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j< i+1;j++)
            {
                if((i+j)%2==0)
                    System.out.print("1");
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}