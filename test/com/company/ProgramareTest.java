package com.company;


import com.company.model.Programare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramareTest {

    @Test
    public void proframareTest(){

        //"dd,mm,yyyy,hh,mm"
        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        System.out.println(programare);
    }

    @Test
    public void equlasTest1(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,15,30","07,08,2022,16,30");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest2(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,13,30","07,08,2022,14,30");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest3(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,14,40","07,08,2022,15,00");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest4(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,13,30","07,08,2022,16,00");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest5(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,15,00","07,08,2022,16,30");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest6(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,15,10","07,08,2022,16,00");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest7(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,14,30","07,08,2022,15,30");

        assertEquals(true,programare.equals(programare1));
    }

    @Test
    public void equlasTest8(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,15,40","07,08,2022,16,30");

        assertEquals(false,programare.equals(programare1));
    }

    @Test
    public void equlasTest9(){

        Programare programare=new Programare("07,08,2022,14,30","07,08,2022,15,30");
        Programare programare1=new Programare("07,08,2022,13,40","07,08,2022,14,20");

        assertEquals(false,programare.equals(programare1));
    }




}