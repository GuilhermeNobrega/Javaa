package POO;

interface atributos{
     void culpa_mea();
     void culpa();
}
class Penitente implements atributos{
    @Override
    public void culpa_mea() {
        System.out.println("Penitente poderá elevar seus poderes em MEA");
    }
    public void culpa(){
        System.out.println("Penitente pode curar da culpa");
    }
}
public class Testeinterface1 {
    public static void main (String[] args){
        Penitente novoPenitente = new Penitente();
        novoPenitente.culpa();
        novoPenitente.culpa_mea();
    }
}
