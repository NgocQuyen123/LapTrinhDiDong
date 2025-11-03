package admin.example.bt_recyclerview;

public class MyItem {
    private String title;
    private String description;
    private int imageResId;

    public MyItem(String title, String description, int imageResId) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getImageResId() { return imageResId; }
}