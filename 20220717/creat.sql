DROP schema if exists test;
create schema if not exists test;
use test;
drop table if exists book;
create table if not exists book(
	bookid int not null auto_increment comment 'book 아이디',
    bookname varchar(100) not null comment '책이름',    
    publisher varchar(100) not null comment '출판사',    
    price int not null comment '가격',
    primary key(bookid)
);
drop table if exists orders;
create table if not exists orders(
	orderid int not null auto_increment comment 'book 아이디',
    custid int not null comment '고객테이블 아이디',
    bookid int not null comment 'book 테이블 아이디',    
    saleprice int not null comment '판매가격',
    orderdate date not null comment '판매일자',
    primary key(orderid)
);
drop table if exists customers;
create table if not exists customers(
	custid int not null auto_increment comment '아이디',
    cname varchar(100) not null comment '고객이름',    
    address varchar(100) not null comment '주소',    
    phone varchar(100) comment '전화번호',
    primary key(custid)
);

INSERT INTO test.book (bookname,publisher,price) VALUES
	 ('축구의 역사','굿스포츠',7000),
	 ('축구아는 여자','나무수',13000),
	 ('축구의 이해','대한미디어',22000),
	 ('골프 바이블','대한미디어',35000),
	 ('피겨 교본','굿스포츠',8000),
	 ('역도 단계별기술','굿스포츠',6000),
	 ('야구의 추억','이상미디어',20000),
	 ('야구를 부탁해','삼성당',13000),
	 ('올림픽 이야기','굿스포츠',7500),
	 ('Olympic Champions','Prearson',13000);

	
	INSERT INTO test.customers (cname,address,phone) VALUES
	 ('박지성','영국 맨체스터','000-5000-0001'),
	 ('김연아','대한민국 서울','000-60000-0001'),
	 ('장미란','대한민국 강원도','000-7000-0001'),
	 ('추신수','미국 클리블랜드','000-8000-0001'),
	 ('박세리','대한민국 대전',NULL);

	INSERT INTO test.orders (custid,bookid,saleprice,orderdate) VALUES
	 (1,1,6000,'2022-01-01'),
	 (1,3,21000,'2022-05-09'),
	 (2,5,8000,'2022-08-07'),
	 (3,6,6000,'2022-01-05'),
	 (4,7,20000,'2022-07-12'),
	 (1,2,12000,'2022-03-08'),
	 (4,8,13000,'2022-10-10'),
	 (3,10,12000,'2022-12-12'),
	 (2,10,7000,'2022-01-01'),
	 (3,8,13000,'2022-08-19');