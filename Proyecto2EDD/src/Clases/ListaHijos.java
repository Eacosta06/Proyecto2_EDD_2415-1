/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author carluchocp
 */
public class ListaHijos {
    private NodoHijos pFirst;
    private String nombre;
    private int iN;

    public ListaHijos(String nombre) {
        this.pFirst = null;
        this.nombre = nombre;
        this.iN = 0;
    }

    public NodoHijos getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoHijos pFirst) {
        this.pFirst = pFirst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getiN() {
        return iN;
    }
}
