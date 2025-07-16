package day06;

public class Pct {
    public static void main(String[] args) {
        YourP yp = new YourP();
        YourC yc = new YourC();
        yp.setMsg("무시됨");
        yc.setMsg("???");
        System.out.println(yp.getMsg());
        System.out.println(yc.getMsg());
        yc.setName("mm");
        yp.setName("sn");
        yp.setNum(12);
        yc.setNum(55);
        System.out.println("---------------------------------");
        System.out.println(yp);
        System.out.println(yc);
    }
}

class YourP {
    private String msg;
    private int num;
    protected String name;// 자식 상속

    @Override
    public String toString() {
        return String.format("%s %s (%d)", name, msg, num);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMsg() {
        return msg;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    YourP() {
        this.msg = "Unknown";
    }
}

class YourC extends YourP {
    @Override
    public void setMsg(String msg) {
        super.setMsg("**" + msg.concat(msg)); // super 안쓰면 무한 self호출(재귀)
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
