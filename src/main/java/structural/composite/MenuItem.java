package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuItem implements BaseMenu {

    private String title;
    private List<BaseMenu> children = new ArrayList<>();

    public MenuItem(String title) {
        this.title = title;
    }

    @Override
    public void add(BaseMenu m) {
        notifyIllegalCall();
    }

    @Override
    public void remove(BaseMenu m) {
        notifyIllegalCall();
    }

    @Override
    public BaseMenu getChild(int i) {
        notifyIllegalCall();
        return null;
    }

    private void notifyIllegalCall() {
        throw new IllegalStateException("MenuItem은 하위 메뉴를 갖지 않습니다");
    }

    @Override
    public List<BaseMenu> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        System.out.println(title + " 메뉴를 실행합니다\n");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}