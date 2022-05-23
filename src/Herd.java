import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable critter : herd) {
            critter.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String allPositions = "";
        for (Movable critter : herd) {
            allPositions += critter.toString() + "\n";
        }
        return allPositions;
    }
}
