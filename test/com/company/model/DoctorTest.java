package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    public void constructoriSiToStringTest(){

        Doctor doctor=new Doctor("1,Frincu,George,35,gfrincu@gmail.com,sjdqy3,chirurgie,venerologie");
        assertEquals("Id: 1\n" +
                "Nume: Frincu\n" +
                "Prenume: George\n" +
                "Varsta: 35\n" +
                "Email: gfrincu@gmail.com\n" +
                "Password: sjdqy3Sectia: 1\n" +
                "Specializarea: Frincu\n",doctor.toString());

    }

    @Test
    public void constructoriEqualsTest(){

        Doctor doctor=new Doctor("1,Frincu,George,35,gfrincu@gmail.com,sjdqy3,chirurgie,venerologie");
        Doctor doctor1=new Doctor("2,Dionosie,Ioana,25,ioana45@gmail.com,ahduwye,dermatologie,patologii");
        assertEquals(false,doctor.equals(doctor1));

    }

    @Test
    public void constructoriCompareToTest(){

        Doctor doctor=new Doctor("1,Frincu,George,35,gfrincu@gmail.com,sjdqy3,chirurgie,venerologie");
        Doctor doctor1=new Doctor("2,Dionosie,Ioana,25,ioana45@gmail.com,ahduwye,dermatologie,patologii");
        assertEquals(1,doctor.compareTo(doctor1));
    }

}