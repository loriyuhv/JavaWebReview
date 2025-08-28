package com.wsw.ocp01;

import org.junit.jupiter.api.Test;

class ShapeDrawerTest {

    @Test
    void shapeDraw() {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.shapeDraw(new Rectangle());
        shapeDrawer.shapeDraw(new Circle());
    }
}