package com.company.model;

public class Doctor extends Persoana{

    private String sectia;
    private String specializare;


    public Doctor(String atibute){

        super(atibute);
        this.sectia=atibute.split(",")[6];
        this.specializare=atibute.split(",")[7];
    }

    public Doctor(int id, String nume, String prenume, int varsta, String email, String password,String sectia, String specializare){

        super(id,nume,prenume,varsta,email,password);
        this.sectia=sectia;
        this.specializare=specializare;
    }



    public String getSectia() {
        return sectia;
    }

    public void setSectia(String sectia) {
        this.sectia = sectia;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }



    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Sectia: "+this.sectia+"\n"+
                "Specializarea: "+this.specializare+"\n";
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
