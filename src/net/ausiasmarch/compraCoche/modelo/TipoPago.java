/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.compraCoche.modelo;

/**
 *
 * @author Toni
 */
public enum TipoPago {
    CONTADO, MESES12, MESES24;

    @Override
    public String toString() {
        String tipo = "";

        switch (this) {
            case CONTADO:
                tipo = "Contado";
                break;
            case MESES12:
                tipo = "12 meses";
                break;
            case MESES24:
                tipo = "24 meses";
                break;
        }

        return tipo;
    }

}
