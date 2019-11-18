package day12_hashset;

public class Lotto {
    private int no1;
    private int no2;
    private int no3;
    private int no4;
    private int no5;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.no1;
        hash = 73 * hash + this.no2;
        hash = 73 * hash + this.no3;
        hash = 73 * hash + this.no4;
        hash = 73 * hash + this.no5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Lotto o = (Lotto)obj;
        if(o.no1 + o.no2 + o.no3 + o.no4 + o.no5 == no1 + no2 + no3 + no4 + no5 ) {
            return true;
        }
        return false;
    }
    
    
    
    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public int getNo3() {
        return no3;
    }

    public void setNo3(int no3) {
        this.no3 = no3;
    }

    public int getNo4() {
        return no4;
    }

    public void setNo4(int no4) {
        this.no4 = no4;
    }

    public int getNo5() {
        return no5;
    }

    public void setNo5(int no5) {
        this.no5 = no5;
    }

    @Override
    public String toString() {
        return "Lotto{" + "no1=" + no1 + ", no2=" + no2 + ", no3=" + no3 + ", no4=" + no4 + ", no5=" + no5 + '}' + "\n";
    }
    
    
}
