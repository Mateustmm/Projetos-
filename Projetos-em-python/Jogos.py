#importação de arquivos e bibliotecas
import adivinhacao
import forca

# interface de escolha
print("**********************************")
print('\n',"Bem vindo, escolha o seu jogo!",'\n')
print("**********************************")

#comando para o usuário inserir a opção desejada
print("(1)Adivinhação (2)Forca",'\n')
jogo=int(input("Qual jogo ?"))

#condicional responsável pela seleção
if (jogo==1):
    print("Jogando Adivinhação")
    adivinhacao.jogar()
elif(jogo==2):
    print("Jogando Forca")
    forca.jogar()
