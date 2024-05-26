public class App {
    public static void main(String[] args) throws Exception {


        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");


        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        System.out.println("Informacion del Auto: ");
        auto.mostrarInfo();

        System.out.println("Informacion del Camion: ");
        camion.mostrarInfo();

        

    }
    public String  calcularCostoMantenimiento(){
        int costoTotal;
        int CostoPorKm = 100;

        costoTotal = kilometraje*CostoPorKm;
    }
}
