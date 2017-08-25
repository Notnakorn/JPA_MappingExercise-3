/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Anton
 */
public class main {
    
    
    public static void main(String[] args) {
        
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_JPA_MappingExercise_3_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    
    // When I used the auto inheritance (Single_Tabel) only one discountType 
    // tabel was created.
    // This tabel had an ID and a DType (used to determine what class they are 
    // from) and the attributes from the subclasses.
    // No parameters were specified in either 
    // of the subclasses so nothing else where shown in the table.
    
    // When I used the Joined inheritance type. I now had 3 different discount
    // tables. One for each class. Each with their own variables. And the 
    // discountType was the only one with a DType this is used to join the
    // other tables by the ORM in case of a query. 
    
    //For possible implementation of database transaction later.
    try{
    em.getTransaction().begin();
    em.getTransaction().commit();
    }
    
    finally{
    em.close();
    }   
        
    }
    

    
}
