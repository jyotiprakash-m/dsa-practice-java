package string_apna;

public class Uppercase {
    public static void uppercase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++) {
            if((int) str.charAt(i)==32) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        
        System.out.println(sb);
        
    }
    public static void main(String[] args) {
        String str = "hi I am jyoti prakash";
        uppercase(str);
    }
}
