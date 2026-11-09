# Count Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of prime numbers that are strictly less than*  `n`.

 

 **Example 1:** 

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

```

 **Example 2:** 

```
Input: n = 0
Output: 0

```

 **Example 3:** 

```
Input: n = 1
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 5 * 106

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 40.6 MB  
**Submitted:** 2026-11-09T06:23:44.357Z  

```java
class Solution {
    public int countPrimes(int n) {
        int c=0;
     for(int i=2;i<n;i++){
        int ele=i;
        if(ele==2) c++;
        if(ele==3) c++;
        boolean flag=false;
        for(int j=2;j<ele;j++){
            if(ele%j==0){
               flag=true;
            }
        }
        if(!flag){
            c++;
        }
            
    }
    return c;
     
    }
}


```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)