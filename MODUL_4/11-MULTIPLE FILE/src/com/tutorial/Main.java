package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Ishigami Senku");
        Player player2 = new Player("Dr Stone");
        Player player3 = new Player("Shone Hinata");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Hallo");
    }
}
