package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microprocesador.Programable;

public class Swap extends Comando{

    @Override
    protected void doExcecute(Programable micro) {
        Integer auxiliarA = micro.getAcumuladorA();
        micro.setAcumuladorA(micro.getAcumuladorB());
        micro.setAcumuladorB(auxiliarA);
    }

}
