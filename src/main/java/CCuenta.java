/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1cfgs
 */
public class CCuenta {

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterÃ
     */
    public double getTipoInterÃ() {
        return tipoInterÃ;
    }

    /**
     * @param tipoInterÃ the tipoInterÃ to set
     */
    public void setTipoInterÃ(double tipoInterÃ) {
        this.tipoInterÃ = tipoInterÃ;
    }

    /**
     * @return the getTipoInterÃ
     */
    public double getGetTipoInterÃ() {
        return getTipoInterÃ;
    }

    /**
     * @param getTipoInterÃ the getTipoInterÃ to set
     */
    public void setGetTipoInterÃ(double getTipoInterÃ) {
        this.getTipoInterÃ = getTipoInterÃ;
    }
    
      private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterÃ©;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private double getTipoInterÃ©s() {
        return getTipoInterÃ()©s;
    }


    public void setTipoInterÃ©s(double tipoInterÃ©s) {
        ©s = tipoInterÃ©s;
    }
    
}
