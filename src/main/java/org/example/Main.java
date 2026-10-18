package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();

            Employee e1 = em.find(Employee.class, 324235252);
            e1.setName("Sefa soysal"); // employee objesinin ismi değişti burada

            System.out.println(e1); // employee objesinin sout'u

            em.getTransaction().commit(); // end of transaction



        }finally {
            em.close();
        }


        }
}
