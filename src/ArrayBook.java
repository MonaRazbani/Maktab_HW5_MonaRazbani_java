import java.util.Arrays;
import java.util.Scanner;

    public class ArrayBook {
        private UseBook[] arrayBook = new UseBook[10];
        private int numOfBook = 0 ;

        public int getNumOfBook() {
            return numOfBook;
        }

        public void numOfBookPlusPlus (){
            this.numOfBook++;
        }

        public UseBook getArrayBook(int index ) {
            return arrayBook[index ];
        }

        public void setArrayBook(UseBook book , int index ) {
            this.arrayBook[index]= book;
        }

        public boolean setBook(){
            boolean status = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter type of book (fiction/nonfiction )");
            String title = scanner.next();
            UseBook newBook = new UseBook(title);
            if (newBook.getCreateBook()!= null) {
                setArrayBook(newBook, getNumOfBook());
                numOfBookPlusPlus();
                status = true;
            }
            else System.out.println("wrong title ");

            return status;
        }

        public void display (){
            for (int i=0 ; i <= getNumOfBook(); i++ )
            {
                if (getArrayBook(i)!=null)
                    System.out.println(getArrayBook(i));
            }
        }
    }


