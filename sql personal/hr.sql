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
   
   select count(rowid)
   from employees;
   --va bene x cercare dipendenti xkè c'è una tabella; x sapere quanti sono i manager (che nn hanno tab.):
   
   select distinct manager_id --permette di eliminare duplicati
   from employees;
   --OR
   select count(distinct manager_id)
   from employees;
   
   select distinct first_name
   from employees; --STESSA COSA DI PRIMA USANDO ANCHE COUNT
   
   select last_name 
   from employees 
   where last_name like '_ul%'; --un carattere e poi ul
   
  select last_name 
   from employees 
   where last_name like 'S%'; --tutti che incominciono x S
   
   select last_name 
   from employees 
   where last_name like 'S%h';
   
   select last_name 
   from employees 
   where last_name like 'S_o';
   
      select last_name 
   from employees 
   where last_name like '___'; -- tutti quelli che hanno tre lettere
   
   select * 
   from regions 
   where region_id not in (2, 3);

select * 
from regions 
where region_id not in (2, 3, null); -- !! NOT IN(…, NULL) ? FALSE !! Non succede niente

select * 
from regions 
where region_id between 2 and 3;

select * 
from employees
where salary < 3000 and employee_id > 195;
--OR
select * 
from employees
where salary > 20000 or last_name = 'King';
--NOT
select * 
from employees
where not department_id > 20;

--Tutti i nomi, cognomi, email, telefoni, date di assunzione, ordinati per cognome e nome
SELECT first_name, last_name, email, phone_number, hire_date
from employees;
select * from employees
order by last_name;

SELECT *
From employees;
where first_name = 'David' or first_name = 'Peter';

select * from employees
where department_id = 60;

select * from employees
where department_id = 30 or department_id = 50;

select * from employees
where salary > 10000;

select * from employees
where salary < 4000 and salary > 15000;

select * from employees
where (salary < 4000 or salary > 15000) and (department_id = 50 or department_id = 80);

SELECT * 
FROM employees;
WHERE hire_date like '_05%';

SELECT * 
FROM employees;
WHERE hire_date between '01-GEN-2005' and '31-DIC-2005';

SELECT * 
FROM employees
WHERE trunc(hire_date, 'year') = '01-GEN-05'; -- TRUNC

--Quali job_id sono presenti, in ordine naturale

SELECT distinct job_id
FROM employees
order by job_id;

--Chi ha una commissione

SELECT *
FROM employees
WHERE commission_pct is not null;

--Chi ha una ‘a’ nel nome o cognome
select first_name, last_name 
   from employees 
   where last_name like 'A' or first_name 'A';
   
select first_name, last_name 
   from employees 
   where regexp_like(last_name, '[Aa].');  

--? Departments: Nomi, in ordine naturale
SELECT department_name
FROM departments
order by 1;


-- ? Locations: Indirizzi delle sedi italiane
SELECT *
FROM locations
WHERE country_id like 'IT%';


-- ? Locations: Escludere i postal code che cominciano con 0
SELECT *
FROM locations
WHERE postal_code not like '0%' or postal_cod is null; -- fare attenzione ai null

select county_name
from countries
where region_id = 1;

select region_name
from regions
where region_id = 1;

select country_name, region_name
from regions r, countries c
where r.region_id = c.region_id;
--anche il seguente metodo è lo stesso ma risulta un pò più chiaro:
select country_name, region_name
from regions join countries
using (region_id)
orber by 1;

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 1; --SELF JOIN

select employee_id, city, department_name
from employees e join departments d on d.department_id = e.department_id
     join locations l on d.location_id = l.location_id;
--sopra è come scrivere: 
select employee_id, city, department_name
from employees join departments using(department_id)
     join locations using(location_id);
     
 select e.last_name, e.salary, j.min_salary
from employees e join jobs j
on(e.salary between j.min_salary and j.min_salary + 100)
where(e.job_id = j.job_id);  

select first_name, department_name
from employees left outer join departments
using(department_id)
where last_name = 'Grant';

--RIGHT OUTER JOIN
select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

--FULL OUTER JOIN
select e.last_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;

-- ? Nome degli employees e del loro department
select first_name, last_name, department_name 
   FROM employees e join departments d 
   on d.department_id = e.department_id
   
   
-- ? Nome degli employees e job title (da JOBS)
select first_name, last_name, job_title
from employees e join jobs j
on e.employees_id = j.job_title


-- ? Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title
select e.last_name, e.first_name, e.salary, j.min_salary, j.max_salary, j.job_title
from employees e join jobs j
on(e.salary = j.min_salary or e.salary = j.max_salary)
where(e.job_id = j.job_id);  


-- ? Nome degli employees basati in UK (LOCATIONS)
select first_name, last_name
from employees join departments 
using(department_id);
join locations using(location_id)
where country_id = 'UK';

