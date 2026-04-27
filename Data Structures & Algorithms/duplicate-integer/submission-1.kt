// Problem: Contains Duplicate (Brute Force)
// Time Complexity: O(N^2)
// Space Complexity: O(1)
class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        // loop through every single element in arr
        for (i in 0 until nums.size){
            // loop through all elements that came before i
            for(j in 0 until i){
                // if vals match return true.
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        // if both loops finish and the function didn't return true, return false
        return false;
    }
}