package bai_tap.exception;


import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            try {
                System.out.println("Nhập cạnh a.");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b.");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c.");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a,b,c);
                System.out.println(a + "," + b +"," + c + " là ba cạnh của tam giác.");
                flag = true;

            }catch (NumberFormatException e){
                e.printStackTrace();
                flag=false;
            } catch (IllegalTriangleException e) {
                flag =false;
                e.printStackTrace();
            }
        }while (!flag);
    }
}
