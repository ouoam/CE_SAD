package com.solid.lsp;

public class Square implements Shape {
    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getWidth() {
        return side;
    }

    public void setWidth(int side) {
        this.setSide(side);
    }

    public int getHeight() {
        return side;
    }

    public void setHeight(int side) {
        this.setSide(side);
    }

    public int getArea() {
        return side * side;
    }
}
