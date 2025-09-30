# Trabalho-LPOO

Lógica de programação da clinica de exames
quem chegou
qual o clientes
valor relacionado com os exames do pedido
liberação depende da lista de exame (tempo depende do exame)
alguns exames exigem preparos
informações do cliente: nome e telefone
podem fazer exame em casa para alguns clientes, ex: idosos e pessoas com dificuldade de locomoção
convenio com empresa: cobra da empresa o valor do exame que cada funcionário vai fazer mas com 10% de desconto
prioridade na coleta para idosos
descontos só para convênio com empresas
Nome, telefone, data e hora da coleta, data e hora do resultado ( esses dois últimos dependem do tipo de exame)
Lista de exames serão passados
Funcionamento:
Segunda a sexta-feira
06:00 – 9:30 AM 13:00 – 15:00 PM
Não preocupa com a linguagem ainda não paizão
O resto dos horários é o trabalho interno
Marcação de horário depende dos exames que serão feitos
Marca um horário, pessoa chega e pega uma senha e faz os exame lá






Classe Cliente
Nome
Idade
Convenio
Telefone
FazInscrição()
TemConvenio()
FazEmCasa()
PrioridadeIdoso()



Classe Exame
Nome
Convenio
Data da Coleta()
Data de Entrega()
PrecisaDePreparo() #Ex: Precisa de jejum para fazer exame?
DescontoConvenio() # Puxa o salario dos funcionários e aplica o desconto do convênio
Tempo() #Calcula o tempo para fazer o exame



Classe Funcionários
Tempo de Trabalho
Função de Trabalho
Salário() #Calcula o valor que deve receber baseado na Função e no Tempo trabalhado



