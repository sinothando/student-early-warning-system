package creational_patterns;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<String> sections = new ArrayList<>();

    public void addSection(String section) {
        sections.add(section);
    }

    public List<String> getSections() {
        return sections;
    }
}
