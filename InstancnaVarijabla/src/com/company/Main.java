package com.company;

import java.util.ArrayList;
import java.util.List;

class Zadatak2 {

    public static void main(String[] args) {
	// write your code here
        new Zadatak2();

    }
    public Zadatak2(){
        List<Student> studenti = new ArrayList<>();
        Student s1 = new Student("Milos","Paldon","01-01-1990",123,1);
        s1.dodajPolozeniIspit(10);
        s1.dodajPolozeniIspit(6);
        s1.dodajPolozeniIspit(9);
        s1.dodajPolozeniIspit(7);
        studenti.add(s1);
        Student s2 = new Student("Marija","Petrovic","02-02-1991",125,2);
        s2.dodajPolozeniIspit(10);
        s2.dodajPolozeniIspit(8);
        s2.dodajPolozeniIspit(8);
        s2.dodajPolozeniIspit(7);
        studenti.add(s2);
        Student s3 = new Student("Dejan","Marasevic","08-12-1988",180,3);
        s3.dodajPolozeniIspit(6);
        s3.dodajPolozeniIspit(6);
        s3.dodajPolozeniIspit(7);
        s2.dodajPolozeniIspit(6);
        studenti.add(s3);
        Student s4 = new Student("Milan","Blagojevic","07-12-1992",190,1);
        s4.dodajPolozeniIspit(6);
        s4.dodajPolozeniIspit(8);
        s4.dodajPolozeniIspit(9);
        s4.dodajPolozeniIspit(10);

        for(Student s : studenti ){
            if(s.studentBrucos()){
                System.out.println("Student je brucos");
            }
            else{
                System.out.println("Prosecna ocena je: " + s.racunajProsek());
            }
        }


    }

}
