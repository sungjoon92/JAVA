package oop0913;

class Unit {
	int currentHP;
	int x, y;
}// Unit class end

interface Movable {
	void move(int x, int y);
}// Movable interface end

interface Attackable {
	void attack(Unit u);
}// Attackable interface end

interface fightable extends Movable, Attackable {
	// 인터페이스는 다중상속 가능

}// fightable interface end

class fight extends Unit implements fightable {
	// 클래스간의 상속은 단일상속만 가능하다

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit u) {
	}
};// fight class end;

class Tetris extends Unit implements Movable, Attackable {

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}
	// 클래스간의 입장에서 클래스는 단일 상속만 가능하고, 인터페이스는 다중구현이 가능하다

}// Tetris class end

public class Test05_interface {

	public static void main(String[] args) {
		// 클래스와 인터페이스 상속
	}// main end

}// class end
