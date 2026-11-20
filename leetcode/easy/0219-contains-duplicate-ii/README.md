# Contains Duplicate II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return `true`  *if there are two  **distinct indices*** `i` *and* `j` *in the array such that* `nums[i] == nums[j]` *and* `abs(i - j) <= k`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], k = 3
Output: true

```

 **Example 2:** 

```
Input: nums = [1,0,1,1], k = 1
Output: true

```

 **Example 3:** 

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-11-20T15:10:22.455Z  

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        int sub=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                     sub = j-i;
                      if(sub<=k){
                        flag = true;
                    }
                  }
                
            }
        }
        return flag;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)