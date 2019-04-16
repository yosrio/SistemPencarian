/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Yos Rio
 * 165314041
 */
public class Term implements Comparable<Term>{
    private String term;
    private ArrayList<Posting> postingList = new ArrayList<Posting>();
    
    public Term(){
        
    }
    
    public Term(String term){
        this.term = term;
    }

    public int getNumberOfDocument(){
        return postingList.size();
    }
    
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public ArrayList<Posting> getPostingList() {
        return postingList;
    }

    public void setPostingList(ArrayList<Posting> postingList) {
        this.postingList = postingList;
    }

    @Override
    public int compareTo(Term t) {
        return term.compareToIgnoreCase(t.getTerm());
    }

}
