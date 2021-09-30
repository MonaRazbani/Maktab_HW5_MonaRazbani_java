import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayBook arrayBook = new ArrayBook();
        System.out.println("enter number of book you want insert : ");
        Scanner scanner= new Scanner(System.in);
        int numOfBook = scanner.nextInt();
        for (int i=0 ; i< numOfBook ; i++){
            arrayBook.setBook();
        }
        arrayBook.display();


    }
}
