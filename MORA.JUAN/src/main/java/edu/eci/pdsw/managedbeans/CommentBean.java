package edu.eci.pdsw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.pdsw.entities.Blog;
import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.services.BlogServices;
import edu.eci.pdsw.services.ServicesException;


    @SuppressWarnings("deprecation")
    @ManagedBean(name = "CommentBean")
    @RequestScoped
public class CommentBean extends BasePageBean {
	
        
        @ManagedProperty(value = "#{param.title}")
        private String title;

	@Inject
	private BlogServices blogServices;

        
       public List<Comment> getComment() throws Exception {
            try {
                return blogServices.searchCommentsByBlogTitle(title);
            } catch (ServicesException ex) {

                    throw ex;
            }

	}
       public void setComment(String content){
           
       }

  
        
        
    public String getTitle() {
            return title;
	}
    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }
        
}
