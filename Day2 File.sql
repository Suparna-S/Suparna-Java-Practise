use sakila
select * from actor
where first_name='Scarlett'

select * from actor
where last_name='Johansson'

select distinct last_name
from actor;

select last_name from actor group by last_name ;

select * from film natural join inventory ;

select count(film_actor.actor_id), actor.first_name, actor.last_name 
from actor inner join film_actor on actor.actor_id = film_actor.actor_id
group by film_actor.actor_id ;

select avg(length) as 'Average time of film' from film;

select name,avg(length)
from film join film_category using (film_id) join category using (category_id)
group by name
order by avg(length) desc;

select rental_id, datediff(return_date, rental_date) as 'Due Date' from rental,inventory where rental.inventory_id=inventory.inventory_id and inventory.film_id=1 

