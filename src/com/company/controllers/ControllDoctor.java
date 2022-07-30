package com.company.controllers;

import com.company.model.Doctor;
import jdk.jshell.JShell;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllDoctor implements Controller{

    private ArrayList<Doctor> doctors;

    public ControllDoctor(){

        this.doctors=new ArrayList<>();
        load();
    }

    @Override
    public void load(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CabinetMedical\\src\\com\\company\\resources\\Doctori.txt");
            Scanner scanner=new Scanner(file);

            while (scanner.hasNextLine()){

                String text=scanner.nextLine();
                Doctor doctor=new Doctor(text);

                doctors.add(doctor);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Doctor doctor:doctors){
            System.out.println(doctor.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Doctor doctor=(Doctor) obj;
        this.doctors.add(doctor);
    }

    @Override
    public int nextAvailableId() {
        if(doctors.size()>0){
            return doctors.get(doctors.size()-1).getId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i=0; i<doctors.size();i++){
            if(doctors.get(i).getId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {

        Doctor doctor=(Doctor) obj;

        int poz=pozById(doctor.getId());

            if(poz>-1){
                this.doctors.get(poz).setVarsta(doctor.getVarsta());
                this.doctors.get(poz).setEmail(doctor.getEmail());
                this.doctors.get(poz).setPassword(doctor.getPassword());
                this.doctors.get(poz).setSectia(doctor.getSectia());
                this.doctors.get(poz).setSectia(doctor.getSectia());
            }

    }

    @Override
    public void delete(int id) {

        int poz=pozById(id);

        if(poz>-1){
            this.doctors.remove(poz);
        }
    }

    public int returnIdDoctorByName(String nume){

        int id=0;

        for(int i=0; i<doctors.size();i++){

            if(doctors.get(i).getNume().equals(nume)){
                id=i;
            }
        }
        return id;
    }

    public Doctor returnareMedicByEmail(String email, String password){

        for(int i=0; i<doctors.size();i++){

            if(doctors.get(i).getEmail().equals(email)&& doctors.get(i).getPassword().equals(password)){

                return doctors.get(i);
            }
        }
        return null;
    }
}
