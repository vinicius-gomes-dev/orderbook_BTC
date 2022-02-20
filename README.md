# Web Service para consumo de API do Mercado Bitcoin

## Tecnologias utilizadas

### Backend
- Java 11 (LTS)
- Spring 6.2.3
- PostgreSQL 12


## API consumida
- https://www.mercadobitcoin.net/api/BTC/orderbook


## APIs do Web

{{host}} = seu localhost ou onde quer que você tenha hospedado

### Salvar a base de dados em um banco de dados
- {{host}}/book/get-all

<interval> = intervalo desejado

### Listagem com definição de intervalo
- {{host}}/book?interval=<interval>
Ex.: {{host}}/book?interval=1