package hw2;

import java.util.Scanner;

public class hw2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("歡迎使用醫療診斷系統，請依序回答問題");

        // 詢問是否發燒
        System.out.println("請問您最近是否發燒（y/n）");
        String isFever = scanner.nextLine();

        // 詢問是否咳嗽
        System.out.println("請問您最近是否咳嗽（y/n）");
        String isCough = scanner.nextLine();

        // 詢問是否疲倦
        System.out.println("請問您最近是否感覺疲倦（y/n）");
        String isFatigue = scanner.nextLine();

        // 詢問是否血壓升高
        System.out.println("請問您是否血壓升高（y/n）");
        String isHypertension = scanner.nextLine();

        // 詢問是否口乾
        System.out.println("請問您最近是否口乾（y/n）");
        String isDryMouth = scanner.nextLine();

        // 詢問是否盜汗
        System.out.println("請問您最近是否盜汗（y/n）");
        String isNightSweat = scanner.nextLine();

        // 診斷結果
        String diagnosis = "";

        if ("y".equals(isFever) && "y".equals(isCough)) {
            if ("y".equals(isFatigue)) {
                diagnosis = "肝病";
            } else {
                diagnosis = "肺病";
            }
        } else if ("y".equals(isHypertension) && "y".equals(isDryMouth)) {
            diagnosis = "高血壓";
        } else {
            diagnosis = "其他系統";
        }

        // 輸出診斷結果
        System.out.println("先生/小姐您可能得" + diagnosis + "!!!");
    }
}

