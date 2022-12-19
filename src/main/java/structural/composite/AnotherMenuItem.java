package structural.composite;

public class AnotherMenuItem extends MenuItem {

    public AnotherMenuItem(String title) {
        super(title);
    }

    @Override
    public void execute() {
        preprocess();
        super.execute();
    }

    private void preprocess() {
        System.out.println("AnotherMenuItem preprocess..");
    }
}
