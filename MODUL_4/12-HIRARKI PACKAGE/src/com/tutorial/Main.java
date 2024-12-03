package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;
class Main{
    public static void main(String[] args) {
        //membuat objek
        Player player1 = new Player("Ishigami Senku");
        player1.cetak();

        Console.log("Menampilan data dari console");
        Console.log("Player Nama : " + player1.getName());

        log("Menggunakan Static method log");
        log(player1.getName());
    }
}