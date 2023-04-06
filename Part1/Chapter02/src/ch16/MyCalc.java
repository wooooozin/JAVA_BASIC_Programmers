package ch16;

public class MyCalc implements Caculator {

	@Override
	public int plus(int i, int j) {
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		return i * j;
	}

}
