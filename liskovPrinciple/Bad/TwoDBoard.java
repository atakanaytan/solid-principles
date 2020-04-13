package liskovPrinciple.Bad;

import java.util.HashSet;
import java.util.Set;

public class TwoDBoard implements Board{

    private Set<Point> points;


    public TwoDBoard() {
        this.points = new HashSet<Point>();
    }

    @Override
    public void addPoint(int x, int y){
        this.points.add(new Point(x,y));
    }

    @Override
    public Point removePoint(int x, int y){

        Point p = new Point(x,y);

        if (this.points.remove(p)){

            return p;
        }

        return null;
    }

    @Override
    public void addPoint(int x, int y, int z) throws Exception {

        throw new RuntimeException("You can not add 3D to 2D board");
    }

    @Override
    public Point removePoint(int x, int y, int z) {

        throw new RuntimeException("You can not remove 3D point to 2D board");
    }


}
