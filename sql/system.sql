alter user hr IDENTIFIED BY hr ACCOUNT UNLOCK;

select * from all_users;

create user hb IDENTIFIED BY 1234;

GRANT connect, resource to hb;

ALTER USER hb IDENTIFIED BY 5678;

REVOKE connect, resource from hb;

drop user hb cascade;

create user test IDENTIFIED BY 1234;

GRANT connect, resource to test;
