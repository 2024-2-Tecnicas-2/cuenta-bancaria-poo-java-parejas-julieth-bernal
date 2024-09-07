package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // TODO: Agrega aquí el código que deseas para la Cuenta Bancaria.
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria
        System.out.println("Bienvenido al banco");
        System.out.print("Ingresa tu nombre: ");
        String titular = scanner.nextLine();
        System.out.print("Ingresa tu numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingresa tu saldo inicial: ");
        double saldo = scanner.nextDouble();

        //clase CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria(titular, numeroCuenta, saldo);

        // Saldo y  operaciones
        System.out.println("Tu saldo actual es: " + miCuenta.getSaldo());

        // Ingreso de dinero
        System.out.print("¿Cuanto dinero quieres ingresar? ");
        double cantidadIngresar = scanner.nextDouble();
        miCuenta.ingresar(cantidadIngresar);
        System.out.println("Tu nuevo saldo es: " + miCuenta.getSaldo());

        // Retiro dinero
        System.out.print("¿Cuanto dinero quieres retirar? ");
        double cantidadRetirar = scanner.nextDouble();
        miCuenta.retirar(cantidadRetirar);
        System.out.println("Tu nuevo saldo es: " + miCuenta.getSaldo());

        // Calculo de saldo
        double saldoConInteres = miCuenta.calcularInteres();
        System.out.println("Tu saldo con el interes aplicado es: " + saldoConInteres);

        scanner.close();
    }
}