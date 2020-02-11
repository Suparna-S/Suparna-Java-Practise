create database NewDatabase
use NewDatabase
create table department(
dep_id int not null,
dep_name varchar(20) not null,
dep_desc varchar(50) 
)
create table project(
p_id varchar(50) not null,
p_name varchar(50) not null
)
create table employee
( e_id int not null,
e_nname varchar(50) not null,
e_dob varchar(50) not null,
e_doj varchar(50) not null,
e_designation varchar(50) not null,
e_salary bigint not null,
dep_id int not null,
dep_name varchar(20) not null,
e_age int
)
insert into department values (2001, 'LKM', 'learning knowledge management')
insert into department values (2002, 'JavaCap', 'Java Capability')
insert into department values (2003, '.NetCap', 'Dotnet Capability')
select * from department

insert into project values ('P1', 'Retail')
insert into project values ('P2', 'Insurance')
insert into project values ('P3', 'Resources')
insert into project values ('P4', 'Banking')
insert into project values ('P5', 'Internal Project')
select * from project

alter table employee 
change dep_name dept_name varchar(20) 
insert into employee values (7001, 'Cynthya', '1975-may-12', '14-feb-1997', 'CEO', 800000.00, 2001, Null, 45)
insert into employee values (7002, 'Mario', '14-feb-1976', '16-apr-1998', 'MD', 500000.00, 2002, 'JavaCap', 40)
insert into employee values (7003, 'Jacob', '16-may-1976', '16-apr-1998', 'MD', 500000.00, 2003, 'JavaCap', 40)