/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastane;

import Yardımcı.Database;

/**
 *
 * @author kilic
 */
public class User { 
    Database conn = new Database();
    
        private int id;
        String tcno,name,type,parola;

    public User(int id, String tcno, String name, String type, String parola) {
        this.id = id;
        this.tcno = tcno;
        this.name = name;
        this.type = type;
        this.parola = parola;
    }
    
    public User(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    
}
