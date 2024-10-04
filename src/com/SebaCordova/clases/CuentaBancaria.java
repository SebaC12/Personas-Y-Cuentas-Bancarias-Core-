package com.SebaCordova.clases;

import java.util.ArrayList;

public class CuentaBancaria {
	private double saldo;
	private int numeroCuenta;
	private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
	private Persona titular;
	
	public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta();
        listaDeCuentasBancarias.add(this);
    }
	
	private int generarNumeroCuenta() {
		int numero = (int)(Math.random() * 900000) + 100000;
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	public void depositar(double monto) {
        saldo += monto;
    }
	
	public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
	
	public void despliegaInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Titular:");
        titular.despliegaInformacion();
    }
	
	public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("--------------------");
        }
    }
}