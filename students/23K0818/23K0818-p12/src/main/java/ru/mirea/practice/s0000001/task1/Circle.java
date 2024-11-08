package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;

// Класс Circle, наследующий от Shape
class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}