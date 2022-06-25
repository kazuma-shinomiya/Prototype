import framework.Manager;
import framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning", messageBox);
        manager.register("slash", messageBox1);

        Product p1 = manager.create("strong message");
        p1.use("Hello");

        Product p2 = manager.create("warning");
        p2.use("Hello");

        Product p3 = manager.create("slash");
        p3.use("Hello");
    }
}
