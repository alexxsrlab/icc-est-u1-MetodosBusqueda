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
        showPersonByName();
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
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    

    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
    
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre '" + nameToFind + "' encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}