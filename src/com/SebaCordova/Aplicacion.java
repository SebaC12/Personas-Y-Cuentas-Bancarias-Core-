package com.SebaCordova;

import com.SebaCordova.clases.CuentaBancaria;
import com.SebaCordova.clases.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		//Crear Personas:
		Persona maxi = new Persona("Maximiliano Matamala", 20);
		Persona ayline = new Persona("Ayline Tonta", 19);
		Persona fran = new Persona("Francisca Rivas", 23);
		
		//Crear Cuentas Bancarias:
		CuentaBancaria cuenta1 = new CuentaBancaria(2000.0, maxi);
		CuentaBancaria cuenta2 = new CuentaBancaria(2500.0, ayline);
		CuentaBancaria cuenta3 = new CuentaBancaria(3000.0, fran);
		
		// Realizar operaciones de depósito y retiro
        cuenta1.depositar(1000.0);
        cuenta1.retirar(100.0);
        cuenta2.depositar(300.0);
        cuenta2.retirar(200.0);
        cuenta3.depositar(10000.0);
        System.out.println("-------------");
        
     // Imprimir saldo actual de cada cuenta
        System.out.println("Saldos actuales:");
        System.out.println("Cuenta 1: $" + cuenta1.getSaldo());
        System.out.println("Cuenta 2: $" + cuenta2.getSaldo());
        System.out.println("Cuenta 3: $" + cuenta3.getSaldo());
        System.out.println("-------------");
        
        System.out.println("Información de todas las cuentas:");
        System.out.println("-------------");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
        System.out.println("-------------");
	}
}
