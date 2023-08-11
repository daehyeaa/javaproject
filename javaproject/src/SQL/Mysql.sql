show databases;

show tables;

-- primary key ( 기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- auto_increment : 1부터 1씩 증가된 값을 자동으로 입력 한다는 의미
create table customer( no int(4) auto_increment primary key,
										name varchar(20),
										email varchar(20),
										tel varchar(20),
										address varchar(50),
										reg_date timestamp);
										
										
alter table customer add(address varchar2(50));  -- //컬럼 추가
alter table customer add(reg_date timestamp);

select * from customer;
select * from board limit 0,3;

-- 게시판

select * from board;
		  				
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- not null : null 값을 허용하지 않는다. 반드시 값을 입력해야된다는 의미
create table board(
	no int(4) auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp );