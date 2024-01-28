<div align=center>

# Sistema de Clínica de Consultas

</div>

Este é um sistema de clínica de consultas para agendar e cancelar consultas. O programa é executado via terminal e possui as seguintes funcionalidades:
> **Observação:** Para executar o programa, utilize o terminal e siga as instruções apresentadas.
## 📝 Funcionalidades do Desafio:

1. **Cadastrar um Paciente:**
   - O programa solicita o nome e o telefone do paciente.
   - Após o cadastro, exibe a mensagem "Paciente cadastrado com sucesso".
   - Adiciona o paciente à lista de Pacientes Cadastrados.

2. **Marcações de Consultas:**
   - Ao selecionar essa opção, o programa exibe uma lista numerada dos pacientes cadastrados.
   - Ao escolher o número correspondente a um paciente, solicita o dia, a hora e a especialidade desejada para a consulta.
   - Após o envio desses dados, o agendamento é adicionado à lista de agendamentos.

3. **Cancelamento de Consultas:**
   - Ao selecionar essa opção, o programa exibe uma lista numerada dos agendamentos existentes.
   - Ao escolher o número correspondente ao agendamento que deseja cancelar, é exibida uma mensagem informando a data, a hora e a especialidade da consulta agendada.
   - O usuário pode optar por cancelar a consulta.
   - Ao confirmar o cancelamento, o agendamento é removido da lista.

4. **Sair:**
   - Encerra a execução do programa.

---

## ❌ Tratamento de Erros:

- **Cadastro de Paciente Duplicado:**
  - O paciente não pode ser cadastrado mais de uma vez.
  - Para evitar duplicidade, garanta que o número de telefone seja diferente para cada cadastro.
  - Caso ocorra uma tentativa de cadastro duplicado, exibe a mensagem "Paciente já cadastrado!" e retorna ao menu principal.

- **Marcação de Consulta em Data e Hora Já Agendadas:**
  - Pacientes não podem marcar consultas em dias e horários já agendados.
  - Verifica se a data e a hora selecionadas estão disponíveis antes de realizar o agendamento.

- **Consulta Retroativa:**
  - Consultas não podem ser marcadas antes da data atual.
  - Certifica-se de que o usuário não possa agendar consultas retroativas.

---

## 🗃️ Armazenamento Persistente:

- A minha ideia foi armazenar as informações dos pacientes em um arquivo csv, que é amplamente utilizado para armazenamento de dados e tem uma exibição como tabela aqui no GitHub.
  - [agendamentos.csv](https://github.com/EdnaldoLuiz/clinica-consultas/blob/main/agendamentos.csv)
  - [pacientes.csv](https://github.com/EdnaldoLuiz/clinica-consultas/blob/main/pacientes.csv)

---

## ▶️ Executar o Projeto

```bash
git clone https://github.com/EdnaldoLuiz/clinica-consultas.git
cd clinica-consultas
```
> Obs: Precisa ter o JDK instalado e abra em uma IDE Java de sua escolha

---

## 👨‍💻 Motivações

### Por que Java?

Java é meu maior forte e a linguagem que eu tenho mais estudado a cerca de 2 anos, 
na qual considero uma linguagem incrivel para desenvolver sistemas de alto nivel para Back-end,
mas sempre estou aberto a novas tecnologias, o principal é conseguir resolver problemas!

### Por que CSV?

Optei por utilizar CSV porque ele oferece várias vantagens em cenários onde a estrutura de dados precisa ser armazenada de forma organizada e legível por máquinas, sendo o formato mais utilizado para armazenamento de dados.

## 🛠️ Tecnologias Utilizadas:

<table align="center" width=1000px>
    <thead>
        <tr>
            <th><img src="https://skillicons.dev/icons?i=java" width=80px height=80px/></th>
            <th><img src="https://skillicons.dev/icons?i=vscode" width=80px height=80px/></th>
          <th><img src="https://skillicons.dev/icons?i=maven" width=80px height=80px/></th>
        </tr>
    </thead>
    <tbody align="center">
        <tr>
            <td>Java</td>
            <td>VSCode</td>
            <td>Maven</td>
        </tr>
        <tr>
            <td>🔖 17</td>
            <td>🔖 1.83</td>
            <td>🔖 3.9.6</td>
        </tr>
    </tbody>
</table>