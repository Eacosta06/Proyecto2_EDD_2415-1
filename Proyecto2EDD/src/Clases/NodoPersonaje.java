/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author carluchocp
 */
public class NodoPersonaje {
    private String nombreCompleto;
    private String mote;
    private NodoPersonaje padre;
    private NodoPersonaje madre;
    private String titulo;
    private NodoPersonaje esposa;
    private String colorOjos;
    private String colorCabello;
    private ListaHijos hijos;
    private String notas;
    private String destinoFinal;
    private NodoPersonaje hijo_izq;
    private NodoPersonaje hermano_der;

    public NodoPersonaje(String nombreCompleto, String mote, NodoPersonaje padre, NodoPersonaje madre, String titulo, NodoPersonaje esposa, String colorOjos, String colorCabello, ListaHijos hijos, String notas, String destinoFinal) {
        this.nombreCompleto = nombreCompleto;
        this.mote = mote;
        this.padre = padre;
        this.madre = madre;
        this.titulo = titulo;
        this.esposa = esposa;
        this.colorOjos = colorOjos;
        this.colorCabello = colorCabello;
        this.hijos = new ListaHijos(nombreCompleto);
        this.notas = notas;
        this.destinoFinal = destinoFinal;
        this.hijo_izq = null;
        this.hermano_der = null;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public NodoPersonaje getPadre() {
        return padre;
    }

    public void setPadre(NodoPersonaje padre) {
        this.padre = padre;
    }

    public NodoPersonaje getMadre() {
        return madre;
    }

    public void setMadre(NodoPersonaje madre) {
        this.madre = madre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public NodoPersonaje getEsposa() {
        return esposa;
    }

    public void setEsposa(NodoPersonaje esposa) {
        this.esposa = esposa;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public ListaHijos getHijos() {
        return hijos;
    }

    public void setHijos(ListaHijos hijos) {
        this.hijos = hijos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public NodoPersonaje getHijo_izq() {
        return hijo_izq;
    }

    public void setHijo_izq(NodoPersonaje hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    public NodoPersonaje getHermano_der() {
        return hermano_der;
    }

    public void setHermano_der(NodoPersonaje hermano_der) {
        this.hermano_der = hermano_der;
    }
}
