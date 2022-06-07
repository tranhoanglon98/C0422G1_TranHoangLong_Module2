package bai_tap.loop;

public class FirstTwentyPrimes {
    public static void main(String[] args) {
        byte count = 0;
        int primeNum = 2;
        boolean flag = true;
        while (count < 20) {
            for (int i = 2; i < primeNum; i++) {
                flag = true;
                if (primeNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(primeNum);
                count++;
            }
            primeNum++;
        }
    }
}
