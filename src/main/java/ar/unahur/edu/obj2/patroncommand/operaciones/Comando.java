package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microprocesador.Programable;

public abstract class Comando implements Operable{

    @Override
    public void execute(Programable micro) {
        this.doExcecute(micro);
        micro.incProgramCounter();
        
    }

    protected abstract void doExcecute(Programable micro);

}
