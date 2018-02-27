/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouhamadkhalil.tp0;

/**
 *
 * @author mouhamad
 */
public class Data {
    
    private final String _id;
    private final String _data;
    private String _commentaires;
    
    public String getId() {
        return _id;
    }

    public String getData() {
        return _data;
    }

    public String getCommentaires() {
        return _commentaires;
    }

    public void setCommentaires(String commentaires) {
        this._commentaires = commentaires;
    }
    
    /**
     * Le constructeur avec un builder
     * @param db 
     */
    public Data(DataBuilder db) {
        _id=db._id;
        _data=db._data;
        _commentaires=db._commentaires;
    }

    /**
     * Une classe builder interne (et static)
     * a utiliser par new Data.DataBuilder(___).attribut1(_)....build();
     */
    public static class DataBuilder {

        /**
         * Ide de la data (obligatoire)
         */
        String _id;
        /**
         * Donne de la data (obligatoire)
         */
        String _data;
        /**
         * Commentaire (option)
         */
        String _commentaires;
        
        /** 
         * Constructeur minimal du pattern Builder 
         * est la Liste des attributs obligatoires
         * @param id
         * @param data 
         */
        public DataBuilder(String id,String data) {
            _id=id;
            _data=data;
        }
        /**
         * Paramètre de build tout attribut optionnel renvoi un builder
         * @param commentaire
         * @return un DataBuilder pour enchaîner les mise a jour du builder
         */
        public DataBuilder commentaire(String commentaire) {
            _commentaires=commentaire;
            return this;
        }
        
        /**
         * Le build
         * @return objet à créer
         */
        public Data build(){
            return new Data(this);
        }
    }
}
