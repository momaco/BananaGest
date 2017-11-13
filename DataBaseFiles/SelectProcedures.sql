use bananaguest;

/*Llama todos los datos de USER*/
delimiter $$ 
create procedure selectUsers()
begin

    SELECT * FROM bananaguest.tbl_user;

end$$
delimiter;
