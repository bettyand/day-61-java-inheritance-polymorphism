public class Organism implements Movable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public void setX(int newX) {
        this.x = newX;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int newY) {
        this.y = newY;
    }

    @Override
    public void move(int dx, int dy) {
        this.setX(x + dx);
        this.setY(y + dy);
    }

    @Override
    public String toString() {
        return "x: " + this.getX() + "; y: " + this.getY();
    }
}