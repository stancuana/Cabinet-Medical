package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacientTest {


    @Test
    public void constructoriSiToStringTest(){

        Pacient pacient=new Pacient(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia","dureri abdominale");
        Pacient pacient1=new Pacient(2,"Pop","Maria",22,"anamaria@gmail.com","sxaxsixia","febra");

        assertEquals("Id: 1\n" +
                "Nume: Stancu\n" +
                "Prenume: Ana\n" +
                "Varsta: 19\n" +
                "Email: anamaria@gmail.com\n" +
                "Password: sxaxsixiaAfectiune: dureri abdominale\n",pacient.toString());

    }

    @Test
    public void constructoriEqualsTest(){

        Pacient pacient=new Pacient(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia","dureri abdominale");
        Pacient pacient1=new Pacient(2,"Pop","Maria",22,"anamaria@gmail.com","sxaxsixia","febra");

        assertEquals(true,pacient.equals(pacient1));

    }

    @Test
    public void constructoriCompareToTest(){

        Pacient pacient=new Pacient(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia","dureri abdominale");
        Pacient pacient1=new Pacient(2,"Pop","Maria",22,"anamaria@gmail.com","sxaxsixia","febra");

        assertEquals(1,pacient.compareTo(pacient1));

    }
}