package structural.composite;

public class Client {

    public static void main(String[] args) {
        // ============ RootMenu bar ============ //
        BaseMenu rootMenuBar = new MenuBar("RootMenu bar", true);
        BaseMenu modify = new MenuItem("수정");
        rootMenuBar.add(modify);
        BaseMenu view = new MenuItem("보기");
        rootMenuBar.add(view);
        // ... 이하 생략

        // ============ FileMenu bar (RootMenu bar의 SubMenu bar) ============ //
        BaseMenu fileMenuBar = new MenuBar("파일");
        BaseMenu newTab = new MenuItem("새 탭");
        fileMenuBar.add(newTab);
        BaseMenu newWindow = new MenuItem("새 창");
        fileMenuBar.add(newWindow);
        BaseMenu newSecretWindow = new MenuItem("새 시크릿 창");
        fileMenuBar.add(newSecretWindow);
        BaseMenu reopenTab = new MenuItem("닫은 탭 다시 열기");
        fileMenuBar.add(reopenTab);
        // ... 이하 생략

        rootMenuBar.add(fileMenuBar);

        // ============ ShareMenu bar (RootMenu bar의 SubMenu bar) ============ //
        BaseMenu shareMenuBar = new MenuBar("공유");
        BaseMenu emailLink = new MenuItem("이메일 링크");
        shareMenuBar.add(emailLink);
        BaseMenu message = new MenuItem("메시지");
        shareMenuBar.add(message);
        BaseMenu airDrop = new MenuItem("AirDrop");
        shareMenuBar.add(airDrop);
        // ... 이하 생략

        fileMenuBar.add(shareMenuBar);

        rootMenuBar.execute();
    }
}
