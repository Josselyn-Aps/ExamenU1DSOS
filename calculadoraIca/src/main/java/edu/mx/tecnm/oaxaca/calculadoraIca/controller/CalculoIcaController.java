/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.calculadoraIca.controller;

import edu.mx.tecnm.oaxaca.calculadoraIca.model.CalculoIcaModel;
import edu.mx.tecnm.oaxaca.calculadoraIca.service.CalculoIcaService;
import edu.mx.tecnm.oaxaca.calculadoraIca.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JOSELYNE
 */
@RestController
@RequestMapping("/api/v1/calculoIca")
public class CalculoIcaController {
    @Autowired
    private CalculoIcaService calculoService;
    
    @PostMapping("/")
    public CustomResponse agregarDatos(@RequestBody CalculoIcaModel calculoIca) {
        CustomResponse customResponse = new CustomResponse();
        calculoService.agregarDatos(calculoIca);
        return customResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getDatos() {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(calculoService.getDatos());
        return customResponse;
    }
    
    @GetMapping("/{numControl}")
    public CustomResponse getDato(@PathVariable int numControl) {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(calculoService.getDato(numControl));
        return customResponse;
    }
    
    @PutMapping("/{numControl}")
    public CustomResponse updateVenta(@RequestBody CalculoIcaModel calculoIca, @PathVariable Integer numControl) {
        CustomResponse customResponse = new CustomResponse();
        calculoService.updateCalculoIca(calculoIca, numControl);
        return customResponse;
    }
    
    @DeleteMapping("/{numControl}")
    public CustomResponse deleteCuenta(@PathVariable Integer numControl) {
        CustomResponse customResponse = new CustomResponse();
        calculoService.deleteCalculo(numControl);
        return customResponse;
    }
}
