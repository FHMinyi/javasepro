package com.fhminyi.singleinstance;

public class Test2 {
    // 枚举类应用场景：做信息的分类和标记。
    // 需求：模拟上下左右移动
    public static void main(String[] args) {
        // 1. 常量做信息标记和分类: 参数不受约束
        move(Constant.UP);

        // 2. 枚举类做信息标记和分类：参数受枚举类约束
        move2(Direction.UP);
    }

    public static void move2(Direction direction) {
        switch (direction) {
            case UP :
                System.out.println("向上移动");
                break;
            case DOWN :
                System.out.println("向下移动");
                break;
            case LEFT :
                System.out.println("向左移动");
                break;
            case RIGHT :
                System.out.println("向右移动");
                break;
        }
    }

    public static void move(int direction) {
        switch (direction) {
            case Constant.UP :
                System.out.println("向上移动");
                break;
            case Constant.DOWN :
                System.out.println("向下移动");
                break;
            case Constant.LEFT :
                System.out.println("向左移动");
                break;
            case Constant.RIGHT :
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
}


