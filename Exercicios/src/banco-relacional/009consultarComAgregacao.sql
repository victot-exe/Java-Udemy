SELECT 
    regiao as 'Região',
    sum(populacao) as Total
from `estados`
GROUP BY regiao
order by Total desc
--sum = soma
SELECT 
    sum(populacao) as Total
from `estados`
--avg = média
SELECT 
    avg(populacao) as Total
from `estados`