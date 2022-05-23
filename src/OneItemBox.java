public class OneItemBox extends Box {
    private Item item;

    public OneItemBox() {}

    @Override
    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        } else {
            return;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.equals(item);
    }
    
}
