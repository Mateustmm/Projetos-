#bibliotecas
import random

#definir função
def jogar():
    # apresentação do jogo
    print("**********************************")
    print('\n', "Bem vindo ao jogo de Adivinhação!", '\n')
    print("**********************************")

    # atribuição de valor aleatório a variável para o numero secreto do jogo
    numero_secreto = random.randrange(1,101)

    #atribuição de variável para as tentativas e para rodadas
    total_de_tentativas = 0
    rodada = 1

    #constante para a pontuação
    pontos = 1000

    #criação de nivel de dificuldade para o jogo
    print("Escolha qual nível de dificuldade você quer jogar")
    print("(1) Fácil  (2) Médio (3) Difícil",'\n')
    nivel = int(input("Digite o número correspondente ao nível selecionado :"))

    #condição correspondente a dificuldade dos níveis

    if (nivel==1):
        total_de_tentativas=20
    elif (nivel==2):
        total_de_tentativas=10
    else:
        total_de_tentativas=5

    #criação do laço de repetição
    for rodada in range(1 ,total_de_tentativas + 1):
        print("Tentativa {} de {}".format(rodada,total_de_tentativas))

    # pedido para o usuário atribuir valor a vaiável e posteriormente a impressão desta
        numero = input("Digite um número de 1 a 100:")
        print("Você digitou:", numero, '\n')
        chute = int(numero)

    #verificador se o numero bate com os valores pedidos
        if ( chute < 1 or chute > 100):
            print ("Você deve digitar um número de 1 a 100, perdeu uma tentativa!!!",'\n')
            continue

    # estabelecimento de critério para comparação
        acertou = numero_secreto == chute
        maior = numero_secreto > chute
        menor = numero_secreto < chute

    # condicionais que servirão para a execução do jogo  e mostrarão o possivel resultado
        if (acertou):
                print("Você adivinhou o número secreto e fez {} pontos.".format(pontos),"Parabéns!!!!",'\n')
                break
        else:
            if (maior):
                print("Você errou! O número secreto é maior.", '\n')
            elif (menor):
                print("Você errou! O número secreto é menor.", '\n')
                pontos_perdido = abs (numero_secreto - chute)
                pontos = pontos - pontos_perdido


        # encerramento do jogo
        print("*********************************")
        print('\n', "        Fim do jogo!", '\n')
        print("*********************************")
#condição para executar o jogo
if(__name__=="__main__"):
    jogar()