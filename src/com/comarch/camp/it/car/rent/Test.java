package com.comarch.camp.it.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
        String haslo = "admin123";

        String hash = DigestUtils.md5Hex(haslo);

        System.out.println(hash);
        //9a5643133b01ccaea7ab1f754fe6e50a
    }
}
