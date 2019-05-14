public class Carro {
    int ini;
    int act;
    int cap = 1;
    public Carro(int ini, int act){
        this.ini = ini;
        this.act = act;
    }
    
    public void agre(int act, int capacidad){
        this.act = act;
        cap = cap + capacidad;
    }
}
