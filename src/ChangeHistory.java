import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    };

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (history.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Double num : history) {
            sum += num;
        }
        return sum / history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
