package liskovPrinciple.Good.board;

import liskovPrinciple.Good.Movement;

import java.util.Set;

public interface Board <T extends Number> {

    public void addMovement(Movement<T> movement);
    public Movement<T> removeMovement(Movement<T> movement);
    public Set<Movement<T>> getAllMovement();
}
