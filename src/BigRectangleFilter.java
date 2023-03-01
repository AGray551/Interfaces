import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle)
        {
            Rectangle rectangle = (Rectangle) x;
            double perimeter = 2 * (rectangle.height + rectangle.width);
            return perimeter > 10;

        }
        return false;
    }

}
