package tohide;

class Rectangle {
	private int ulx, uly; // 좌 상단 x,y 좌표
	private int lrx, lry; // 우 하단 x,y 좌표

	public void getValue(int n1, int n2, int n3, int n4) {
		if (n3 <= 100 && n4 <= 100) {
			if (n1 >= 0 && n2 >= 0) {
				if (n3 > n1 && n4 > n2) {
					ulx = n1;
					uly = n2;
					lrx = n3;
					lry = n4;
				}
				System.out.println("errorcode #3");
			}
			System.out.println("errorcode #2");
		}
		System.out.println("errorcode #1");
	}

	public void showArea() {
		int xLen = lrx - ulx;
		int yLen = lry - uly;
		System.out.println("넓이: " + (xLen * yLen));
	}
}

class RectangleTest {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.getValue(11, 11, 22, 22);
		rec.showArea();
	}
}
