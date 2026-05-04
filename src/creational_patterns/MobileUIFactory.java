package creational_patterns;

public class MobileUIFactory implements UIFactory {
    public Button createButton() {
        return new MobileButton();
    }
}
