create table items (
item_id integer primary key,
status char,
name varchar2(20),
coder_id integer);

-- drop table coders; COMANDO CHE CANCELLA TUTTO, ATTENZIONE
create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

--SU PROMPT DEI COMANDI (cmd)
--C:\Users\Administrator>sqlplus / as sysdba
--SQL> grant select on hr.employees to me;

select * from coders;

alter table items add counter number(38, 0);

alter table items drop column counter;



insert into items values(1,'A','aaa',1);
select*
from items;

alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));

select*
from items;

alter table coders add constraint coders_name_uq unique(first_name, last_name);

alter table items modify name constraint items_name_nn not null;

alter table coders add constraint coders_pk primary key(coder_id);

alter table items drop constraint items_name_nn;

