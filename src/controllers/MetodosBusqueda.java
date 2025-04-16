package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona [] people;

    
    public MetodosBusqueda(Persona [] personas){
        showConsole = new ShowConsole();
        this.people = personas;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    /*
     * @param code a buscar
     * @return posicion de la persona buscada
     */
    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++){
            if (people [i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeTofind = showConsole.inmputCode();
        int indexPerson = findPersonByCode(codeTofind);
        if (indexPerson >=0){
            showConsole.showMessage("Persona con codigo "+codeTofind+ " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
            //showConsole.showMessage(people[indexPerson]+"");
        }else{
            showConsole.showMessage("Persona no encontrada");
        }

    }

    public int findPersonByName(String name){
        return -1;
    }

    public void showPersonByName(){
        String nameTofinde = showConsole.inputName();
        int indexPerson = findPersonByName(nameTofinde);
    }
}