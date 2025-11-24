package org.example.patterns.structual.bridge;

public abstract class Shape {

    protected Renderer renderer;

    Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
