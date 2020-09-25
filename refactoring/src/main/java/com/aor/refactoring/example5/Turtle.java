package com.aor.refactoring.example5;

public class Turtle {
    private Direction direction;

    public Turtle(int row, int column, char direction) { this.direction = new Direction(direction, row, column); }

    public int getRow() { return direction.getRow(); }

    public int getColumn() {
        return direction.getColumn();
    }

    public char getDirection() { return direction.getDirection(); }

    public void execute(char command) {
        if (command == 'L') direction.rotateleft();
        else if (command == 'R') direction.rotateright();
        else if (command == 'F') direction.moveforward();
    }
}
