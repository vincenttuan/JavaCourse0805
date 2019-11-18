package day11_emuns;

public class CheckSex {
    public static void main(String[] args) {
        showSex(Sex.女);
    }
    public static void showSex(Sex sex) {
        switch(sex) {
            case 男:
                System.out.println("Boy");
                break;
            case 女:
                System.out.println("Girl");
                break;    
        }
        
    }
}
