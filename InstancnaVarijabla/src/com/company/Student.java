package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ime;
    private String prezime;
    private String datumrodjenja;
    private int brIndeksa;
    private int godina;
    private List<Integer> ocene = new ArrayList<>();

    public Student() {
    }

    public Student(String ime, String prezime, String datumrodjenja, int brIndeksa, int godina, List<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumrodjenja = datumrodjenja;
        this.brIndeksa = brIndeksa;
        this.godina = godina;
        this.ocene = ocene;
    }

    public Student(String ime, String prezime, String datumrodjenja, int brIndeksa, int godina) {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatumrodjenja() {
        return datumrodjenja;
    }

    public void setDatumrodjenja(String datumrodjenja) {
        this.datumrodjenja = datumrodjenja;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public List<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(List<Integer> ocene) {
        this.ocene = ocene;
    }

    public void dodajPolozeniIspit(int ocena) {
        if (ocene.size() < 32) {
            if (ocena < 5 || ocena > 10) {
                JOptionPane.showMessageDialog(null, "Ocena nije validna");
            } else {
                ocene.add(ocena);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Lista ocena sadrzi maksimalan broj elemenata");
        }
    }
    public double racunajProsek(){
        int suma = 0;
        for(int ocena : ocene){
            suma +=ocena;
        }
        return (double)suma/ocene.size();
    }
    public boolean studentBrucos(){
        return (this.getGodina() == 1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datumrodjenja='" + datumrodjenja + '\'' +
                ", brIndeksa=" + brIndeksa +
                ", godina=" + godina +
                ", ocene=" + ocene +
                '}';
    }
}
