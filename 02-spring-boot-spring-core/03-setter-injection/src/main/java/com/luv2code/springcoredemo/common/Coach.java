package com.luv2code.springcoredemo.common;

public interface Coach {

    // Bu interface, farklı coach sınıflarının ortak davranışlarını tanımlar.
    // Her koç, günlük bir antrenman verir diye bir davranış tanımladık.
    String getDailyWorkuout();
}
