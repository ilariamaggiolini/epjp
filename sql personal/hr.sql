describe regions;

 select * 
 from regions;
 
 select sysdate 
 from dual;
 
 select 4 * 5 
 from dual;
 
 select region_name 
 from regions;
 
 select * 
 from regions 
 where region_id = 1;-- commento con meno meno
 
 SELECT region_name 
 FROM regions 
 WHERE region_id = 1;
 
 SELECT ROWID, ROWNUM, region_name
 FROM regions;
 
 SELECT table_name --tabelle prefedefinite che ci sono sulla sx
   FROM user_tables;
   
 SELECT column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';

select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3 
from dual;

select to_date('02-NOV-2019') - to_date('25-MAR-2019') as "How many days"
from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;  -- crea una tabella temporale che mi riporta i risultati ed è slegata da quella reale

select first_name, last_name 
   FROM employees;
   
   select first_name || ' ' || last_name as "Employees"
   FROM employees;
   
   select first_name || '.' || last_name || '@x.com' as "mail"
   FROM employees; 
   
   select first_name, last_name, commission_pct 
   FROM employees;
   where commission_pct is null;
  
   select first_name, last_name, commission_pct 
   FROM employees;
   where commission_pct is not null; 
   
   select first_name, last_name, 12 * salary * nvl(commission_pct, 0) as "annual commition"
   FROM employees --nvl è tipo un if
   WHERE name > 'John';
   
      select 12 * salary * commission_pct as "annual commition"
   FROM employees --nvl è tipo un if
   WHERE employee_id=145;
   
       select 12 * salary * commission_pct as "annual commition"
   FROM employees --nvl è tipo un if
   WHERE first_name = 'John' and last_name = 'Russel';