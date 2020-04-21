package edu.neu.coe.info6205.sort.simple;

public class InsertionSort<X extends Comparable<X>> implements Sort<X> {

	/**
	 * Constructor for InsertionSort
	 *
	 * @param helper an explicit instance of Helper to be used.
	 */
	public InsertionSort(Helper<X> helper) {
		this.helper = helper;
	}

	public InsertionSort() {
		this(new Helper<>("InsertionSort"));
	}

	@Override
	public void sort(X[] xs, int from, int to) {
		
		for (int i = from; i < to; i++) {
			// Invariant 1: elements xs[from..i] are in order
			for (int j = i; j > 0; j--) {
				if (helper.less(xs[j], xs[j-1])) {
					X key = xs[j];
					xs[j] = xs[j-1];
					xs[j-1] = key;
				}
				else break;
			/*
			 * // TO BE IMPLEMENTED ... X key = null; int j = i - 1;
			 * 
			 * while (j >= 0 && xs[j].compareTo(xs[i]) > 0) {
			 * 
			 * key = xs[i]; xs[i] = xs[j]; xs[j] = key; j--;
			 */			}
		}
	}

	// ... END IMPLEMENTATION

	@Override
	public String toString() {
		return helper.toString();
	}

	@Override
	public Helper<X> getHelper() {
		return helper;
	}

	private final Helper<X> helper;
}
