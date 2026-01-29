# ProdutoService – Regras de Negócio

## Entrada
- Nome do produto
- Preço
- Estoque

## Saída
- Produto criado


## Regras de Negócio

### RN01 – Nome válido
- O Nome do produto obrigatório 
- O Nome do produto não pode ser null ou vazio 

Erro:
- NOME_OBRIGATORIO

### RN02 - Preço válido
- O Preço tem que ser maior que 0

Erro:
- PRECO_INVALIDO

### RN03 - Estoque válido
- O Estoque não pode ser negativo

Erro:
- ESTOQUE_INVALIDO