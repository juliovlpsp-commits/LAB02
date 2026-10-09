# LAB02 - CoISA

Controle Institucional da Situacao Academica - Laboratorio 02 de Programacao 2 (UFCG).

## sumario
- [funcionalidades](#funcionalidades)
- [estrutura](#estrutura)
- [uml](#uml)
- [autor](#autor)


## funcionalidades

| modulo | descricao |
|---|---|
| `Descanso` | calcula se o aluno esta `descansado` (`media >=26h/semana`) ou `cansado` |
| `RegistroTempoOnline` | registra horas online de uma disciplina (`0/120` padrao, `30` custom) e verifica meta |
| `Disciplina` | cadastra `4 notas` (media `>=7` aprovado) e horas, com suporte a `media ponderada` na etapa 4 |
| `Resumo` / `RegistroResumos` | guarda resumos `tema: conteudo` com buffer circular e `busca` por palavra ordenada |

## estrutura
```
LAB02/
├── CoISA/lab2/
│   ├── CoISA.java               
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
## uml
`docs/Lab02_UML.puml` (fonte) e `docs/Lab02_UML.png` (renderizado via https://plantuml.com/plantuml)

## autor
JULIO EDUARDO MONTEIRO SILVA - UFCG
