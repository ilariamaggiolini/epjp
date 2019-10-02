-- ? Coders
-- – Inserire come assunti oggi:
drop sequence cod_seq;
create sequence COD_seq start with 201;

-- ? 201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€
insert into coders values (COD_seq.nextval, 'Maria', 'Rossi', sysdate, 5000);
insert into coders values (COD_seq.nextval, 'Franco', 'Bianchi', sysdate, 4500);

-- – Cambiare il nome da Maria a Mariangela
update coders
set first_name = 'Mariangela'
where first_name = 'Maria';

-- – Aumentare di 500€ i salari minori di 6000€
update coders
set salary = salary + 500
where salary < 6000;

-- – Eliminare Franco Bianchi
delete from coders
where first_name= 'Franco' and last_name= 'Bianchi';

-- – Committare i cambiamenti
COMMIT;
