/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Blog;
import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.CommentMapper;
import edu.eci.pdsw.services.ServicesException;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class MyBatisCommentDAO implements CommentDAO{
    
    @Inject
    CommentMapper commentMapper;
    
    @Override
	public List<Comment> searchCommentsByBlogTitle(String title) throws PersistenceException {
            return commentMapper.searchCommentsByBlogTitle(title);
            
	}

    @Override
    public List<Comment> searchOffensiveLanguageComments(String title) throws PersistenceException {
        return commentMapper.searchOffensiveLanguageComments(title);
    }
   
}
