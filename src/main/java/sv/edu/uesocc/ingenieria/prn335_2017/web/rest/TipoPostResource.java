/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPostFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;

/**
 *
 * @author carlos
 */

@Path("TipoPost")
public class TipoPostResource implements Serializable{
   
    
    @EJB
    private TipoPostFacadeLocal tipoPostFacadeLocal;
    
    /**
     * busca en los repositorios los registros paginados
     * 
     * @param desde
     * @param hasta
     * @return
     */
    
   /**
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<TipoPost> findRange(
       @DefaultValue("0") @QueryParam("desde") int desde,
        @DefaultValue("5") @QueryParam("hasta") int hasta
    ){
        List salida=null;
        try {
            if(tipoPostFacadeLocal !=null){
                tipoPostFacadeLocal.findRange(desde, hasta);
            }
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(), ex);
            
        }finally{
        if(salida==null){
        salida=new ArrayList();
        }
        }
        
        return salida;
                   
    }
    */
    
    /**
     * Muestra todos los registros almacenados
     * 
     * @param 
     * @param 
     * @return
     */
    
   ///**
   @GET
   @Path("{todo}")
   @Produces({MediaType.APPLICATION_JSON})
   public List<TipoPost> findAll(){
       
       List<TipoPost> salida=null;
       try {
           if(tipoPostFacadeLocal !=null){
           salida=tipoPostFacadeLocal.findAll();
           }
           
       } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(), ex);
            
       }finally{
       if(salida==null){
       salida=new ArrayList();
       }
       }
       return salida;
   }
   //*/
 
 /**  
  @POST
  @Produces({MediaType.APPLICATION_JSON})
  public TipoPost create(TipoPost registro){
  if(registro !=null && registro.getIdTipoPost()==null){
      try {
       if(tipoPostFacadeLocal !=null){
       TipoPost r= tipoPostFacadeLocal.create(registro);
       if(r != null){
       return r;
       }
       }   
      } catch (Exception ex) {
          Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(), ex);
            
      }
     return new TipoPost();
  }
  
  
  }
  
  */
       
    /**
     * muestra o devuelve un valor el numero de valores que tenemos registrados
     * 
     * @param id
     * 
     * @return
     */
    
        ///**
   
   @Path("count")
   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public Integer count(){
       try {
           if(tipoPostFacadeLocal!=null){
           return tipoPostFacadeLocal.count();
           }
       } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(), ex);
       }
       
   return 0;
   }
   
   /**
       @GET
       @Path("{idtipopost}")
       @Produces({MediaType.APPLICATION_JSON})
       public TipoPost findById(
              @PathParam("idtipopost") Integer id
       ){
           try {
               if(tipoPostFacadeLocal !=null && id!=null){
               return tipoPostFacadeLocal.find(id);
                 
               }
           } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(), ex);
           
           }
           return  new TipoPost();
       }
               
               
               
       */
    
    
}
