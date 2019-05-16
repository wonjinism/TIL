drop table accountbook;
drop table accountowner;
drop sequence accountseq;

create table AccountOwner
	(
		id varchar2(20) primary key
		, pw varchar2(20)
	);

create sequence AccountSeq;

create table AccountBook
	(
		accountseq varchar2(10)
		, id varchar2(20) references AccountOwner
		, title varchar2(100)
		, content varchar2(1000)
		, flag varchar2(1)
		, amount number(10)
		, eventdate date
		, indate date
	);
    
commit;

select * from accountowner;