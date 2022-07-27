package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @Test
    public void constructoriSiToStringTest(){

        Persoana persoana=new Persoana(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia");
        Persoana persoana1=new Persoana(2,"Pop","Maria",22,"anamaria@gmail.com","sxaxsixia");

        assertEquals("Id: 1\n" +
                "Nume: Stancu\n" +
                "Prenume: Ana\n" +
                "Varsta: 19\n" +
                "Email: anamaria@gmail.com\n" +
                "Password: sxaxsixia",persoana.toString());

    }

    @Test
    public void constructoriEqualsTest(){

        Persoana persoana=new Persoana(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia");
        Persoana persoana1=new Persoana(2,"Pop","Maria",22,"popmairia","sxaxsixia");

        assertEquals(false,persoana.equals(persoana1));

    }

    @Test
    public void constructoriCompareToTest(){

        Persoana persoana=new Persoana(1,"Stancu","Ana",19,"anamaria@gmail.com","sxaxsixia");
        Persoana persoana1=new Persoana(2,"Pop","Maria",22,"popmairia","sxaxsixia");

        assertEquals(1,persoana.compareTo(persoana1));

    }



}