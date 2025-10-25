package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microprocesador.Programable;

public class Lod extends Comando {

    private Integer addr;


    public Lod(Integer addr) {
        this.addr = addr;
    }



    @Override
    protected void doExcecute(Programable micro) {
        micro.setAcumuladorA(micro.getAddr(addr));
    }

}
