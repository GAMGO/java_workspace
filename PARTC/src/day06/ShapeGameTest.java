package day06;

public class ShapeGameTest {
    public static void main(String[] args) {
        Shp rec = new rct();
        Shp cir = new rad();
        Shp tri = new tri();

        System.out.println(rec.getId());
        System.out.println(cir.getId());
        System.out.println(tri.getId());

        rec.draw();
        cir.draw();
        tri.draw();
        System.out.println(rec instanceof rct);
        System.out.println(cir instanceof tri);
        System.out.println(tri instanceof rad);
        Shp[] shapes = new Shp[] { rec, tri, cir, null, null };
        for (Shp s : shapes) {
            if (s instanceof rad) {
                System.out.println("Circle = " + s.toString());
                Shp temp = (Shp) s;

                temp.draw();
            }
        }
    }
}

class Shp {
    private int posX, posY, width, height, id = 0;
    private String color;

    private static int c = 0;

    Shp() {
        c++;
        this.id = c;
        this.color = "black";
    }

    Shp(int posX, int posY, int width, int height, String color) {
        this();
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("shape id[%d] pos(%d, %d) size(%d, %d) %s", id, posX, posY, width, height, color);
    }

    public void move(int offsetX, int offsetY) {
        this.posX += offsetX;
        this.posY += offsetY;
    }

    public void resize(int offsetW, int offsetH) {
        this.width += offsetW;
        this.height += offsetH;
    }

    public void color(String color) {
        this.color = color;
    }

    public int calcArea() {
        return width * height;
    }

    public void draw() {
        System.out.println("도형 그리기 : " + this.toString());
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int[] getPosition() {
        return new int[] { posX, posY };
    }

    public int[] getSize() {
        return new int[] { width, height };
    }

}

class rct extends Shp {
    private int radius;
    private static final double PI = 3.14; // 상수로 선언.

    rct() {
        super(); // 생략 가능
    }

    rct(int posX, int posY, int width, int height, String color) {
        super(posX, posY, width, height, color);
    }

    @Override
    public double calcArea() {
        return radius * radius * PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("■■■■■■■■■■■");
        System.out.println("■         ■");
        System.out.println("■         ■");
        System.out.println("■         ■");
        System.out.println("■         ■");
        System.out.println("■■■■■■■■■■■");
    }

}

class tri extends Shp {

    @Override
    public void draw() {
        super.draw();
        System.out.println("    #    ");
        System.out.println("   ###   ");
        System.out.println("  #####  ");
        System.out.println(" ####### ");
        System.out.println("#########");
    }

}

class rad extends Shp {

    @Override
    public void draw() {
        super.draw();
        System.out.println("   @@@@  ");
        System.out.println(" @      @ ");
        System.out.println("@        @");
        System.out.println("@        @");
        System.out.println(" @      @ ");
        System.out.println("   @@@@   ");
    }
}