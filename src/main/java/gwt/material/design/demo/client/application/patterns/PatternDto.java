package gwt.material.design.demo.client.application.patterns;

/**
 * Created by kevzl on 4/13/2017.
 */
public class PatternDto {

    private String title;
    private String description;
    private String url;
    private String demo;
    private String resizer;

    public PatternDto(String title, String description, String url, String demo, String resizer) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.demo = demo;
        this.resizer = resizer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getResizer() {
        return resizer;
    }

    public void setResizer(String resizer) {
        this.resizer = resizer;
    }
}
