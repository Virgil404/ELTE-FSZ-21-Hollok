/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.autoszalon.auto.repositorys;

import com.autoszalon.auto.domains.Carfeauters;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nagy
 */
public interface FeaturesRepository extends CrudRepository<Carfeauters,Integer> {
    
}
