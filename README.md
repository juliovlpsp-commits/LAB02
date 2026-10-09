# LAB02 - CoISA

Controle Institucional da Situacao Academica - Laboratorio 02 de Programacao 2 (UFCG). Sistema em Java para gestao academica basica: descanso, tempo online, disciplinas e resumos.

## sumario
- [visao geral](#visao-geral)
- [funcionalidades](#funcionalidades)
- [tecnologias](#tecnologias)
- [estrutura](#estrutura)
- [como rodar](#como-rodar)
- [uml](#uml)
- [autor](#autor)

## visao geral

Aplicacao `CLI` simples em Java puro para exercitar conceitos iniciais de `OO`: classes, objetos, encapsulamento, `toString` e `javadoc`. O `CoISA.java` e o ponto de entrada e testa todas as funcionalidades.

## funcionalidades

| modulo | descricao |
|---|---|
| `Descanso` | calcula se o aluno esta `descansado` (`media >=26h/semana`) ou `cansado` |
| `RegistroTempoOnline` | registra horas online de uma disciplina (`0/120` padrao, `30` custom) e verifica meta |
| `Disciplina` | cadastra `4 notas` (media `>=7` aprovado) e horas, com suporte a `media ponderada` na etapa 4 |
| `Resumo` / `RegistroResumos` | guarda resumos `tema: conteudo` com buffer circular e `busca` por palavra ordenada |

## tecnologias
- `java 17+`
- `javadoc`
- `plantuml` para o diagrama
- `git`

## estrutura
```
LAB02/
├── CoISA/lab2/
│   ├── CoISA.java               # main e testes manuais
│   ├── Descanso.java
│   ├── Disciplina.java
│   ├── RegistroTempoOnline.java
│   ├── Resumo.java
│   └── RegistroResumos.java
├── docs/
│   ├── Lab02_UML.puml
│   └── Lab02_UML.png
└── dirlididi.py
```

## como rodar
```bash
javac CoISA/lab2/*.java
java -cp CoISA lab2.CoISA
```

saida esperada:
```
cansado
descansado
cansado
descansado
-----
false
true
true
LP2 32/30
P2 0/120
-----
false
true
PROGRAMACAO 2 4 7.0 [5.0, 6.0, 7.0, 10.0]
-----
Classes: Classes definem um tipo e a base de codigo para criacao de objetos.
Tipo: Identifica a semantica (operacoes e significados) de um conjunto de dados.
- 2 resumo(s) cadastrado(s)
- Classes | Tipo
true
false
```

javadoc:
```bash
javadoc -d docs/javadoc CoISA/lab2/*.java
```

## uml
`docs/Lab02_UML.puml` (fonte) e `docs/Lab02_UML.png` (renderizado via https://plantuml.com/plantuml)

## autor
JULIO EDUARDO MONTEIRO SILVA - UFCG
