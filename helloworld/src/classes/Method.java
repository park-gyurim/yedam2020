package classes;

public class Method {
		
		int leftField;
		int rightField;
		
		public int getLeftField() {
			return leftField;
		}
		public void setLeftField(int leftField) {
			this.leftField = leftField;
		}
		public int getRightField() {
			return rightField;
		}
		public void setRightField(int rightField) {
			this.rightField = rightField;
		}
		public int thisSum() {
			return leftField + rightField;
		}
		public int thisMinus() {
			return leftField - rightField;
		}
		public int sum(int a, int b) {
			return a + b;
		}
		public int minus(int a, int b) {
			return a - b;
		}
	

}
