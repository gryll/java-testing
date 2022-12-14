package Point;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testYDestination(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,2);
        assert p1.distacteTo(p2) == 1;
    }

    @Test
    public void testXDestination(){
        Point p1 = new Point(1,1);
        Point p3 = new Point(3,1);
        assert p1.distacteTo(p3) == 2;
    }

    @Test
    public void testNegative(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,3);
        Assert.assertNotEquals(p1.distacteTo(p2),1);
    }

}
