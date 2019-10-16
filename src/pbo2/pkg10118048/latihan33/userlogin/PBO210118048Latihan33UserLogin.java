/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan33.userlogin;

import java.util.Scanner;


/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan hasil login
 */
public class PBO210118048Latihan33UserLogin {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        User objUser = new User();
        System.out.print("Masukkan Username = ");
        objUser.setUsername(scanner.next());
        
        System.out.print("Masukkan Password = ");
        objUser.setPassword(scanner.next());
        objUser.pengecekanLogin(objUser.getUsername(), objUser.getPassword());
    }

}
