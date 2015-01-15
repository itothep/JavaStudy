class Point {
	int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle {
	int radius;
	Point mid;

	public Circle(int x, int y, int r) {
		mid = new Point(x, y);
		radius = r;
	}

	public void showCircleInfo() {
		System.out.println("radius : " + radius);
		mid.showPointInfo();
	}
}

class Ring {
	Circle out;
	Circle in;

	public Ring(int inX, int inY, int inR, int outX, int outY, int outR) {
		in = new Circle(inX, inY, inR);
		out = new Circle(outX, outY, outR);
	}

	public void showRingInfo() {
		System.out.println("Inner Circle Info...");
		in.showCircleInfo();
		System.out.println("Outter Circle Info...");
		out.showCircleInfo();
	}

}

class Main {
	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}
