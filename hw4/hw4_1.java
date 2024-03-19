import java.util.Scanner;

public class hw4_1 {

    public static void main(String[] args) {

        String temp = "";
        Scanner scanner = new Scanner(System.in);

            System.out.print("這是陪你聊程式，可以問我問題");

            while (true) {
                System.out.println("你說:");
                temp = scanner.nextLine();
                if (temp.endsWith("嗎")) {

                temp = temp.substring(0, temp.length() - 1);

            }

                temp = temp.replace("?", "!");

                temp = temp.replace("會不會", "會");

                temp = temp.replace("能不能", "能");

                temp = temp.replace("你會", "我會");

                temp = temp.replace("你能", "我能");
                
                temp = temp.replace("嗎", " ");
                

                if(temp.equals("0")){
                    System.out.println("離開聊天程序");
                    break;
                }
                System.out.println("回答：" + temp);
            }
    }
}
