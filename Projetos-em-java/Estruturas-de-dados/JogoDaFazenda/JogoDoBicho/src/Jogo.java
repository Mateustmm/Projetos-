
public class Jogo {

    public static void main(String[] args) {

        Animais animais = new Animais();
        animais.adicionarBicho("Leão", new int[]{1, 2, 3, 4, 5});
        animais.adicionarBicho("Tigre", new int[]{6, 7, 8, 9, 10});
        animais.adicionarBicho("Girafa", new int[]{11, 12, 13, 14, 15});
        animais.adicionarBicho("Elefante", new int[]{16, 17, 18, 19, 20});
        animais.adicionarBicho("Ganso", new int[]{21, 22, 23, 24, 25});
        animais.adicionarBicho("Pavão", new int[]{26, 27, 28, 29, 30});
        animais.adicionarBicho("Cachrro", new int[]{31, 32, 33, 34, 35});
        animais.adicionarBicho("Gato", new int[]{36, 37, 38, 39, 40});
        animais.adicionarBicho("Avestruz", new int[]{41, 42, 43, 44, 45});
        animais.adicionarBicho("Aguia", new int[]{46, 47, 48, 49, 50});
        animais.adicionarBicho("Burro", new int[]{51, 52, 53, 54, 55});
        animais.adicionarBicho("Borboleta", new int[]{56, 57, 58, 59, 60});
        animais.adicionarBicho("Cabra", new int[]{61, 62, 63, 64, 65});
        animais.adicionarBicho("Carneiro", new int[]{66, 67, 68, 69, 70});
        animais.adicionarBicho("Vaca", new int[]{71, 72, 73, 74, 75});
        animais.adicionarBicho("Veado", new int[]{76, 77, 78, 79, 80});

        String animalSorteado = animais.sortearBicho();
        System.out.println(animalSorteado);

    }

}
