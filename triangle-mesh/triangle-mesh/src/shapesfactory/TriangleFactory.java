package shapesfactory;
import shapes.Triangle2D;
import toolbox.Math;

public class TriangleFactory {
	private static int index = 0;
	
	public static Triangle2D build() {
		return new Triangle2D(
					index++, 
					PointFactory.build(), 
					PointFactory.build(),
					PointFactory.build()
				);
	}
	
	public static Triangle2D build(Triangle2D base) {
		return new Triangle2D(
				index++, 
				base.getVertexes()[1], // b 
				base.getVertexes()[2], // c
				PointFactory.build(Math.midPoint(base.getVertexes()[1], base.getVertexes()[2]))
				);
	}
}
