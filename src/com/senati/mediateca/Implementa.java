package com.senati.mediateca;

import java.util.Set; //Java colecciones: matrices, listas, arrays
import java.util.HashSet; //Java coleciones para arrays con seguridad



public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Añadir nuevos socios
		//Clase objeto = new Clase()
		Socio socio1 = new Socio();
		socio1.id=101;
		socio1.nombre="Jorge Antonio";
		socio1.apellidos="Luque Chambi";
		socio1.distrito="Los Olivos";
		
		Socio socio2 = new Socio();//Constructor vacio
		socio2.id=102;
		socio2.nombre="Esther";
		socio2.apellidos="Aquino Olivares";
		socio2.distrito="Bellavista";
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3 = new Socio(103,"Alicia","Gomez Avalos","Comas");
		System.out.println(socio3.toString());
		
		
		
		System.out.println("Lista de Socios");
			
		Socio soc1 = new Socio(104,"Jorge", "Luque","Comas");
		Socio soc2 = new Socio(105,"Maria", "Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo", "Luque","Comas");
		Socio soc4 = new Socio(107,"Alex", "Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex", "Lopez","Comas");
		
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellidos + " " + socio.distrito);
		}
		
		Libro libro1 = new Libro(11, "Matalache", "Alvaro Vargas Llosa", 50f, 300, 123);
		Libro libro2 = new Libro(12, "Realidad Peruana", "Jose Carlos Mariategui", 150f, 300, 123);
		Libro libro3 = new Libro(13, "PHP", "Jose Quevedo", 150f, 300, 123);
		Libro libro4 = new Libro(14, "Python Iot", "Jose Cabana", 450f, 300, 123);
		
		Set <Libro> librosprestados = new HashSet<Libro>();
		librosprestados.add(libro1);
		librosprestados.add(libro2);
		librosprestados.add(libro3);
		librosprestados.add(libro4);
		
		byte contador=0;
		float preciototal=0f;
		for (Libro libro : librosprestados) {
			System.out.println(libro.id + " " + libro.titulo + " " + libro.autor + " " + libro.precio);
			contador++;
			preciototal = preciototal + libro.precio;
		}
		System.out.println("Libros prestados " + contador);
		System.out.println("Monto acumulado " + preciototal);

	}

}
