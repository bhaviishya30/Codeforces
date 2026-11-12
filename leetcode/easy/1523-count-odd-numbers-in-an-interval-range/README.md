# Count Odd Numbers in an Interval Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-negative integers `low` and `high`. Return the  *count of odd numbers between* `low` *and* `high` *(inclusive)*.

 

Original
Java
 **Example 1:** 

```
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
```

 **Example 2:** 

```
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
```

 

 **Constraints:** 

- 0 <= low <= high <= 10^9

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.2 MB  
**Submitted:** 2026-11-12T16:54:03.304Z  

```java
class Solution {
    public int countOdds(int low, int high) {
        int c=0;
       int i=low;
       int j=high;
        if(i==j && i%2==0){
            return 0;
        }
        if(i==j && i%2!=0){
            return 1;
        }

       while(i<j){
       
        if(i%2!=0){
            c++;
        }
        if( j%2!=0){
            c++;
        }
        i++;
        j--;
       }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)