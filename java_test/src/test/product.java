package test;

public class product {
    private int pid;
    private String title;
    private double price;

    public product(int pid, String title, double price) {
        this.pid = pid;
        this.title = title;
        this.price = price;
    }

    public void getPrice() {
        return;
    }

    public void getTitle() {
        return;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", title=" + title + ", price=" + price + "]";
    }

}
