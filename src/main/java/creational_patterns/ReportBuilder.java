package creational_patterns;

public class ReportBuilder {
    private Report report = new Report();

    public ReportBuilder addSection(String section) {
        report.addSection(section);
        return this;
    }

    public Report build() {
        return report;
    }
}
