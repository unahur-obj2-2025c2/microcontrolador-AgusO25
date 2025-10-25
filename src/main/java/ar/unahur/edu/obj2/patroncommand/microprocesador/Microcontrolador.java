package ar.unahur.edu.obj2.patroncommand.microprocesador;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.excepciones.FueraDeRangoDeMemoriaException;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Microcontrolador implements Programable{

    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programCounter;
    private List<Integer> memoria;
    
    public Microcontrolador(){
        this.reset();
    }
    
    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o -> o.execute(this));
    }
     
    @Override
    public void incProgramCounter() {
       programCounter += 1;
    }

    @Override
    public Integer getProgramCounter() {
        return programCounter;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        acumuladorA = value;
    }

    @Override
    public Integer getAcumuladorA() {
       return acumuladorA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        acumuladorB = value;
    }

    @Override
    public Integer getAcumuladorB() {
       return acumuladorB;
    }

    @Override
    public void setAddr(Integer addr) {
        if(addr < 0 || addr >= memoria.size()){
            throw new FueraDeRangoDeMemoriaException();
        }
       memoria.set(addr, acumuladorA);
    }

    @Override
    public Integer getAddr(Integer addr) {
        if(addr < 0 || addr >= memoria.size()){
            throw new FueraDeRangoDeMemoriaException();
        }
       return memoria.get(addr);
    }

    // private void estaDentroDelRangoDeMemoria(Integer direccionDeMemoria){
    //     if (direccionDeMemoria < 0 || direccionDeMemoria > memoria.size()){
    //         throw new FueraDeRangoDeMemoriaException();
    //     }
    // }

    @Override
    public void reset() {
        acumuladorA = 0;
        acumuladorB = 0;
        programCounter = 0;
        memoria = Arrays.asList(new Integer[1024]);
    }


    
}
