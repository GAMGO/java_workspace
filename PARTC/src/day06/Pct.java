package day06;

public class Pct {
    public static void main(String[] args) {
        YourP yp = new YourP();
        YourC yc = new YourC();
        yp.setMsg("무시됨");
        yc.setMsg("???");
        System.out.println(yp.getMsg());
        System.out.println(yc.getMsg());
    }
}

class YourP {
    private String msg;
    private int num;
    protected String name;// 자식 상속

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
        super.setMsg("**" + msg);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
