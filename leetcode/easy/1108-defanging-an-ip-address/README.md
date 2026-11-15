# Defanging an IP Address

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.

A  *defanged IP address*  replaces every period `"."` with `"[.]"`.

 

Original
Java
 **Example 1:** 

```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

```

 **Example 2:** 

```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

```

 

 **Constraints:** 

- The given address is a valid IPv4 address.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.5 MB (beats 67.43%)  
**Submitted:** 2026-11-15T17:02:47.256Z  

```java
class Solution {
    public String defangIPaddr(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='.'){
                 str.append("[.]");
                continue;
            }
            str.append(s.charAt(i));   
        }
        String st = str.toString();
        return st;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/defanging-an-ip-address/)