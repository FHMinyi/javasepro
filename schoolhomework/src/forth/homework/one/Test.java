package forth.homework.one;

public class Test {
    public static void main(String[] args) {
        Adult adult = new Adult();
        Children child = new Children();
        System.out.println("消费前");
        child.setId("1110");
        child.setName("孩子");
        child.setGender("男");
        child.recharge(10);
        System.out.println(child);

        adult.setId("2222");
        adult.setName("成人");
        child.setGender("女");
        adult.recharge(10);
        System.out.println(adult);
        System.out.println();
        System.out.println("消费后");
        child.consume();
        adult.consume();
        System.out.println(child);
        System.out.println(adult);
    }
}
