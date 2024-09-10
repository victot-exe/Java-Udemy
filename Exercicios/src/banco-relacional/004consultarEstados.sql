select * from estados

select nome, sigla from estados

select Sigla, nome as 'Nome do Estado' from estados

select sigla, nome as 'Nome do Estado' from estados
WHERE regiao = 'sul'

select nome, regiao from estados
WHERE populacao >= 10
order by populacao

select nome, regiao from estados
WHERE populacao >= 10
order by populacao desc

select
  nome,
  regiao,
  populacao
from estados
WHERE populacao >= 10
order by populacao desc