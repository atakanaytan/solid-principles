package liskovPrinciple.Bad;

public interface Board {

    public void addPoint(int x, int y) throws Exception;
    public Point removePoint(int x, int y) throws Exception;

    public void addPoint(int x, int y, int z) throws Exception;
    public Point removePoint(int x, int y, int z) throws Exception;
}
