/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Comment;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface CommentDAO {
    public List<Comment> searchCommentsByBlogTitle(String title) throws PersistenceException;
    public List<Comment> searchOffensiveLanguageComments(String title) throws PersistenceException;
    }
