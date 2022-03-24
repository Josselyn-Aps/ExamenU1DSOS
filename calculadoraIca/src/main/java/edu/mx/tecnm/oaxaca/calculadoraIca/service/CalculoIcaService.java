/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.calculadoraIca.service;

import edu.mx.tecnm.oaxaca.calculadoraIca.model.CalculoIcaModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author JOSELYNE
 */
@Service
public interface CalculoIcaService {
    public void agregarDatos( CalculoIcaModel datosModel);
    
    public List getDatos();
    
    public CalculoIcaModel getDato(int numControl);
    
    public  void  updateCalculoIca(CalculoIcaModel datosModel, Integer numControl);
    
    public void deleteCalculo(Integer numControl);
}
