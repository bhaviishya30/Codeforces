# Single Element in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return  *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.6 MB  
**Submitted:** 2026-11-22T15:11:53.051Z  

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
               return nums[i];
            }
        }
        return 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)