public class FlyweightDemo {
    public static void main(String[] args) {
        Marker[] markers = {
                new Marker(10, 20, "hospital", "blue", "bold"),
                new Marker(30, 40, "restaurant", "red", "italic"),
                new Marker(50, 60, "hospital", "blue", "bold"),
                new Marker(70, 80, "gas_station", "yellow", "normal"),
                new Marker(90, 100, "restaurant", "red", "italic")
        };

        for (Marker marker : markers) {
            marker.render();
        }

        System.out.println("\nMemory report:");
        System.out.println("Total markers: " + markers.length);
        System.out.println("Unique styles: " + MarkerStyleFactory.getStyleCount());
    }
}