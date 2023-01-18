package chapter14.hashcode;

public class Key {
	public int number;
	public int name;
	public int addr;

	public Key(int number) {
		this.number = number;
	}

	// 논리적 값(데이터)
	@Override
	public boolean equals(Object obj) {
		try {
			// ClassCastException
			Key compareKey = (Key) obj;

			// NullPointerException
			if (number == compareKey.number) {
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}

	// 물리적 주소
	@Override
	public int hashCode() {
		// return super.hashCode(); // 원래 heap메모리 16진수 주소
		return number;
	}
}
