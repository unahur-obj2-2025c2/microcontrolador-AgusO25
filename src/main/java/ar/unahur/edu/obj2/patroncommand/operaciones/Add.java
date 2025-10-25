package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microprocesador.Programable;

public class Add extends Comando{

    
    @Override
    protected void doExcecute(Programable micro) {
        Integer resultado = micro.getAcumuladorA() + micro.getAcumuladorB();
        micro.setAcumuladorA(resultado);
        micro.incProgramCounter();
        micro.setAcumuladorB(0);
    }

}
