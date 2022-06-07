package bai_tap.loop;

public class PrimeNumLessThan100 {
    public static void main(String[] args) {
        int primeNum = 2;
        boolean flag = true;
        while (primeNum < 100) {
            for (int i = 2; i < primeNum; i++) {
                flag = true;
                if (primeNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(primeNum);
            }
            primeNum++;
        }
    }
}
