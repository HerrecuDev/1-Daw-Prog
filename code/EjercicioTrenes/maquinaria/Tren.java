package code.EjercicioTrenes.maquinaria;

import java.lang.reflect.Array;
import java.util.Arrays;

import code.EjercicioTrenes.personal.Maquinista;

public class Tren
{
    //Atributos
    private Locomotora locomotora;
    private Vagon [] vagones = new Vagon[0];
    private Maquinista maquinista;
    //Contructores :
    public Tren(Locomotora locomotora, Maquinista maquinista )
    {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        
    }

    


    //Métodos :

    @Override
    public String toString()
    {
       return Arrays.toString(this.vagones);

    }

     public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public void enganchaVagon( int cargamax, int cargaVagon, String material)
     {
        int numeroVagones = 0;

        if ((numeroVagones <= 5) && (cargaVagon < cargamax)) 
        {
            vagones = new Vagon[vagones.length+1];

        }
     }

    // public void enganchaVagon(Vagon sumaVagon)
    // {
        // int numeroVagones = 0;
        // if (numeroVagones <= 5)
        // {
            // vagones = new Vagon[vagones.length+1];

            // for (int i = 0; i < vagones.length; i++)
            // {
                // vagones [i] = this.vagones[i];
            // }

            // vagones[vagones.length-1] = sumaVagon;


        // }

    }










