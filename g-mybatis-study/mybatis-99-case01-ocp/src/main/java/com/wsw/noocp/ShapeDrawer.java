package com.wsw.noocp;

/**
 * @author loriyuhv
 * @date 2025/8/26 23:37
 * @description
 */
public class ShapeDrawer {
    public void drawShape(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Drawing a circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("Drawing a rectangle");
        } else if (shape instanceof Triangle) {
            System.out.println("Drawing a triangle");
        } else {
            shape.draw();
        }
    }
}
