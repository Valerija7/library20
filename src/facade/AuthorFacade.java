/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Author;
import javax.persistence.EntityManager;
import tools.Singleton;

/**
 *
 * @author valera
 */
public class AuthorFacade extends AbstractFacade<Author>{
   
    private EntityManager em;
    
    public AuthorFacade(Class<Author> entityClass) {
        super(entityClass);
        init();
    }

    private void init(){
        Singleton singleton = Singleton.getInstance();
        em = singleton.getEntityManager();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
