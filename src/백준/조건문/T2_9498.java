package 백준.조건문;

import java.util.Scanner;

// 시험 성적
public class T2_9498 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();

        if ((score >= 90) && (score <= 100)) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
