package shapes;

public class Triangle2D extends Triangle<Point2D> {
	private int index;
	
	public Triangle2D(int index, Point2D a, Point2D b, Point2D c) {
		super(a, b, c);		
		this.index=index;
	}

	public Point2D[] getVertexes() {
		Point2D[] vertexes = new Point2D[3];
		vertexes[0] = a;
		vertexes[1] = b;
		vertexes[2] = c;
		return vertexes;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(index));
		sb.append("{");
		sb.append(System.lineSeparator());
		sb.append("\t");
		sb.append(a);
		sb.append(System.lineSeparator());
		sb.append("\t");
		sb.append(b);
		sb.append(System.lineSeparator());
		sb.append("\t");
		sb.append(c);
		sb.append(System.lineSeparator());
		sb.append("}");
		sb.append(System.lineSeparator());
		return sb.toString();
	}
}
