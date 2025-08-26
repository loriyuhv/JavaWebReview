package com.wsw.noocp;

import org.junit.jupiter.api.Test;

class ShapeDrawerTest {

    @Test
    void drawShape() {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.drawShape(new Triangle());
    }
}