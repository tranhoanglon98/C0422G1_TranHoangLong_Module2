package test;

public class giaihuat {


    public static void main(String[] args) {
        String str = "CodegymDaNang";
        String str2 = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str2 +=" " + str.charAt(i);
            } else {
                str2 += str.charAt(i);
            }
        }
        str = str2.toLowerCase();
        System.out.println(str);
    }
}
