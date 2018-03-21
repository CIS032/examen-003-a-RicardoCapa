/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3angelcapa;

/**
 *
 * @author Capa Brothers
 */
public  class Cuenta {

    private String numeroCuenta;
    private String cliente;
    private String tipo_Cuenta;
    private String Movimiento;
    private String fecha;
    private String saldo;
  
   
    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, String cliente, String tipo_Cuenta, String Movimiento, String fecha, String saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipo_Cuenta = tipo_Cuenta;
        this.Movimiento = Movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo_Cuenta() {
        return tipo_Cuenta;
    }

    public void setTipo_Cuenta(String tipo_Cuenta) {
        this.tipo_Cuenta = tipo_Cuenta;
    }

    public String getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(String Movimiento) {
        this.Movimiento = Movimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    
}
