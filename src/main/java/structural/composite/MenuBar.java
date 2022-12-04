package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuBar implements BaseMenu {

    private List<BaseMenu> children = new ArrayList<>();
    private String title;
    private boolean isRoot = false;

    private Scanner sc = new Scanner(System.in);

    public MenuBar(String title) {
        this.title = title;
    }

    public MenuBar(String title, boolean isRoot) {
        this.title = title;
        this.isRoot = isRoot;
    }

    @Override
    public void add(BaseMenu m) {
        children.add(m);
    }

    @Override
    public void remove(BaseMenu m) {
        children.remove(m);
    }

    @Override
    public BaseMenu getChild(int i) {
        if (checkValidChildNumber(i)) {
            throw new IllegalArgumentException(i + "번째 메뉴는 없습니다");
        }
        return children.get(i);
    }

    private boolean checkValidChildNumber(int i) {
        if (i > children.size() - 1 || i < 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<BaseMenu> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        while (true) {
            System.out.println("메뉴를 선택하세요");
            for (int i = 0; i < children.size(); i++) {
                System.out.println(i + "." + children.get(i).getTitle());
            }

            if (!isRoot) {
                System.out.println(children.size() + ".상위 메뉴로 돌아가기");
            }

            int select = sc.nextInt();
            if (!checkValidChildNumber(select)) { // 잘못된 메뉴 선택
                continue;
            }

            if (!isRoot && select == children.size()) { // 상위 메뉴로 돌아가기
                return;
            }

            children.get(select).execute(); // 메뉴 실행
        }
    }

    @Override
    public String getTitle() {
        return title;
    }
}
