-- ? Coders
-- – Inserire come assunti oggi:
drop sequence cod_seq;
create sequence COD_seq start with 201;

-- ? 201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€
insert into coders values (201, 'Maria', 'Rossi', sysdate, 5000);
insert into coders values (COD_seq.nextval, 'Franco', 'Bianchi', sysdate, 4500);

-- – Cambiare il nome da Maria a Mariangela
-- – Aumentare di 500€ i salari minori di 6000€
-- – Eliminare Franco Bianchi
-- – Committare i cambiamenti

