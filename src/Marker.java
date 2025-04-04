public class Marker {
    private int x;
    private int y;
    private MarkerStyle style;

    public Marker(int x, int y, String iconType, String color, String labelStyle) {
        this.x = x;
        this.y = y;
        this.style = MarkerStyleFactory.getStyle(iconType, color, labelStyle);
    }

    public void render() {
        System.out.printf("Rendering marker at (%d, %d) with style: %s, %s, %s\n",
                x, y,
                style.getIconType(),
                style.getColor(),
                style.getLabelStyle());
    }
}