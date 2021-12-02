/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.repositorys;

import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Veichle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author zacco
 */
public interface Veichlerepository extends CrudRepository<Veichle,Integer>{
    Veichle findAllBycarpackage(Carpackage carpackage);
    @Query
    Veichle findcars();
}
