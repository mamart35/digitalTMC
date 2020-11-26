package zmartin;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{4,5,8,2};
		KthLargest ma = new KthLargest(3, input);
		System.out.println("The result is " +ma.add(3));
		System.out.println("The result is " +ma.add(5));
		System.out.println("The result is " +ma.add(10));
		System.out.println("The result is " +ma.add(9));
		System.out.println("The result is " +ma.add(4));
	}

}
