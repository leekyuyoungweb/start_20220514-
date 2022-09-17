CREATE USER admin@localhost identified by 'admin1234';
GRANT ALL PRIVILEGES ON webmarketdb.* TO admin@localhost;
flush privileges;
SHOW GRANTS FOR admin@localhost;