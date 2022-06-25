import framework.Product;

public class UnderlinePen extends Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }
}
