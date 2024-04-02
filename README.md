# Segundo programa orientado a objetos

## Instruções
Choi Kang-ho é um promotor que tem se destacado muito em sua atuação. Entre suas tarefas do dia-a-dia está a análise de depoimentos de testemunhas de seus casos. Um depoimento é registrado em uma determinada data contém o nome do depoente (a pessoa que deu o depoimento). Em seu registro, o depoimento contém, em texto, aquilo que o depoente falou. Um dos trabalhos do promotor é verificar se o depoimento contém palavras de ódio e classificar o nível de censura do depoimento. Funciona assim: o promotor lê o depoimento e conta o número de palavras de ódio (escolha as palavras que quiser). Caso o número de palavras seja maior que 10, o depoimento é classificado como "inseguro". Caso seja maior que 5, o depoimento é classificado como "aceitável". Caso seja menor ou igual a 5, o depoimento é classificado como "livre".

Escreva um programa orientado a objetos que ajude o promotor a realizar esta tarefa com mais facilidade. Identifique a(s) classe(s), crie um diagrama de classes e uma implementação. Crie um programa principal para testar.

### Obs:
* para guardar datas, pode separar dia, mês e ano, por enquanto. Se você já se sente confortável com a linguagem, pode usar o tipo LocalDate.
* para encontrar palavras dentro de uma String, utilize o método indexOf da classe String.
  Ex: "Meu amigo é muito legal".indexOf("amigo") retorna 4, pois a palavra "amigo" começa na posição 4 da String (inicia em 0).
