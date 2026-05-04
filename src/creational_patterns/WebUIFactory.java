package creational_patterns;

public class WebUIFactory implements UIFactory {
    public Button createButton() {
        return new WebButton();
    }
}