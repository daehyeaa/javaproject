select * from customer;
select * from seq;

SELECT *
  FROM all_sequences
 WHERE sequence_name = 'BOARD_SEQ';
 

select count(*) as 개수 from customer ;

-- 임시 테이블 삭제
-- purge recyclebin; 임시테이블 만들어진 테이블 삭제 

-- primary key ( 기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
create table customer( no number(4) primary key,
										name varchar2(20),
										email varchar2(20),
										tel varchar2(20) );
										
alter table customer add(address varchar2(50));  -- //컬럼 추가
alter table customer add(reg_date timestamp);

create sequence customer_no_seq	
	start with 1
	increment by 1;
	
-- 예4	
create table member(name varchar2(20),
		    gender varchar2(10),
		    jumin1 varchar2(6),
            jumin2 varchar2(7),
		    address varchar2(100),
		    buseo  varchar2(20),
            sports varchar2(20),
            music varchar2(20),
            movie varchar2(20),
		    computer varchar2(20),
		    intro varchar2(1000)
		  );

select * from member;

--- 예5
select * from mem02;

create  table  mem02(id  varchar2(20)  primary key,
		  				passwd  varchar2(20),
		  				name  varchar2(20),
		  				reg_date  date);

-- 게시판

select * from board;
		  				
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- not null : null 값을 허용하지 않는다. 반드시 값을 입력해야된다는 의미
create table board(
	no number primary key,
	writer varchar2(20) not null,
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );

create sequence board_seq
start with 1
increment by 1;


--글작성 : InsertBoard.java
--글목록 : SelectBoard.java
--글수정 : UpdateBoard.java
--글삭제 : DeleteBoard.java






