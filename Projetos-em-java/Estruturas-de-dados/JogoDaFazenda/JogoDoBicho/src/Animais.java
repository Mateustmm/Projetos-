import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Animais {

    private final Map<Integer, String> numerosParaBichos = new HashMap<>(); // cria um mapa para relacionar os n�meros com os nomes dos bichos
    private final Map<String, int[]> numerosParaAnimais = new HashMap<>(); // cria um mapa para relacionar os animais com seus n�meros
    private final Random random = new Random(); // cria um objeto Random para gerar n�meros aleat�rios
    private final Set<Integer> numerosSorteados = new HashSet<>(); // cria um conjunto para armazenar os n�meros sorteados

    public void adicionarBicho(String nome, int[] numeros) { // m�todo para adicionar um bicho ao mapa
        if (!numerosParaAnimais.containsKey(nome)) {
            numerosParaBichos.putAll(criarMapaBichoNumeros(nome, numeros)); // adiciona o bicho ao mapa, relacionando cada n�mero com o nome
            numerosParaAnimais.put(nome, numeros); // adiciona os n�meros do animal ao mapa
        }
    }

    private Map<Integer, String> criarMapaBichoNumeros(String nomeBicho, int[] numeros) {
        Map<Integer, String> mapaBichoNumeros = new HashMap<>();
        for (int numero : numeros) {
            mapaBichoNumeros.put(numero, nomeBicho);
        }
        return mapaBichoNumeros;
    }

    public String sortearBicho() { // m�todo para sortear um bicho aleat�rio
        int tamanhoMapa = numerosParaBichos.size();
        int numeroSorteado;
        do {
            numeroSorteado = random.nextInt(tamanhoMapa) + 1; // gera um n�mero aleat�rio entre 1 e o tamanho do mapa
        } while (numerosSorteados.contains(numeroSorteado)); // verifica se o n�mero j� foi sorteado antes

        numerosSorteados.add(numeroSorteado); // adiciona o n�mero sorteado ao conjunto

        String bichoSorteado = numerosParaBichos.get(numeroSorteado); // pega o nome do bicho correspondente ao n�mero sorteado
        int[] numerosDoBicho = numerosParaAnimais.get(bichoSorteado); // pega os n�meros do bicho correspondente
        int numeroSorteadoDoBicho = numerosDoBicho[random.nextInt(numerosDoBicho.length)]; // sorteia um n�mero do bicho

        return bichoSorteado + " " + numeroSorteadoDoBicho;
    }
}

