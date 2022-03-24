/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.calculadoraIca.utils;

import org.springframework.stereotype.Component;

/**
 *
 * @author JOSELYNE
 */
@Component
public class CalcIcaValor {
    public double calculaIca(double cintura, double altura){
        return cintura/altura;
    }
    
    public String imprimeNivel(double calculoIca, char genero){
        if(genero =='H'){
          if(calculoIca<=0.34){  
              return "Delgadez severa";
          }else if(calculoIca>=0.35 && calculoIca <=0.41){
              return "Delgadez leve";
          }else if(calculoIca>=0.42 && calculoIca <=0.48){
              return "Peso normal";
          }else if(calculoIca>=0.49 && calculoIca <=0.53){
              return "Sobrepeso";
          }else if(calculoIca>=0.54 && calculoIca <=0.57){
              return "Sobrepeso elevado";
          }else if(calculoIca>0.58){
              return "Obesidad mórbida";
          }
        }else{
           if(calculoIca<=0.34){  
              return "Delgadez severa";
          }else if(calculoIca>=0.35 && calculoIca <=0.42){
              return "Delgadez leve";
          }else if(calculoIca>=0.43 && calculoIca <=0.52){
              return "Peso normal";
          }else if(calculoIca>=0.53 && calculoIca <=0.57){
              return "Sobrepeso";
          }else if(calculoIca>=0.58 && calculoIca <=0.62){
              return "Sobrepeso elevado";
          }else if(calculoIca>0.63){
              return "Obesidad mórbida"; 
          }
        }
        return "";
    }
}
