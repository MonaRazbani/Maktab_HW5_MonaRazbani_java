public class Fiction extends Book{

    public Fiction() {
        super("Fiction");
    }

    @Override
    public void setPrice() {
        setPriceForAbst(24.99);
    }

    @Override
    public String toString() {
        return "title : " + getTitle()+ "price : " + getPrice();
    }
}



