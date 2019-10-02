-- Per prima cosa faccio un DROP table delle tabelle che voglio inserire
-- Poi CREATE TABLE
-- Poi INSERT
-- Dopo COMMIT ovviamente quando sono sicura

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
    
create table courses (
   course_id integer
        constraint personal_course_id primary key,
      course_name varchar2(30),
      city varchar2(20)
      
    );
    
drop table trainees;
drop table courses;

insert into courses values (
   
insert into trainees values (1, 'Sergio', 'Evangelista', 34778687568);
insert into trainees values (2, 'Paolo', 'Riva', 34778687568);
insert into trainees values (3, 'Edoardo', 'Errani', 34778687566);
insert into trainees values (4, 'Alessandro', 'Armato', 34778677568); 
insert into trainees values (5, 'Luciana', 'Uggetti', 35778687568);
insert into trainees values (6, 'Zhanao', 'Wu', 34778687968);
insert into trainees values (7, 'Ilaria', 'Maggiolini', 34718687568);
insert into trainees values (8, 'Chiara', 'Saporito', 34773687568);
insert into trainees values (9, 'Antonino', 'Scarfone', 33778687568);
insert into trainees values (10, 'Marco', 'Blanco', 34778687560); 
insert into trainees values (11, 'Giovanni', 'Maggi', 34778687500);
