package com.company.controllers;

import com.company.model.Doctor;
import com.company.model.Pacient;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllPacient implements Controller{

    private ArrayList<Pacient> pacients;

    public ControllPacient(){

        this.pacients =new ArrayList<>();
        load();
    }

    @Override
    public void load(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CabinetMedical\\src\\com\\company\\resources\\Pacienti.txt");
            Scanner scanner=new Scanner(file);

            while (scanner.hasNextLine()){

                String text=scanner.nextLine();
                Pacient pacient=new Pacient(text);

                pacients.add(pacient);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Pacient pacient: pacients){
            System.out.println(pacient.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Pacient pacient=(Pacient) obj;
        this.pacients.add(pacient);
    }

    @Override
    public int nextAvailableId() {
        if(pacients.size()>0){
            return pacients.get(pacients.size()-1).getId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< pacients.size(); i++){
            if(pacients.get(i).getId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {

        Pacient pacient=(Pacient) obj;

        int poz=pozById(pacient.getId());

        if(poz>-1){
            this.pacients.get(poz).setVarsta(pacient.getVarsta());
            this.pacients.get(poz).setEmail(pacient.getEmail());
            this.pacients.get(poz).setPassword(pacient.getPassword());
            this.pacients.get(poz).setAfectiune(pacient.getAfectiune());
        }

    }

    @Override
    public void delete(int id) {

        int poz=pozById(id);

        if(poz>-1){
            this.pacients.remove(poz);
        }
    }


    public Pacient returnarePacientByEmail(String email, String password){
        for(int i=0; i<pacients.size();i++){
            if(pacients.get(i).getEmail().equals(email) && pacients.get(i).getPassword().equals(password)){
                return pacients.get(i);
            }
        }
    return null;
    }

    public int returnareIdPacientByNumePacient(String nume){
        for(int i=0; i<pacients.size();i++){
            if(pacients.get(i).getNume().equals(nume)){
                return pacients.get(i).getId();
            }
        }
        return 0;
    }



}
