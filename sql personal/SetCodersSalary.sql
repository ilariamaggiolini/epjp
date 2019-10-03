--PROCEDURA INCREASE CODE SALARY

set serveroutput on

create or replace procedure increase_salary(
    p_coder_id in coders.coder_id%type,
    p_increase in coders.salary%type,
    p_new_salary out coders.salary%type) is
begin
    update coders
    set salary = salary + p_increase
    where coder_id = p_coder_id;

    select salary
    into p_new_salary
    from coders
    where coder_id = p_coder_id;
end increase_salary;
/
COMMIT;

create or replace function function_increase_salary(
    p_coder_id in coders.coder_id%type,
    p_increase in coders.salary%type,
    p_new_salary out coders.salary%type)
return number as
    v_salary coders.salary%type;
begin
    update coders
    set salary = salary + p_increase
    where coder_id = p_coder_id;

    select salary
    into p_new_salary
    from coders
    where coder_id = p_coder_id;
end function_increase_salary;
/

COMMIT;

/*
declare
v_id coders.coder_id%type := 100;
v_increase coders.salary%type :=100;
v_new_salary coders.salary%type;
begin
increase_salary(v_increase, v_new_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/
*/