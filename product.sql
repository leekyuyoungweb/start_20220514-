use webmarketdb;
drop table if exists webmarketdb.product;
create table if not exists webmarketdb.product(
 productId varchar(100) not null    comment '상품아이디(pk)',
 pname   varchar(100)   comment '상품명',
 price   varchar(100)   comment '상품 가격',
 pdesc   varchar(100)   comment '상품 설명',
 manufacturer varchar(100) comment '제조사',
 category varchar(100)   comment '상품분류(식품,가전...)',
 unitStock   varchar(100) comment '재고',
 pcondition   varchar(100) comment '신품중고',
 filename   varchar(100) comment '이미지파일' ,
 primary key (productId)
)default CHARSET = utf8;

INSERT INTO product VALUES('P1234', 'iPhone 6s', '800000', '1334X750 Renina HD display, 8-megapixel iSight Camera','Smart Phone', 'Apple', '1000', 'new', '001.jpg');
INSERT INTO product VALUES('P1235', 'LG PC gram', '1500000', '3.3-inch,IPS LED display, 5rd Generation Intel Core processors', 'Notebook', 'LG', '1000', 'new', '002.jpg');
INSERT INTO product VALUES('P1236', 'Galaxy Tab S', '900000', '3.3-inch, 212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor', 'Tablet', 'Samsung', '1000', 'new', '003.jpg');


-- member table 생성
drop table if exists member;
create table if not exists member(
   id varchar(20) not null,
    passwd varchar(20) not null,
    name varchar(30) not null,
    primary key(id)
);

delete from member where id = 1;
select * from product;