package com.tutorial;

//import pac
import com.terminal.Console;
//visibiliti default hanya bisa diakses oleh
//package yang sama
class Player {
    //variable objek
    private String nama;

    //konstruktor
    Player(String nama){
        this.nama = nama;
    }

    //method cetak
    void cetak(){
        System.out.println("Nama : " + this.nama);
        Console.log("Menggunakan Console");
        Console.log("");
    }

    //method getter
    String getName(){
        return this.nama;
    }

}