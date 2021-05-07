/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

 
public class CodigoPOJO {
    
    
    private String codigo;
    private String descripcion;
    private String nacional;
    private String grupo;
    private String descgrupo;
    private String genero;
    private String descgenero;
    private String costounitario;
    private String precioventa;
    private String precioferta;
    private String ahorro;
    
    
    
    public CodigoPOJO(){
        ///no hay nada we
        
    }
    public CodigoPOJO(String codigo, String descripcion) {
        this.codigo = codigo ;
        this.descripcion = descripcion ;
      
        
    }
    
    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }
////
    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
////
   
////
    @Override
    public String toString() {
//        return this.descripcion+" "+this.nacional;
        return this.descripcion;
  
    }
    
}
