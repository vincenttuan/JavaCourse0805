package exam.leetcode;

public class LeetCode_038 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1211");
        StringBuilder ans = new StringBuilder();
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            char say = sb.charAt(i);
            int count = 0;
            for(int j = i; j < sb.length() ; j++) {
                if(say == sb.charAt(j)) {
                    count++;
                    i = j;
                } else {
                    break;
                }
            }
            System.out.println(count + "個" + say);
            ans.append(count).append(say);
        }
        System.out.println(ans);
    }
    
}
