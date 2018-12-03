package pass14_02;

public class Range {
	private double min;
	private double max;

	public boolean isOk(double a) {
		if (a >= min && a < max) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() { // minとmaxの文字列表現を返す
		return "[min:" + min + " -  max:" + max + "]";
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public Range(double min, double max) {
		this.min = min;
		this.max = max;
	}
}
