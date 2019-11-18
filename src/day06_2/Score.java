package day06_2;

public class Score {
    
    private Student stud;
    private int chinese;
    private int math;
    private int english;
    private int sum;

    public Score(Student stud, int chinese, int math, int english) {
        this.stud = stud;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum = chinese + math + english;
    }

    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Score{" + "stud=" + stud + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", sum=" + sum + '}';
    }
    
    
}
