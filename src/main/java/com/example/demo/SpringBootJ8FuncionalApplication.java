package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Person;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringBootJ8FuncionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJ8FuncionalApplication.class, args);
		
		System.out.println("¡¡¡ Start the JOB !!!");
		
		System.out.println("Set the Person object:");
		
		Person p1 = new Person(1,"Cani", LocalDate.of(1991, 1, 21));
		Person p2 = new Person(2,"Code", LocalDate.of(1990, 2, 21));
		Person p3 = new Person(3,"Jaime", LocalDate.of(1980, 6, 23));
		Person p4 = new Person(4,"Duke", LocalDate.of(2019, 5, 15));
		Person p5 = new Person(5,"James", LocalDate.of(2010, 1, 14));
		
		System.out.println("Set the Product object:");
		
		Product pr1 = new Product(1, "Arroz", 15.00);
		Product pr2 = new Product(2, "Arrina", 25.50);
		Product pr3 = new Product(3, "Trigo", 35.50);
		Product pr4 = new Product(4, "Soja", 15.00);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		List<Product> products = Arrays.asList(pr1,pr2,pr3,pr4);
		
		/*Trabajar con las Listas*/
		
		/*	Programación Imperativa (Paradicma Tradicional)
		  	Pensamos en el ¿Como lo necesitamos?	*/
		
//		for(Person p: persons) {
//			System.out.println(p);
//		}
		
		/*	Programación Funcional (Paradigma Funcional)
			Pensamos en el ¿Que necesitamos?	*/
		
		/*Lambda: Porcion de codigo reutilizable en un espacio de tiempo. 
		 *	Esta compuesta por:
		 * 	- izquierda: parametro de la iteración
		 * 	- derecha: funcion de lo que vamos a hacer con ese parametro
		 */
		
	
		//1- forEach: 
//		persons.forEach(p -> System.out.println(p));
//		persons.forEach(System.out::println); //forma resumida method reference (cuando el parametro de la la derecha es = a de la izquierda)
		
		//2-Filter (param: Predicate)
		
		
		
		
		
		
		
		
		
		
		
	}

}
