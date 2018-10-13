/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.managedbeans;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.services.BlogServices;
import edu.eci.pdsw.services.ServicesException;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jfmor
 */
public class BadBean extends BasePageBean{
    
    	@Inject
	private BlogServices blogServices;

         public List<Comment> getBad() throws Exception {
            try {
                return blogServices.searchOffensiveLanguageComments();
            } catch (ServicesException ex) {

                    throw ex;
            }

	}
       public void setBad(String content){
           
       }
       
}
