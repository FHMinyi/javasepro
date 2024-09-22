package com.fhminyi.branch;

public class SwitchDemo {
    public static void main(String[] args) {
        // 注意事项
        /**
         * 1. 不支持double,float,long
         * 2. case 值不能重复，且必须是字面量
         * 3. switch 穿透（实际上就是少了break）
         */
        long a = 10;
        switch((int) a) {}
    }
}
