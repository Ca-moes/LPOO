package com.aor.refactoring.example5;

public class Direction {
    private char direction;
    private int row;
    private int column;

    public Direction(char direction, int row, int column) {
        this.direction = direction;
        this.row = row;
        this.column = column;
    }

    public char getDirection() { return direction; }

    public int getRow() { return row; }

    public int getColumn() { return column; }

    public void rotateleft(){
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
    }

    public void rotateright(){
        if (direction == 'N') direction = 'E';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
    }

    public void moveforward(){
        // MOVE FORWARD
        if (direction == 'N') row--;
        if (direction == 'S') row++;
        if (direction == 'W') column--;
        if (direction == 'E') column++;
    }
}
