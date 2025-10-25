package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microprocesador.Programable;

public class Str extends Comando{
    private Integer addr;

    

    public Str(Integer addr) {
        this.addr = addr;
    }



    @Override
    protected void doExcecute(Programable micro) {
        micro.setAddr(addr);
    }

}
