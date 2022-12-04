package structural.composite;

import java.util.List;

public interface BaseMenu {

    String getTitle();

    void add(BaseMenu m);

    void remove(BaseMenu m);

    BaseMenu getChild(int i);

    List<BaseMenu> getChildren();

    void execute();
}
