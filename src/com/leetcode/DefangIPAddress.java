package com.leetcode;

class DefangIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}