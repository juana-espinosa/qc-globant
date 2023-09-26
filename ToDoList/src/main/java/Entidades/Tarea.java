/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author juana
 */
public class Tarea {

    String name;
    String description;
    boolean check = false;
    int id;
//constructor parametrizado

    public Tarea(String name, String description, boolean check, int id) {
        this.name = name;
        this.description = description;
        this.check = check;
        this.id = id;
    }
//constructor vacio

    public Tarea() {
    }
//gets

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCheck() {
        return check;
    }
//sets

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setId(int id) {
        this.id = id;
    }
}
