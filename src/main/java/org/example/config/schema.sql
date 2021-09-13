drop table user_account if exists

create table user_account (
	id INT,
	name VARCHAR(50),
	surname VARCHAR(50),
	patronymic VARCHAR(50),
	login VARCHAR(50)
);

insert into user_account (id, name, surname, patronymic, login) values (1, 'Mariette', 'Downs', null, 'Konklab');
insert into user_account (id, name, surname, patronymic, login) values (2, 'Currie', 'Crowhurst', null, 'Holdlamis');
insert into user_account (id, name, surname, patronymic, login) values (3, 'Gard', 'Sperring', null, 'Pannier');
insert into user_account (id, name, surname, patronymic, login) values (4, 'Magdalena', 'Hubbold', null, 'Fix San');
insert into user_account (id, name, surname, patronymic, login) values (5, 'Karolina', 'Maffia', null, 'Fixflex');