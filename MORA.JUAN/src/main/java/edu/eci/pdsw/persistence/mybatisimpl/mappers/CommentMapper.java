/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import edu.eci.pdsw.entities.Comment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author estudiante
 */
public interface CommentMapper {
    List<Comment> searchCommentsByBlogTitle(@Param("title") String title);
    List<Comment> searchOffensiveLanguageComments(@Param("title") String title);
}
