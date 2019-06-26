package p01Shapes;

public class J01Point {
	private int x;
	private int y;

					
	public J01Point() {}

	//	constructor, ��������� �������� (default constructor)
	//  ������ ������� ����� ���	�������� (����������� �� ������� ���� ��� ����
	//  �� ����� ���� ��� constructor, ���������� � default, ����� ������ �� ��� ��������

	public J01Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	 


	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;					//this (private) x
	}
	public void setY(int y) {
		this.y = y;					//this private y
	}
}
