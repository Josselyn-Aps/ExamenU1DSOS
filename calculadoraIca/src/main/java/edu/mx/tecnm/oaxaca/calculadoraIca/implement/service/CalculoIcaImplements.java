/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.calculadoraIca.implement.service;

import edu.mx.tecnm.oaxaca.calculadoraIca.model.CalculoIcaModel;
import edu.mx.tecnm.oaxaca.calculadoraIca.repository.CalculoIcaRepository;
import edu.mx.tecnm.oaxaca.calculadoraIca.service.CalculoIcaService;
import edu.mx.tecnm.oaxaca.calculadoraIca.utils.CalcIcaValor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JOSELYNE
 */
@Service
public class CalculoIcaImplements implements CalculoIcaService{
    @Autowired
    private CalculoIcaRepository calculoRepository;
    @Autowired
    private CalcIcaValor operacion; 
    
    @Override
    public void agregarDatos(CalculoIcaModel datosModel) {
        datosModel.setIca(operacion.calculaIca(datosModel.getAltura(), datosModel.getCintura()));
        datosModel.setNivel(operacion.imprimeNivel(operacion.calculaIca(datosModel.getAltura(), datosModel.getCintura()),datosModel.getGenero()));
        calculoRepository.save(datosModel);
    }

    @Override
    public List getDatos() {
        return calculoRepository.findAll();
    }

    public CalculoIcaModel getDato(int numControl) {
       return calculoRepository.findByNumControl(numControl);
    }

    @Override
    public void updateCalculoIca(CalculoIcaModel datosModel, Integer numControl) {
       datosModel.setNumControl(numControl);
       calculoRepository.save(datosModel);
    }

    @Override
    public void deleteCalculo(Integer numControl) {
        calculoRepository.deleteById(numControl);
    }
    
}
