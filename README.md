# Planify 

Projeto final desenvolvido para a disciplina de **Desenvolvimento para Dispositivos Móveis**.

O **Planify** é um sistema de agendamento e organização de compromissos para pequenos empreendedores e autônomos, com foco em controle de clientes, serviços e horários.

## 📂 Estrutura do Projeto

Para facilitar a avaliação, o projeto foi organizado seguindo a solicitação do docente:
- **`src/`**: Pasta raiz contendo todo o código-fonte, configurações de build e documentação técnica.
- **`src/agents.md`**: Documento detalhando os domínios e a divisão de trabalho da equipe.

## 🛠 Membros e Entidades
O projeto é dividido em 4 pilares fundamentais, cada um sob responsabilidade de um membro:
- **Clientes**: Gestão dos clientes atendidos pelo empreendedor.
- **Compromissos**: Agenda, horários e status (pendente, em andamento, concluído, cancelado).
- **Serviços**: Catálogo de serviços oferecidos pelo empreendedor.
- **Lembretes**: Notificações automáticas agendadas para cada compromisso.

## 🚀 Tecnologias Utilizadas
- Jetpack Compose (UI)
- Room Database (Persistência Local)
- Coroutines & Flow (Concorrência)
- Navigation Compose (Fluxo de Telas)
- AlarmManager / WorkManager (Lembretes locais)
