package com.fhminyi.string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "郑丯玲的Java学习";
        //1. 返回字符串长度
        System.out.println(str.length());
        //2. 根据索引返回字符
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        //3. 将当前字符串转成字符数组
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        //4. 字符串的判断(注意大小写)
        String str1 = "郑丯玲的java学习";
        System.out.println(str1.equals(str));
        //5. 字符串的判断(忽略大小写)
        System.out.println(str.equalsIgnoreCase(str1));
        //6. 根据开始和结束索引得到新字符串（包前不包后）
        System.out.println(str.substring(0, 3));
        //7. 只给开始索引，截取到最后(方法重载)
        System.out.println(str.substring(4));
        //8. 把字符串某个内容替换为新内容，并返回新字符串(脏话替换)
        String s3 = str.replace("Java","Python");
        System.out.println(s3);// 找不到则返回原字符串
        //9. 判断字符串中是否包含某个关键字
        System.out.println(s3.contains("Python"));
        System.out.println(str.contains("java"));// 大小写注意
        //10. 判断字符串是否以某个字符串开头（姓氏检查）
        String 姓名 = "郑丯玲";
        System.out.println(姓名.startsWith("郑"));
        //11. 把字符串按照某个指定内容分割成多个字符串，返回字符串数组
        String 姓名串 = "张无忌,周芷若,殷素素,赵敏";
        String[] 姓名组 = 姓名串.split(",");
        for (String name : 姓名组) {
            System.out.println(name);
        }

    }
}
