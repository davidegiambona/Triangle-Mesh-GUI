package toolbox;

public class JFrameNormalization {
	private int xOrigin;
	private int yOrigin;
	private double xFrame;
	private double yFrame;
	private double xMax;
	private double yMax;

	public JFrameNormalization(
			int xOrigin, int yOrigin, 
			double xFrame, double yFrame, 
			double xMax, double yMax
			) {
		setOrigin(xOrigin, yOrigin, xFrame, yFrame, xMax, yMax);
	}

	public void setOrigin(
			int xOrigin, int yOrigin, 
			double xFrame, double yFrame, 
			double xMax, double yMax
			) {
		this.xOrigin = xOrigin;
		this.yOrigin = yOrigin;
		this.xFrame = xFrame;
		this.yFrame = yFrame;
		this.xMax = xMax;
		this.yMax = yMax;
	}

	public int x(double x) {
		return xOrigin + (int) ((x*xFrame)/xMax);
	}
	
	public int y(double y) {
		return yOrigin - (int) ((y * yFrame)/yMax);
	}
}
