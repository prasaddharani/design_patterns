package org.example.patterns.structual.bridge;

public class WireframeRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
        System.out.println("Wireframe Rendering: Drawing circle with radius " + radius);
    }

    @Override
    public void renderRectangle(double width, double height) {
        System.out.println("Wireframe Rendering: Drawing rectangle with width " + width + " and height " + height);
    }
}
