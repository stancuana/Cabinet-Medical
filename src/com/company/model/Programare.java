package com.company.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Programare implements Comparable<Programare> {

    private LocalDateTime dateInceput;
    private LocalDateTime dateSfarsit;

    //"dd,mm,yyyy,hh,mm"

    public Programare(String dateInceput, String dateSfarsit){

        int ddi=Integer.parseInt(dateInceput.split(",")[0]);
        int mmi=Integer.parseInt(dateInceput.split(",")[1]);
        int yyi=Integer.parseInt(dateInceput.split(",")[2]);
        int hhi=Integer.parseInt(dateInceput.split(",")[3]);
        int mini=Integer.parseInt(dateInceput.split(",")[4]);
        int dds=Integer.parseInt(dateSfarsit.split(",")[0]);
        int mms=Integer.parseInt(dateSfarsit.split(",")[1]);
        int yys=Integer.parseInt(dateSfarsit.split(",")[2]);
        int hhs=Integer.parseInt(dateSfarsit.split(",")[3]);
        int mins=Integer.parseInt(dateSfarsit.split(",")[4]);

        this.dateInceput=LocalDateTime.of(yyi,mmi,ddi,hhi,mini);
        this.dateSfarsit=LocalDateTime.of(yys,mms,dds,hhs,mins);
    }


    public Duration getDurata(){
        return Duration.between(dateInceput,dateSfarsit);
    }

    public LocalDateTime getDateInceput(){

        return dateInceput;
    }

    public LocalDateTime getDateSfarsit(){

        return dateSfarsit;
    }

    public void setDateInceput(LocalDateTime di){
        this.dateSfarsit=di;
    }

    public void setDateSfarsit(LocalDateTime ds){
        this.dateSfarsit=ds;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
        return "Programare: "+dateInceput.format(formatter)+"\n"+
                "Final: "+dateSfarsit.format(formatter)+"\n"+
                "Durata: "+this.getDurata().toMinutes()+" minute";
    }
    //false->nu se suprapun
    @Override
    public boolean equals(Object object){

        Programare programare=(Programare) object;

        if(this.dateInceput.compareTo(programare.dateInceput)<0&&this.dateSfarsit.compareTo(programare.dateInceput)<0){
            return  false;
        }
        if(this.dateInceput.compareTo(programare.dateSfarsit)>0 &&this.dateSfarsit.compareTo(programare.dateSfarsit)>0){
            return false;
        }

        return  true;
    }

    @Override
    public int compareTo(Programare programare){
        if(this.dateInceput.compareTo(programare.dateInceput)>0){
            return 1;
        }else if(this.dateInceput.compareTo(programare.dateInceput)<0){

            return -1;
        }
        return 0;
    }


}
