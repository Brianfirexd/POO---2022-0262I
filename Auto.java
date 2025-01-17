public class Auto extends VehiculosPasajeros{
    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    public void realizarMantenimiento(){
        System.out.println("Mantenimiento Correctivo. ");
        System.out.println("Mantenimiento Selectivo. ");
        System.out.println("Mantenimiento Preventivo. ");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

}
