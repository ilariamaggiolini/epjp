set serveroutput on

alter table coders
add constraint coders_pk primary key(coder_id);

create table coder_salaries (
    coder_id number(6, 0)
        references coders(coder_id),
    old_salary number(8, 2),
    new_salary number(8, 2)
);

create or replace trigger salary_update
before update of salary on coders
for each row
begin
    insert into coder_salaries values(
        :old.coder_id, :old.salary, :new.salary);
end salary_update;
/

update coders
set salary = salary * 1.3
where coder_id > 103;