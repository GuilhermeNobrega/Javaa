abstract class Galaxia {
    String location = "Via Láctea";

    // Método abstrato (não pode ter implementação na classe abstrata, apenas assinatura)
    public abstract void mostrarLocalizacao();
}

// Criando uma classe concreta que estende a classe abstrata
class Terra extends Galaxia {
    @Override
    public void mostrarLocalizacao() {
        System.out.printf("Localização: %s\n", location);
        System.out.printf("Planeta Terra está contida aqui.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe concreta (não da abstrata!)
        Terra planeta = new Terra();
        planeta.mostrarLocalizacao();  // Chama o método abstrato implementado
    }
}
