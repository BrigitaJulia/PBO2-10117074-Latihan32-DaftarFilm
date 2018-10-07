/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan32.daftarfilm;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Brigita Julia Puspita Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : program ini berisi program yang menampilkan daftar film 
 * yang sedang tayang
 */
public class PBO210117074Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("=== Daftar Film Sedang Tayang ===");
       
       Film film1 = new Film();
       film1.filmName = "Venom";
       film1.filmGenre = "Action, Horror, Scifi";
       film1.filmRating = 8.5;
       film1.filmDuration = 120;
       film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, 
               film1.filmDuration);
       
       Film film2 = new Film();
       film2.filmName = "Venom";
       film2.filmGenre = "Action, Horror, Scifi";
       film2.filmRating = 8.5;
       film2.filmDuration = 120;
       film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, 
               film2.filmDuration);
    }
    
}
