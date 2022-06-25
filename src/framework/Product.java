package framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return p;
    };
}
