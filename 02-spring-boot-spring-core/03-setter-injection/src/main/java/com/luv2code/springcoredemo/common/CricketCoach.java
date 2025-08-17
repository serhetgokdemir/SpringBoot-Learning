package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
// Spring’e sesleniyoruz: “Bu sınıftan bir object oluştur, container’a koy. Lazım olursa verirsin.”
// Şimdi artık Spring bu sınıfı proje açıldığında otomatik yaratacak.
public class CricketCoach implements Coach { //Bunu bir koç türü yaptık.
    @Override
    public String getDailyWorkuout() {
        return "20 mekik cek!!";
    }
}
