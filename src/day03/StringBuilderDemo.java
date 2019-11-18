package day03;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "she sell sea shell in the sea shore";
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(s.indexOf('i'));
        System.out.println(sb);
        
    }
}
