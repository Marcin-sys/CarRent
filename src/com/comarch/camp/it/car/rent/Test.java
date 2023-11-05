package com.comarch.camp.it.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
        String seed = "hq_6#%r8rPJ)zoZaIvV6X@HqMVaz;C7wNM39Rl]{hCE!YF]8Xo";
        String haslo = "mateusz123";

        String hash = DigestUtils.md5Hex(haslo+seed);

        System.out.println(hash);
        //9a5643133b01ccaea7ab1f754fe6e50a
    }
}
