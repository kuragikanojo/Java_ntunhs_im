import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw9_3 {

    public static void main(String[] args) {

        int sum = 0;
        String line;
        boolean isLoop = true;
        Map<String, Integer> grades = new HashMap<>();

        // Check if file exists
        File file = new File("grades.csv");
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String row;
                while ((row = br.readLine()) != null) {
                    String[] data = row.split(",");
                    grades.put(data[0], Integer.parseInt(data[1]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        while (isLoop) {

            line = input("請輸入指令選擇下列功能 0.新增1.查詢 2.修改3.刪除4.顯示所有99.結束:");

            if (line.equals("99")) {
                isLoop = false;
            } else {

                String name;
                int grade;

                switch (line) {

                    case "0":

                        name = input("請輸入學生姓名:");
                        grade = Integer.parseInt(input("請輸入學生成績:"));
                        grades.putIfAbsent(name, grade);
                        break;

                    case "1":

                        name = input("請輸入學生姓名:");
                        System.out.println("學生姓名:" + name + "成績:" + grades.get(name));
                        break;

                    case "2":

                        name = input("請輸入學生姓名:");
                        grade = Integer.parseInt(input("請輸入學生修改成績:") );
                        grades.put(name, grade);
                        System.out.println("學生姓名:" + name + " 修改後成績:" + grades.get(name));
                        break;

                    case "3":

                        name = input("請輸入學生姓名:");
                        grades.remove(name);
                        System.out.println("學生姓名:" + name + "已刪除");
                        break;

                    case "4":

                        System.out.println("學生成績列表:");
                        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                            System.out.println(entry.getKey() + "," + entry.getValue());
                        }
                        break;
                }
            }
        }

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
}

