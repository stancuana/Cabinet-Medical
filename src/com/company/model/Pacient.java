package com.company.model;

public class Pacient extends Persoana{


    private String afectiune;


    public Pacient(String atribute){

        super(atribute);
        this.afectiune=atribute.split(",")[6];
    }

    public Pacient(int id, String nume, String prenume, int varsta, String email, String password,String afectiune){

        super(id,nume,prenume,varsta,email,password);
        this.afectiune=afectiune;

    }



    public String getAfectiune() {
        return afectiune;
    }

    public void setAfectiune(String afectiune) {
        this.afectiune = afectiune;
    }


    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Afectiune: "+this.afectiune+"\n";
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int compareTo(Persoana persoana) {
        return super.compareTo(persoana);
    }



}
