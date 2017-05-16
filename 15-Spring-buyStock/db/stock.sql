drop table if exists `stock`;
create table `stock` (
  `sid` int(11) not null auto_increment,
  `sname` varchar(20) not null,
  `count` int(11) not null,
  primary key (`sid`)
) engine=innodb default charset=utf8;
