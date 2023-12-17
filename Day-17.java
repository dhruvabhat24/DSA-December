class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
	Set<Integer> set = new HashSet<Integer>();
	
	for(int i = 0; i < nums.length; i++) {
		if (i > k) //abs value
			set.remove(nums[i-k-1]); //i cross range remove prev 
		
		if (!set.add(nums[i])) //set.add returns false if duplicate 
			return true; 
	}
	
	return false;
}
}
