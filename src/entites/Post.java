/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Who Am I
 */
public class Post {
    private int idPost;
    private String type_Post;
    private String contenu_post;
    private Date date_crea;
    private Time heure_crea;
    private Date date_lect;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getType_Post() {
        return type_Post;
    }

    public void setType_Post(String type_Post) {
        this.type_Post = type_Post;
    }

    public String getContenu_post() {
        return contenu_post;
    }

    public void setContenu_post(String contenu_post) {
        this.contenu_post = contenu_post;
    }

    public Date getDate_crea() {
        return date_crea;
    }

    public void setDate_crea(Date date_crea) {
        this.date_crea = date_crea;
    }

    public Time getHeure_crea() {
        return heure_crea;
    }

    public void setHeure_crea(Time heure_crea) {
        this.heure_crea = heure_crea;
    }

    public Date getDate_lect() {
        return date_lect;
    }

    public void setDate_lect(Date date_lect) {
        this.date_lect = date_lect;
    }
    
    
}
