package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void area_berjalanSesuaiSubclass_meskipunReferenceShape() {
        Shape circle = new Circle(10);        
        Shape rectangle = new Rectangle(5, 4); 

        assertEquals(314.159, circle.area(), 0.001);
        
        assertEquals(20.0, rectangle.area(), 0.001);
    }
}