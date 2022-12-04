package creational.factory;

public class Client {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        StringBuilder sb = new StringBuilder();
        sb.append("String 가능")
            .append("Integer 가능")
            .append(true);
        System.out.println(sb);
    }
}
