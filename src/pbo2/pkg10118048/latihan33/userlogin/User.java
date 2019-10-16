/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan33.userlogin;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan hasil login
 */
public class User {
    private String username, password;
    private boolean statusAkun;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatusAkun() {
        return statusAkun;
    }

    public void setStatusAkun(boolean statusAkun) {
        this.statusAkun = statusAkun;
    }
    
    private boolean cekAkun(String parUserName, String parPassword) {
        if (username.equals("RizkiAdam") && password.equals("terbaikselalu"))
            statusAkun = true;
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if (statusAkun == true)
            System.out.println("\n******HALLO RIZKIADAM******"
                    + "\nSelamat Datang di Aplikasi ini");
        else
            System.out.println("\nOoops, Username atau Password anda salah");
    }
    
    public void pengecekanLogin(String parUserName, String parPassword) {
        cekAkun(username, password);
        hasilLogin(statusAkun, password);
    }
}
