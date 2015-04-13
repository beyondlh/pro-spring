package com.wiley.beginningspring;

import com.wiley.beginningspring.entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Благодатских С.
 */
public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		/*
		 Student student = new Student();
		 student.setFirstName("Basa");
		 student.setLastName("Serge");
		 Book book1 = new Book();
		 book1.setName("Grosse Buch");
		 Book book2 = new Book();
		 book2.setName("Mitwessen Buch");

		 student.getBooks().add(book1);
		 student.getBooks().add(book2);
		 entityManager.persist(student);
		 */
		/*
		 Student student = entityManager.find(Student.class, 1L);
		 Book book2 = entityManager.getReference(Book.class, 2L);
		 student.setFirstName("Joe");
		 entityManager.remove(book2);
		 */
		Query query = entityManager.createQuery(
				"select s from Student s where s.firstName like ?");
		query.setParameter(1, "Jo%");
		List<Student> students = query.getResultList();
		Student s = students.get(0);
		System.out.println(students.size());
		System.out.println(s.getFirstName());

		transaction.commit();
		entityManager.close();
		emf.close();

	}
}
