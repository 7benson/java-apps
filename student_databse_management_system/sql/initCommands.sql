
create database students_dbms;

\c students_dbms;
create table students(
	sid bigserial primary key,
	sname varchar(100) not null,
	sphone varchar(100),
	scity varchar(100)
);