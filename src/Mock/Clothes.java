package Mock;

public class Clothes implements Comparable<Clothes> {
    String type;
    String size;
    String colour;

    public Clothes(String type, String size, String colour) {
        this.type = type;
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public int compareTo(Clothes other) {
        return other.size.compareTo(this.size);
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }
}
