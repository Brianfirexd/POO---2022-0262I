public class Camion extends VehiculoCarga {

    private int numEjes;

    public Camion(String marca, String modelo, int año, int kilometraje,int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }
    public int getNumEjes(){
        return numEjes;
    }
    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }
    public void realizarMantenimiento(){
        System.out.println("Cambio de Aceite. ");
        System.out.println("Filtro de Motor. ");
        System.out.println("Refrigerante. ");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ejes: " + numEjes);
    }


}
