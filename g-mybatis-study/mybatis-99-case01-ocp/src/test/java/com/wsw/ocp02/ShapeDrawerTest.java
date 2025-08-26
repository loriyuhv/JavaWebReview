package com.wsw.ocp02;

import org.junit.jupiter.api.Test;

class ShapeDrawerTest {

    @Test
    void drawShape() {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.drawShape(new Circle());
        shapeDrawer.drawShape(new Rectangle());
        shapeDrawer.drawShape(new Triangle());
    }
}