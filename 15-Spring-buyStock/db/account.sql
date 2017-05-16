drop table if exists `account`;
create table `account` (
  `aid` int(11) not null auto_increment,
  `aname` varchar(20) not null,
  `balance` double not null,
  primary key (`aid`)
) engine=innodb default charset=utf8;
