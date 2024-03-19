public class hw4_1 {

    public static void main(String[] args) {

        char[] check = {'J', 'a', 'v', 'a', '程', '式', '入', '門'}; // 建立一個 10個內容的字元陣列

        String str1 = new String(); // 建立空字串

        String str2 = new String(check); // 由字元陣列完整的變成字串

        String str3 = new String(check, 0, 4); // 由字元陣列的0號位置連續取4個字元出來(由0開始編號)

        String str4 = new String("宣告字串");// 由字串內容宣告字串物件

        String str5 = new String(str2); // 由字串變數宣告字串物件

        System.out.println("str1 = " + str1);

        System.out.println("str2 = " + str2);

        System.out.println("str3 = " + str3);

        System.out.println("str4 = " + str4);

        System.out.println("str5 = " + str5);

        System.out.println("比較 str2 與 str5 是否一致的結果?" + (str2 == str5));

        System.out.println("比較 str2 與str5 是否一致的結果?" + str2.equals(str5));

    }

}