-- ? Nome dei departments e manager associato
select first_name, last_name, department_name
   FROM departments d join employees e
   on (d.manager_id = e.employee_id);
   
-- ? Nome di ogni department e, se esiste, del relativo manager
select department_name
from departments
where manager_id is null;

-- ? Nome dei department che non hanno un manager associato
select department_name
from departements
where manager_id is null;

-- ? Nome degli employees e del loro manager
select e.first_name, e.last_name as employee, m.first_name, m.last_name as manager
from employees e join employees m
on(e.manager_id = m.manager_id)

-- ? Nome degli employees che non sono manager
select first_name, last_name 
from employees
where employee_id in (select manager_id 
                    from employees);

-- Vogliamo vedere la media di tutti i salari dei dipartimenti, escludendo i manager
select department_id, trunc(avg(salary)) from employees
group by department_id having avg(salary) < (
select max(avg(salary)) from employees group by department_id);

-- Dammi il nome del manager di Chen
select first_name, last_name from employees
where employee_id = (select manager_id 
                     from employees 
                     where last_name = 'Chen');

-- ? Employees
--– Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto
select last_name, first_name, salary, salary * 11.7647059
from employees;

--- Chi ha ‘a’ nel nome o cognome
select first_name, last_name 
   from employees 
   where regexp_like(last_name, '[a]'); 
   
--– Quanti mesi sono passati dall’assunzione a oggi
select last_name, first_name, TRUNC (months_between (sysdate, hire_date)) as ass_actual
from employees;

----- Quant’è la commissione di ognuno o ‘no value’
select first_name, last_name, nvl(to_char(commission_pct, '0,99'), 'no value'), commission_pct 
from employees; --metto to char xkè devo inserire no value e '0.99' perchè i risulati uscivano senza zero iniziale

--– Salario mostrato come una serie di asterischi (1 = 1000€)
select lpad('tom', 5, '.') tom, rpad('tim', 10, '_- -_') tim from dual;

select lpad('*', round(salary/1000), '*')salary,salary
from employees;

select manager_id, trunc(avg(salary))
from employees
where salary < 8000
group by manager_id
having avg(salary) > 6000
order by 2 desc;

select *
from (select employee_id from employees where employee_id between 112 and 115);
--sto creando una tab temporale che potrà avere un uso
select employee_id
from (select employee_id from employees where employee_id between 112 and 115);

--? Employees
--– Salary: maggiore, minore, somma, media
select max(salary)max, min(salary)min, sum(salary)sum, avg(salary)avg
from employees
order by 1;


--? Come sopra, ma per ogni job_id
select max(salary)max, min(salary)min, sum(salary)sum, avg(salary)avg
from employees
group by job_id
order by 1;

--– Quanti dipendenti per ogni job_id
select count(employee_id)
from employees
group by job_id
order by 1;

--? Quanti sono gli IT_PROG
select count(employee_id)
from employees
group by job_id
having job_id like 'IT_PROG';

--– Quanti sono i manager
select count(distinct (manager_id))
from employees;

--– Qual è la differenza tra il salario maggiore e il minore
select max(salary)-min(salary) as difference
from employees;

--? Come sopra, ma per ogni job_id, non considerando dove non c’è differenza
select max(salary)-min(salary) as difference
from employees
group by job_id
having max(salary)-min(salary)>0;

--– Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select min(salary)
from employees
where salary>6000 and employee_id in (select manager_id 
                    from employees);
                    
--? Indirizzi completi, tra locations e countries
select street_address, country_name
from locations join countries using (country_id);

--? Employees
--– Name e department name
select first_name, last_name, department_name
from employees join departments
using (department_id);

--? Come sopra, ma solo per chi è basato a Toronto
select first_name, last_name, department_name, city
from employees join departments
using (department_id) join locations using (location_id) 
where city like 'Toronto';

--– Chi è stato assunto dopo David Lee
select first_name, last_name, hire_date
from employees
where hire_date > (select hire_date from employees where first_name='David' and last_name='Lee');

--– Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name, e.hire_date, m.hire_date as hire_date_man
from employees e join employees m 
on(e.manager_id =m.manager_id)
where e.hire_date<m.hire_date;
   
--– Chi ha lo stesso manager di Lisa Ozer
select e.first_name, e.last_name
from employees e 
where e.manager_id = (select manager_id from employees where first_name = 'Lisa' and last_name = 'Ozer');

--– Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select first_name, last_name, department_id
from employees
where department_id in (select department_id from employees where REGEXP_LIKE (last_name, 'u', 'i')); --i serve x mainuscolo e minuscolo

--– Chi lavora nel department Shipping
select first_name, last_name
from employees join departments
using (department_id)
where department_name like 'Shipping';

--– Chi ha come manager Steven King
select first_name, last_name
from employees 
where manager_id in (select employee_id from employees where last_name = 'King' and first_name = 'Steven');

insert into regions
VALUES(12,null);

select * from regions;

rollback;
