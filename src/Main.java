public class Main {
    public static void main(String[] args) {

        //Instanciar la clase
        Cuenta miCuenta= new Cuenta("123456","credito",150000);
        System.out.println("Saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        miCuenta.setNumero("987654");
        System.out.println(miCuenta.toString());
        System.out.println("--------------------------------------");

        Cuenta pedroCuenta= new Cuenta("585858","prestamo",5000);
        System.out.println(pedroCuenta.toString());

    }
}
