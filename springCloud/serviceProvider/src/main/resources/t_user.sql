CREATE TABLE `t_user` (
  `userid` varchar(10) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `t_user` VALUES ('jack', 'jack', 'F', 18);
INSERT INTO `t_user` VALUES ('xcbeyond', 'xcbeyond', 'F', 18);
