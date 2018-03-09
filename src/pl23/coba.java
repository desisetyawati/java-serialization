/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl23;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class coba implements Serializable{
    String nim;
    String Nama;
    String Alamat;

public coba(){};

public coba(String n,String a,String l)
{
    nim = n;
    Nama = a;
    Alamat = l;
}

public String getNim(){
    return nim;
}

public void setNim(String nim){
        this.nim=nim;
}

public String getNama(){
    return Nama;
}

public void setNama(String Nama){
        this.Nama=Nama;
    }
public String getAlamat(){
    return Alamat;
}

public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
}
