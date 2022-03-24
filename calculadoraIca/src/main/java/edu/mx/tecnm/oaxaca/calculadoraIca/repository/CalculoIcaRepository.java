/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.mx.tecnm.oaxaca.calculadoraIca.repository;

import edu.mx.tecnm.oaxaca.calculadoraIca.model.CalculoIcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JOSELYNE
 */
@Repository
public interface CalculoIcaRepository extends JpaRepository<CalculoIcaModel, Integer> {
    
    public CalculoIcaModel findByNumControl(int numControl);
    
    
}
