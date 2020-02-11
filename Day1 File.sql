create database myself
use myself  -- selecting the database
drop database myself -- deleting the database
create database mydatabase  -- creating  a database
use mydatabase
create table customer_table(     -- creating a table
cust_id INT not null,
cus_name varchar(50) not null,
cus_mobile bigint not null,
cus_address varchar(100) not null,
cus_dob varchar(50) not null,
cus_email varchar(50) not null
)
describe customer_table

alter table customer_table add cus_age int not null

describe customer_table

alter table customer_table 
add cust_income bigint not null
after cust_id, 
add cust_deposit bigint not null
after cus_email

alter table customer_table
modify cus_mobile bigint null

alter table customer_table
drop column cus_age

alter table customer_table 
change column cus_dob cust_dateofbirth varchar(30) not null

alter table customer_table 
rename to customer

-- truncate table customer 

use mydatabase

describe customer
insert into customer values(232, 422222, 'aakash', 1234562221, 'adyar', 11-12-98, 'def@fssf.com', 2532)
select * from customer
where cus_address = 'adyar'
and cust_id <300

select * from customer
where cus_address = 'coimbatore'
and cust_id <30

select * from customer 
where (cus_address = 'chennai' and cus_name = ' suparna ')
or (cust_id < 30)

select distinct cus_address 
from customer

select * from customer
where cus_address='chennai'
order by cus_name desc   -- asc

select cus_address, count(*)
from customer
group by cus_address

select cus_name from customer
where cus_address  not like 'che%'

select * from customer 
where cus_name not in ('bhavana', 'aakash')

select * from customer 
where cust_id between 22 and 23

select * from customer 
where cust_dateofbirth between cast ('22-22-22' as date) and cast ('21-2-99' as date)

select cus_name from customer
where cus_address like 'ad_a_';

create table product(   
prod_id INT not null,
prod_name varchar(50) not null,
prod_dom bigint not null,
prod_price bigint not null,
prod_availability varchar(50) not null
)

insert into product values(2211, 'Umbrella', 30-5-98, 7300, 'yes in all locations' )

describe product

update product set prod_name = 'Tennis bat'
where prod_id=2211;
set sql_safe_updates=0;

delete from product where prod_id = 2211;

select * from product;
select * from customer

