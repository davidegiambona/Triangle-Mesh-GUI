package toolbox;

import shapes.Point2D;

public class Math {
	public static Point2D midPoint(Point2D a, Point2D b) {
		return new Point2D(
					(a.getX() + b.getX())/2, 
					(a.getY() + b.getY())/2
				);
	}
}
