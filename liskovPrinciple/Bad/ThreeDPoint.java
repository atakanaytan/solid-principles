package liskovPrinciple.Bad;

import java.util.Objects;

public class ThreeDPoint extends Point{

    private int z;

    public ThreeDPoint(int i, int x, int y) {
        super(x, y);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThreeDPoint)) return false;
        if (!super.equals(o)) return false;
        ThreeDPoint that = (ThreeDPoint) o;
        return getZ() == that.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getZ());
    }
}
