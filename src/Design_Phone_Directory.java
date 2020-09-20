//Time Complexity :O(1)
//Space Complexity : O(n), maxnumbers
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this : No


import java.util.*;

class PhoneDirectory {
	/** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
	Set<Integer> set;
	public PhoneDirectory(int maxNumbers) {
		set = new HashSet<>();
		for(int i=0; i<maxNumbers; i++)
			set.add(i);
	}

	/** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
	public int get() {
		int result = -1;
		for(int i : set){
			result = i;
			break;
		}
		set.remove(result);

		return result;
	}

	/** Check if a number is available or not. */
	public boolean check(int number) {
		return set.contains(number);
	}

	/** Recycle or release a number. */
	public void release(int number) {
		set.add(number);
	}
}