package net.ausiasmarch.compraCoche.modelo;

/**
 *
 * @author
 */
public class CompraCoche {

    private String acabado, motor, tipoMotor, pago;
    private int puertas;
    private double precioBase;
    private boolean navegador, aparcamiento, rojo, blanco, metalizada;
    private final double TASA_INTERES = 0.8;
    private TipoPago tipoPago;
    private String mensaje;
    private StringBuilder sb;

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isNavegador() {
        return navegador;
    }

    public void setNavegador(boolean navegador) {
        this.navegador = navegador;
    }

    public boolean isAparcamiento() {
        return aparcamiento;
    }

    public void setAparcamiento(boolean aparcamiento) {
        this.aparcamiento = aparcamiento;
    }

    public boolean isRojo() {
        return rojo;
    }

    public void setRojo(boolean rojo) {
        this.rojo = rojo;
    }

    public boolean isBlanco() {
        return blanco;
    }

    public void setBlanco(boolean blanco) {
        this.blanco = blanco;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean validate() {
        sb = new StringBuilder();

        // El número de puertas no puede ser menor que 2 ni mayor que 5.
        if (puertas < 2 || puertas > 5) {
            sb.append("-El número de puertas no puede ser menor que 2 ni mayor que 5.\n");
        }

        // Si seleccionó motor Gasolina el tipo de motor solo puede ser TSI.
        if (motor.equals("Gasolina")) {
            if (tipoMotor.equalsIgnoreCase("TDI") || tipoMotor.equalsIgnoreCase("SDI")) {
                sb.append("-Si seleccionó motor Gasolina el tipo de motor solo puede ser TSI.\n");
            }
        }

        // Si seleccionó  motor Diesel el tipo de motor solo puede ser SDI o TDI.
        if (motor.equals("Diesel") && tipoMotor.equalsIgnoreCase("TSI")) {
            sb.append("-No puede seleccionar diesel y TSI.\n");
        }

        // Si eligió  acabado Reference no puedo elegir ni Aparcamiento Automático ni Navegador de a bordo.
        if (acabado.equals("Reference")) {
            if (navegador == true || aparcamiento == true) {
                sb.append("-Si eligió  acabado Reference no puedo elegir ni Aparcamiento Automático ni Navegador de a bordo.\n");
            }
        }

        // El Acabado Advance solo está disponible con el motor Diesel.
        if (acabado.equals("Advance") && motor.equals("Gasolina")) {
            sb.append("-El Acabado Advance solo está disponible con el motor Diesel.\n");
        }

        // Si se seleccionó color Blanco no puede elegir Pintura Metalizada.
        if (blanco == true && metalizada == true) {
            sb.append("-Si se seleccionó color Blanco no puede elegir Pintura Metalizada.\n");
        }

        // Si seleccionó acabado Style no puede elegir Aparcamiento Automatico.
        if (acabado.equals("Style") && aparcamiento == true) {
            sb.append("-Si seleccionó acabado Style no puede elegir Aparcamiento Automatico.\n");
        }

        mensaje = sb.toString();
        return mensaje.isEmpty();
    }

    public double precioTotalCoche() {

        // Si se añade el extra Navegador de a bordo el precio base se incrementa en 1200€
        if (navegador == true) {
            precioBase = precioBase + 1200;
        }

        // Si seleccionó el color rojo el precio base se incrementra en 200€
        if (rojo == true) {
            precioBase = precioBase + 200;
        }

        // Si seleccionó el Sistema de Aparcamiento Automatico el precio base se incrementra en 2500€
        if (aparcamiento == true) {
            precioBase = precioBase + 2500;
        }

        // Si seleccionó Pintura Metalizada el precio base se incrementra en 300€
        if (metalizada == true) {
            precioBase = precioBase + 300;
        }

        // Si el tipo de motor es SDI el precio base se incrementra en 200€
        if (motor.equals("SDI")) {
            precioBase = precioBase + 200;
        }

        // Si el tipo de motor es TDI el precio base se incrementra en 300€
        if (motor.equals("TDI")) {
            precioBase = precioBase + 300;
        }

        //Si el número de puertas es 4 o 5  el precio base se incrementa en 150€
        if (puertas == 4 || puertas == 5) {
            precioBase = precioBase + 150;
        }

        return precioBase;
    }

    private double interesCoche() {
        double interesCoche = 0;

        interesCoche = precioTotalCoche() * TASA_INTERES;

        return interesCoche;
    }

    public double cuotaMensualCoche() {
        double cuotaMensual = 0;
        //( precio total coche + interes coche ) / meses
        if (pago.equalsIgnoreCase(TipoPago.MESES12.toString())) {
            cuotaMensual = (interesCoche() + precioTotalCoche()) / 12;
        } else if (pago.equalsIgnoreCase(TipoPago.MESES24.toString())) {
            cuotaMensual = (interesCoche() + precioTotalCoche()) / 24;
        }

        return cuotaMensual;
    }

}
