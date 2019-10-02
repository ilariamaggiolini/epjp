create or replace view phone_view as 
select first_name, last_name, phone_number
from hr.employees
where employee_id not in (select manager_id from hr.employees where manager_id is not null)
with read only;

select *
from phone_view;

-- update phone_views
-- set phone_views;

