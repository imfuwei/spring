drop table if exists `student`;
create table `student` (
  `id` int(11) not null auto_increment,
  `name` varchar(255) not null,
  `age` int(11) default null,
  primary key (`id`)
) engine=innodb default charset=utf8;