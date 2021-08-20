package com.example.demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import com.example.demo.model.Person;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringBootJ8FuncionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJ8FuncionalApplication.class, args);

		System.out.println("¡¡¡ Start the JOB !!!");

		System.out.println("Set the Person object:");

		Person p1 = new Person(1, "Cani", LocalDate.of(1987, 11, 11));
		Person p2 = new Person(2, "Code", LocalDate.of(1990, 2, 21));
		Person p3 = new Person(3, "Jaime", LocalDate.of(1980, 6, 23));
		Person p4 = new Person(4, "Beni", LocalDate.of(2012, 8, 16));
		Person p5 = new Person(5, "James", LocalDate.of(2020, 5, 15));

		System.out.println("Set the Product object:");

		Product pr1 = new Product(1, "Arroz", 15.00);
		Product pr2 = new Product(2, "Arrina", 25.50);
		Product pr3 = new Product(3, "Trigo", 35.50);
		Product pr4 = new Product(4, "Soja", 15.00);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);

		/* Trabajar con las Listas */

		/*
		 * Programación Imperativa (Paradicma Tradicional) Pensamos en el ¿Como lo
		 * necesitamos?
		 */

//		for(Person p: persons) {
//			System.out.println(p);
//		}

		/*
		 * Programación Funcional (Paradigma Funcional) Pensamos en el ¿Que necesitamos?
		 */

		/*
		 * Lambda: Porcion de codigo reutilizable en un espacio de tiempo. Esta
		 * compuesta por: - izquierda: parametro de la iteración - derecha: funcion de
		 * lo que vamos a hacer con ese parametro
		 */

		// 1- forEach:
//		persons.forEach(p -> System.out.println(p));
//		persons.forEach(System.out::println); //forma resumida method reference (cuando el parametro de la la derecha es = a de la izquierda)

		//Stream() -> metodo que permite trabajar con colecciones de manera declarativa (tipo SQL)
		
		// 2-Filter (param: Predicate) para filtrar datos en los streams
		List<Person> filteredList1 = persons.stream()
										// Filtra el resultado
										.filter(p -> getAge(p.getBirthDate()) >= 18)
										// Lo convierte en coleccion
										.collect(Collectors.toList());

		printList(filteredList1);

		// 3-Map (param: Function) para transformar los datos
		List<Integer> filteredList2 = persons.stream()
										// Filtra el resultado
										.filter(p -> getAge(p.getBirthDate()) >= 18)
										// Transforma los datos, en este caso retorna un Int con el resultado de la Edad
										.map(p -> getAge(p.getBirthDate()))
										// Lo convierte en coleccion
										.collect(Collectors.toList());
		
		printList(filteredList2);

		// 4-
		// 5-

	}

	public static int getAge(LocalDate birthDate) {

		int result = 0;
		if (birthDate != null) {
			result = Period.between(birthDate, LocalDate.now()).getYears();
		}
		return result;
	}

	public static void printList(List<?> list) {
		list.forEach(System.out::println);
	}

}
