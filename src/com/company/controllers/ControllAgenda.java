package com.company.controllers;

import com.company.model.Agenda;
import com.company.model.Programare;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllAgenda implements Controller{

    private ArrayList<Agenda> agenda;

    public ControllAgenda(){

        this.agenda =new ArrayList<>();
        load();
    }

    @Override
    public void load(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CabinetMedical\\src\\com\\company\\resources\\Programari.txt");
            Scanner scanner=new Scanner(file);

            while (scanner.hasNextLine()){

                String text=scanner.nextLine();
                Agenda agenda=new Agenda(text);

                this.agenda.add(agenda);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Agenda agenda: agenda){
            System.out.println(agenda.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Agenda agenda=(Agenda) obj;
        this.agenda.add(agenda);
    }

    @Override
    public int nextAvailableId() {
        if(agenda.size()>0){
            return agenda.get(agenda.size()-1).getDoctorId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< agenda.size(); i++){
            if(agenda.get(i).getId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {

        Agenda agenda1 = (Agenda) obj;

        int poz = pozById(agenda1.getId());
        if(poz>-1){
            this.agenda.get(poz).setDoctorId(agenda1.getDoctorId());
            this.agenda.get(poz).setPacientId(agenda1.getPacientId());
            this.agenda.get(poz).setProgramare(agenda1.getProgramare());
        }

    }

    @Override
    public void delete(int id) {
        int poz=pozById(id);
        if(poz>-1){
            this.agenda.remove(poz);
        }
    }

    public void sortareAgendaDupaProgramari(){
        int flag=1;
        do{
            for(int i=0; i<agenda.size()-1;i++){

                flag=1;

                if(this.agenda.get(i).getProgramare().compareTo(this.agenda.get(i+1).getProgramare())>0){
                    Agenda aux=this.agenda.get(i);
                    this.agenda.set(i,this.agenda.get(i+1));
                    this.agenda.set(i+1,aux);

                    flag=0;
                }
            }
        }while (flag==0);
    }

    public boolean verificareSuprapunereProgramari(Programare programare){

        for(int i=0; i<agenda.size();i++){
            if(agenda.get(i).getProgramare().compareTo(programare)==1){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}