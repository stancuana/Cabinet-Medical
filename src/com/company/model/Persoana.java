package com.company.model;

public class Persoana implements Comparable<Persoana>{

    private int id;
    private String nume;
    private String prenume;
    private int varsta;
    private String email;
    private String password;


    public Persoana(int id, String nume, String prenume, int varsta, String email, String password){
        this.id=id;
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.email=email;
        this.password=password;
    }

    public Persoana(String atribute){

        this.id=Integer.parseInt(atribute.split(",")[0]);
        this.nume=atribute.split(",")[1];
        this.prenume=atribute.split(",")[2];
        this.varsta=Integer.parseInt(atribute.split(",")[3]);
        this.email=atribute.split(",")[4];
        this.password=atribute.split(",")[5];
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString(){

        return "Id: "+this.id+"\n"+
                "Nume: "+this.nume+"\n"+
                "Prenume: "+this.prenume+"\n"+
                "Varsta: "+this.varsta+"\n"+
                "Email: "+this.email+"\n"+
                "Password: "+this.password;
    }

    @Override
    public boolean equals(Object object){

        Persoana persoana=(Persoana) object;

        return (this.email.equals(persoana.email));
    }

    @Override
    public int compareTo(Persoana persoana){

        if(this.nume.compareTo(persoana.nume)>0){

            return 1;
        }else if(this.nume.compareTo(persoana.nume)<0){

            return -1;
        }
        return 0;
    }
}
