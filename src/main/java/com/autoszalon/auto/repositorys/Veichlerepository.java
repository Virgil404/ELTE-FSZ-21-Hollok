/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.repositorys;

import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Veichle;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author zacco
 */
public interface Veichlerepository extends CrudRepository<Veichle,Integer>{
    Veichle findAllBycarpackage(Carpackage carpackage);
   // @Query
   // Veichle findcars();
    @Query(value = "select Carpackage ,Price ,Allwheel ,Color ,Doors from Category inner join  CARFEAUTERS on  features_id =CARFEAUTERS .id where color=:color"
            ,nativeQuery=true)      
    ArrayList<Veichle> findcarsbycolor(@Param ("color") String color);
    
    @Query(value = "select Carpackage ,Price ,Allwheel ,Color ,Doors from Category inner join  CARFEAUTERS on  features_id =CARFEAUTERS .id where price=:price"
            ,nativeQuery=true)      
    ArrayList<Veichle> findcarsbyprice(@Param ("price") float price);
    
    @Query(value = "select Carpackage ,Price ,Allwheel ,Color ,Doors from Category inner join  CARFEAUTERS on  features_id =CARFEAUTERS .id where door=:door"
            ,nativeQuery=true)      
    ArrayList<Veichle> findcarsbydoor(@Param ("door") int door);
    
    @Query(value = "select Carpackage ,Price ,Allwheel ,Color ,Doors from Category inner join  CARFEAUTERS on  features_id =CARFEAUTERS .id where Allwheel=:Allwheel"
            ,nativeQuery=true)      
    ArrayList<Veichle> findcarsbyAllwheel(@Param ("Allwheel") boolean Allwheel);
    
    @Query(value = "select Carpackage ,Price ,Allwheel ,Color ,Doors from Category inner join  CARFEAUTERS on  features_id =CARFEAUTERS .id where Allwheel=:Allwheel and door=:door and price=:price and color=:color"
            ,nativeQuery=true)      
    ArrayList<Veichle> findcarsbyAll(@Param ("Allwheel") boolean Allwheel,@Param ("price") float price,@Param ("door") int door,@Param ("color")  String color );

}
