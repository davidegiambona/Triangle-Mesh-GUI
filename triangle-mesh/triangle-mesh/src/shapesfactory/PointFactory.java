package shapesfactory;

import shapes.Point2D;

public class PointFactory {
	private static final double MAX_DISTANCE = 1.0f;

	public static Point2D build() {
		return new Point2D(normalizedDistance(), normalizedDistance());
	}

	public static Point2D build(Point2D from) {
		return new Point2D(
				normalizedDistance() + from.getX(), 
				normalizedDistance() + from.getY()
			);
	}

	private static double normalizedDistance() {
		return Math.random() * MAX_DISTANCE;
	}
}
