package homeworks;

// homework 5
public class Box {
    int width = 0;
    int height = 0;
    int length = 0;

    // Constructor
    public Box(int w, int h, int l) {
        width = w;
        height = h;
        length = l;
    }

    public void printVolume() {
        // Calculate and display Volume
        System.out.println("Homeworks.Box Volume = " + width * height * length);
    }
}
