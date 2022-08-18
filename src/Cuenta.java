public class Cuenta {

    private String numero; //encapsulamiento
    private String tipo="";
    private double saldoActual=0;
    private double saldoMinimo=0;
    private double valorInicial=0;

    public Cuenta(String numero, String tipo, double valorInicial) {
        this.numero = numero;
        if(tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito")){
            this.tipo = tipo;
            this.valorInicial = valorInicial;
            this.saldoActual = valorInicial;
            this.saldoMinimo= valorInicial*0.1;
        }
    }



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void consignar(double monto){
        this.saldoActual+=monto;
    }

    public void retirar(double monto){

        if((this.saldoActual-monto)<this.saldoMinimo){
            System.out.println("Saldo Insuficiente");
            System.out.println("El valor retirado es: "+(this.saldoActual-this.saldoMinimo));
            this.saldoActual=this.saldoMinimo;
        }else{
            System.out.println("El valor retirado es: "+monto);
            this.saldoActual-=monto;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldoActual=" + saldoActual +
                ", saldoMinimo=" + saldoMinimo +
                ", valorInicial=" + valorInicial +
                '}';
    }
}
