-- Per prima cosa faccio un DROP table delle tabelle che voglio inserire
-- Poi CREATE TABLE
-- Poi INSERT
-- Dopo COMMIT ovviamente quando sono sicura
drop table trainees;
drop table courses;
drop sequence trainees_sq;
drop sequence courses_sq;

create table courses (
   course_id integer
        constraint personal_course_id primary key,
      course_name varchar2(30),
      city varchar2(20)
      
    );
    
create table trainees (
    trainee_id integer
        constraint personal_id primary key,
    first_name varchar2(20),
    last_name varchar2(20),
    phone_number integer,
    course_id integer
        constraint trainees_course_id_fk references courses (course_id),
   
    constraint trainees_name_uq unique(first_name, last_name)
    );
    
create sequence trainees_sq start with 1000 increment by 1;
create sequence courses_sq start with 100 increment by 1;


insert into courses values (courses_sq.nextval, 'Java', 'Milano');
insert into courses values (courses_sq.nextval, 'C++', 'Roma');
insert into courses values (courses_sq.nextval, 'C++', 'Milano');

insert into trainees values (trainees_sq.nextval, 'Sergio', 'Evangelista', 34778687568, 100);
insert into trainees values (trainees_sq.nextval, 'Paolo', 'Riva', 34778687568, 100);
insert into trainees values (trainees_sq.nextval, 'Edoardo', 'Errani', 34778687566, 101);
insert into trainees values (trainees_sq.nextval, 'Alessandro', 'Armato', 34778677568, 101); 
insert into trainees values (trainees_sq.nextval, 'Luciana', 'Uggetti', 35778687568, 100);
insert into trainees values (trainees_sq.nextval, 'Zhanao', 'Wu', 34778687968, 100);
insert into trainees values (trainees_sq.nextval, 'Ilaria', 'Maggiolini', 34718687568, 102);
insert into trainees values (trainees_sq.nextval, 'Chiara', 'Saporito', 34773687568, 101);
insert into trainees values (trainees_sq.nextval, 'Antonino', 'Scarfone', 33778687568, 102);
insert into trainees values (trainees_sq.nextval, 'Marco', 'Blanco', 34778687560, 100); 
insert into trainees values (trainees_sq.nextval, 'Giovanni', 'Maggi', 34778687500, 102);

commit;
