import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Animais {

    private final Map<Integer, String> numerosParaBichos = new HashMap<>(); // cria um mapa para relacionar os números com os nomes dos bichos
    private final Map<String, int[]> numerosParaAnimais = new HashMap<>(); // cria um mapa para relacionar os animais com seus números
    private final Random random = new Random(); // cria um objeto Random para gerar números aleatórios
    private final Set<Integer> numerosSorteados = new HashSet<>(); // cria um conjunto para armazenar os números sorteados

    public void adicionarBicho(String nome, int[] numeros) { // método para adicionar um bicho ao mapa
        if (!numerosParaAnimais.containsKey(nome)) {
            numerosParaBichos.putAll(criarMapaBichoNumeros(nome, numeros)); // adiciona o bicho ao mapa, relacionando cada número com o nome
            numerosParaAnimais.put(nome, numeros); // adiciona os números do animal ao mapa
        }
    }

    private Map<Integer, String> criarMapaBichoNumeros(String nomeBicho, int[] numeros) {
        Map<Integer, String> mapaBichoNumeros = new HashMap<>();
        for (int numero : numeros) {
            mapaBichoNumeros.put(numero, nomeBicho);
        }
        return mapaBichoNumeros;
    }

    public String sortearBicho() { // método para sortear um bicho aleatório
        int tamanhoMapa = numerosParaBichos.size();
        int numeroSorteado;
        do {
            numeroSorteado = random.nextInt(tamanhoMapa) + 1; // gera um número aleatório entre 1 e o tamanho do mapa
        } while (numerosSorteados.contains(numeroSorteado)); // verifica se o número já foi sorteado antes

        numerosSorteados.add(numeroSorteado); // adiciona o número sorteado ao conjunto

        String bichoSorteado = numerosParaBichos.get(numeroSorteado); // pega o nome do bicho correspondente ao número sorteado
        int[] numerosDoBicho = numerosParaAnimais.get(bichoSorteado); // pega os números do bicho correspondente
        int numeroSorteadoDoBicho = numerosDoBicho[random.nextInt(numerosDoBicho.length)]; // sorteia um número do bicho

        return bichoSorteado + " " + numeroSorteadoDoBicho;
    }
}

