package max3;

public class Max3 {
	/**
	 * Returns the maximum
	 *
	 *@post The result equals one of the given numbers.
	 *		|result == i||result == j||result == k
	 *
	 */
	
	public static int max3(int i, int j, int k) {
		if (i < j)
			if (j < k)
				return k;
			else
				return j;
		else
			if (i < k)
				return k;
			else
				return i;
	}

}
