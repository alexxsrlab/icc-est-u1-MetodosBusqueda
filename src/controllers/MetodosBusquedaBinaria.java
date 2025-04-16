package controllers;

import models.Persona;
import views.ShowConsole;



public class MetodosBusquedaBinaria {
    
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria (Persona[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de Busqueda Binaria");
    }


    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;

        while ( alto >= bajo){
            int central = (bajo + alto)/2;

            if(people[central].getCode() == code){
                return central;
            }
            if(people[central].getCode() > code){
                alto = central - 1 ;// izquierda

            }else{
                bajo = central + 1;// derecha
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeTofind = pantalla.inmputCode();
        int indexPerson = findPersonByCode(codeTofind);

        if(indexPerson == -1 ){
            pantalla.showMessage("Persona con codigo "+ codeTofind + " no encontrada");
        }else{
            pantalla.showMessage("Persona con codigo "+ codeTofind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private void burbuja() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    private int findPersonByName (String name){
        burbuja();
        int bajo = 0;
        int alto = people.length - 1;

        while ( alto >= bajo){
            int central = (bajo + alto)/2;

            if(people[central].getName().equalsIgnoreCase(name)){
                return central;
            }
            if(people[central].getName().compareToIgnoreCase(name) > 0){
                alto = central - 1 ;// izquierda

            }else{
                bajo = central + 1;// derecha
            }
        }
        return -1;
    }


    public void showPersonByName(){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);

        if(indexPerson == -1 ){
            pantalla.showMessage("Persona con nombre "+ nameToFind + " no encontrada");
        }else{
            pantalla.showMessage("Persona con nombre "+ nameToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }


}

//poque no se pone un else if ??   porque se tiene un return antes