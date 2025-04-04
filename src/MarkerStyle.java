public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public String getIconType() { return iconType; }
    public String getColor() { return color; }
    public String getLabelStyle() { return labelStyle; }
}