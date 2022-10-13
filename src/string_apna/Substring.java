package string_apna;

public class Substring {
    public static void substring(StringBuilder str,int start,int end) {
        String substring="";
        
        for(int i = start;i<end;i++) {
            substring+=str.charAt(i);
        }
        System.out.println(substring);
    }
    public static void main(String[] args) {
//        String str = "Jyoti Prakash Mohanta";
        StringBuilder sb = new StringBuilder("Jyoti prakash mohanta");
        substring(sb, 4, 5);
        System.out.println(sb.substring(0, 7));
    }
}
