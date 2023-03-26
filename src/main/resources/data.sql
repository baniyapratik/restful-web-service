insert into user_details(id,birth_date,name)
values(1001, current_date(), 'pratik');

insert into user_details(id,birth_date,name)
values(1002, current_date(), 'alex');

insert into user_details(id,birth_date,name)
values(1003, current_date(), 'rob');

insert into post(id,description,user_id)
values(2001, 'test description', 1001);

insert into post(id,description,user_id)
values(2002, 'multi cloud', 1001);

insert into post(id,description,user_id)
values(2003, 'aws certified', 1001);

insert into post(id,description,user_id)
values(2004, 'aws certified as well', 1002);