package day08;

import java.util.Arrays;

import org.w3c.dom.views.DocumentView;

public class Problems {
    public static void main(String[] args) {
        Product[] p = new Product[4];
        String[] products = { "LG standby", "Galaxy flip", "USB 1TB", "LG gram" };
        double[] price = { 45000.89, 42546.34, 12345.78, 42000.0 };
        for (int i = 0; i < p.length; i++) {
            p[i] = new Product(products[i], price[i]);
        }
        System.out.println("p[1].compareTo(p[3]) 결과 값은 ... = " + p[1].compareTo(p[3]));
        System.out.println(Arrays.toString(p));

        /*
         * Company c1 = new Company("LG", "서울시 서초구");
         * p[0].setComp(c1);
         * Product pclone = null;
         * try {
         * pclone = (Product) p[0].clone();
         * } catch (CloneNotSupportedException e) {
         * System.out.println("Clone Exxception.");
         * }
         * System.out.println(p[0].hashCode() + " Hex : \t" +
         * Integer.toHexString(p[0].hashCode()));
         * System.out.println(pclone.hashCode() + " Hex : \t" +
         * Integer.toHexString(pclone.hashCode()));
         * System.out.println("p[0].getComp() ==> " + p[0].getComp());
         * System.out.println("pclone.getComp() ==> " + pclone.getComp());
         */
    }
}

class Company {
    private String name;
    private String addr;

    Company(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
}

class Product implements Comparable<Product>, Cloneable {
    private String name;
    private double price;
    private Company comp;

    public void setComp(Company comp) {
        this.comp = comp;
    }

    public Company getComp() {
        return comp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
        /* (int) (this.price - other.price); 소수점 이하는 정렬 못함 */
    }

    @Override
    public String toString() {
        return String.format("\n상품명 : %s 판매가 : %.2f원", name, price);
    }

}
