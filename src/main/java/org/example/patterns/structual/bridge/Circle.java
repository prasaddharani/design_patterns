package org.example.patterns.structual.bridge;

public class Circle extends Shape {
    private final double radius;

    Circle(Renderer renderer, double radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}
