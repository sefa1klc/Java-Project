/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hastane;


import java.sql.*;

public class BasHekim extends User{
    
    private Connection con = null;
    
    public BasHekim(int id, String tcno, String name, String type, String parola) {
        super(id, tcno, name, type, parola);
    }
    
    public BasHekim(){
        
    }

}
