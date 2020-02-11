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

describe customer_table

alter table customer_table
modify cus_mobile bigint null

describe customer_table	

alter table customer_table
drop column cus_age

describe customer_table

alter table customer_table 
change column cus_dob cust_dateofbirth varchar(30) not null

describe customer_table

alter table customer_table 
rename to customer

describe customer

-- truncate table customer 