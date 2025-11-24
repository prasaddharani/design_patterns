package org.example.patterns.structual.bridge;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    Rectangle(Renderer renderer, double width, double height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(width, height);
    }
}
