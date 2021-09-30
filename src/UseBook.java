public class UseBook {
    private Book createBook;

    public UseBook(String title) {
        if (title.toLowerCase().equals("nonfiction")) {
            createBook = new NonFiction();
            createBook.setPrice();
        } else if (title.toLowerCase().equals("fiction")) {
            createBook = new Fiction();
            createBook.setPrice();
        }
    }

    public Book getCreateBook() {
        return createBook;
    }

    @Override
    public String toString() {
        return "Book: " + createBook.toString() ;
    }
}
