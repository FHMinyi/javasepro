package fifth.homework.third;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("开始读取文件");
        try (
                FileReader reader = new FileReader("schoolhomework/src/fifth/homework/third/data.txt");
                FileWriter writer = new FileWriter("schoolhomework/src/fifth/homework/third/newdata.txt")
                ){
            String str = "";
            int cnum;
            int sum = 0;
            while((cnum = reader.read()) != -1) {
                char c = (char) cnum;
                if(c == ' ') {
                    sum += Integer.parseInt(str);
                    str += ' ';
                    writer.write(str);
                    str = "";
                } else if (c == '\r') {
                    sum += Integer.parseInt(str);
                    str += " " + sum + c;
                    sum = 0;
                    writer.write(str);
                    str = "";
                } else if (c == '\n') {
                    writer.write(c);
                } else {
                    str += c;
                }
            }
            sum += Integer.parseInt(str);
            str += " " + sum;
            writer.write(str);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        }
    }
}
