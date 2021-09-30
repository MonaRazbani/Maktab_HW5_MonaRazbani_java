public class NonFiction extends Book {
    public NonFiction() {
        super("NonFiction");
    }

    @Override
    public void setPrice() {
        setPriceForAbst(37.99);
    }

    @Override
    public String toString() {
        return "title : " + getTitle()+ "price : " + getPrice();
    }
}


