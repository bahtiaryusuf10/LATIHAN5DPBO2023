/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author yusuf
 */
public class Mahasiswa {
    private long nim;
    private String nama;
    private String nilai;
    private String gender;
    
    public Mahasiswa(long nim, String nama, String nilai, String gender){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.gender = gender;
    }
    
    public void setNim(long nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public long getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNilai() {
        return this.nilai;
    }
    
    public String getGender(){
        return this.gender;
    }
}
