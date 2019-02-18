import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		Integer n = scanner.nextInt();
		System.out.println("Enter the value of k : ");
		Integer k = scanner.nextInt();
		Integer count = 0;
		Set<Integer> arrList = new HashSet<>();
		System.out.println("Enter the array elements : ");
		for (int inc = 0; inc < n; inc++) {
			arrList.add(scanner.nextInt());
		}
		n = arrList.size();
		Integer[] arr = new Integer[n];
		arr = arrList.toArray(arr);
		for (int inc = 0; inc < n; inc++) {
			for (int inc1 = inc + 1; inc1 < n; inc1++) {
				if (arr[inc1] - arr[inc] == k) {
					count++;
				}
			}
		}
		System.out.println("Count : " + count);
		scanner.close();
	}
}
