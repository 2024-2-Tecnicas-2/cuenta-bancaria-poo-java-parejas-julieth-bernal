package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
        // TODO: Aquí va el código de la clase CuentaBancaria
    // Atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.5;  // Valor por defecto
    }

    // Métodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("No tienes suficiente saldo.");
        }
    }

    public double calcularInteres() {
        return saldo + (saldo * tipoInteres / 100);
    }
}