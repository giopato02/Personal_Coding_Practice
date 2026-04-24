// Given an integer array nums, 
// return true if any value appears more 
// than once in the array, otherwise return false.

// Soltuion 1: Brute force
// Time Complexity: O(N^2)
// Space Complexity: O(1)

class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        // Loop through every item in the array
        for (i in 0 until nums.size) {
            // Loop through all items that came BEFORE i
            for (j in 0 until i) {
                // If the values match, we found a duplicate!
                if (nums[i] == nums[j]) {
                    return true 
                }
            }
        }
        // If both loops finish and find nothing, return false
        return false
    }
}

// Solution 2: HashSet
// Time Complexity: O(N)
// Space Complexity: O(N)

class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        
        for (i in 0 until nums.size) {
            // Check if the memory box already has the number
            if (seen.contains(nums[i])) {
                return true
            }
            // If not, drop it in the box
            seen.add(nums[i])
        }
        
        // If we check every number and find no duplicates
        return false
    }
}

// Solution 3: One Liner Cheat Code
class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size < nums.size
    }
}