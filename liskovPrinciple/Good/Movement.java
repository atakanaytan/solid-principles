package liskovPrinciple.Good;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Movement<T extends Number> {

    private Map<String, T> multiDimensionPoint;

    public Movement() {
        this.multiDimensionPoint = new HashMap<String, T>();
    }

    public void addMovementDimension(String dimensionName, T dimensionValue) {
        this.multiDimensionPoint.put(dimensionName, dimensionValue);
    }

    public void setMovement(Map<String, T> movement) {
        this.multiDimensionPoint.putAll(movement);
    }

    public Map<String, T> getMovement() {
        return this.multiDimensionPoint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movement{");
        sb.append("multiDimensionPoint=").append(multiDimensionPoint);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movement)) return false;
        Movement<?> movement = (Movement<?>) o;
        return Objects.equals(multiDimensionPoint, movement.multiDimensionPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiDimensionPoint);
    }
}
