import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(5, 6));
        rectangles.add(new Rectangle(1, 4));
        rectangles.add(new Rectangle(6, 6));
        rectangles.add(new Rectangle(1, 12));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(7, 7));
        rectangles.add(new Rectangle(3, 8));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(2, 9));

        Filter filter = new BigRectangleFilter();



        for(Rectangle rectangle : rectangles)
        {
            if(filter.accept(rectangle))
            {
                System.out.println(rectangle);
            }

        }
    }
}