package org.example.patterns.structual.bridge;

public class App {

    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer wireframeRenderer = new WireframeRenderer();

        Shape circle = new Circle(vectorRenderer, 2);
        Shape rectangle = new Rectangle(wireframeRenderer, 2.0, 3.0);

        circle.draw();
        rectangle.draw();
    }
}
