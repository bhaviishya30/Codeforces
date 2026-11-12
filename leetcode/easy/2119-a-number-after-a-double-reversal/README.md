# A Number After a Double Reversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

**Reversing**  an integer means to reverse all its digits.

- For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.

Given an integer `num`,  **reverse**  `num` to get `reversed1`,  **then reverse**  `reversed1` to get `reversed2`. Return `true`  *if*  `reversed2`  *equals*  `num`. Otherwise return `false`.

 

Original
Java
 **Example 1:** 

```
Input: num = 526
Output: true
Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.

```

 **Example 2:** 

```
Input: num = 1800
Output: false
Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.

```

 **Example 3:** 

```
Input: num = 0
Output: true
Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.

```

 

 **Constraints:** 

- 0 <= num <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41 MB (beats 99.61%)  
**Submitted:** 2026-11-12T17:56:17.490Z  

```java
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0,rev2=0;
        int ele=num;
        while(ele!=0){
            int last=ele%10;
            rev1=rev1*10+last;
            ele/=10;
        }
          while(rev1!=0){
            int last2=rev1%10;
            rev2=rev2*10+last2;
            rev1/=10;
        }
        if(rev2==num){
            return true;
        }else{
            return false;
        }
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/a-number-after-a-double-reversal/)