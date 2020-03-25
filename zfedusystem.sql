
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `major` varchar(20) DEFAULT NULL,
  `college` varchar(20) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `Student` VALUES ('1', '201501234567', '张三', '1997-1-1', 'male', 'cs','cise','2016-3','123456');
INSERT INTO `Student` VALUES ('2', '201601234567', '李四', '1998-2-2', 'male', 'se','cise','2016-3','123456');
INSERT INTO `Student` VALUES ('3', '201601234568', '王五', '1999-3-3', 'female', 'se','cise','2016-3','123456');


DROP TABLE IF EXISTS `Teacher`;
CREATE TABLE `Teacher` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `major` varchar(20) DEFAULT NULL,
  `college` varchar(20) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `Teacher` VALUES ('1', '10101001', '张老师', '1967-1-1', 'male', 'cs','cise','2015-1','123456');
INSERT INTO `Teacher` VALUES ('2', '10101002', '李老师', '1968-2-2', 'male', 'se','cise','2014-2','123456');
INSERT INTO `Teacher` VALUES ('3', '10101003', '王老师', '1969-3-3', 'female', 'se','cise','2016-3','123456');


DROP TABLE IF EXISTS `Admin`;
CREATE TABLE `Admin` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `Admin` VALUES ('1', '2015001', 'Admin张', '1977-1-1', '男','123456');

DROP TABLE IF EXISTS `Score`;
CREATE TABLE `Score` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `c` varchar(4) DEFAULT 0,
  `cpp` varchar(4) DEFAULT 0,
  `java` varchar(4) DEFAULT 0,
  `python` varchar(4) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `Score` VALUES ('1', '201501234567', '张三', '99', '98','96','97');
INSERT INTO `Score` VALUES ('2', '201601234567', '李四', '91', '92','93','94');
INSERT INTO `Score` VALUES ('3', '201601234568', '王五', '100', '99','93','90');


DROP TABLE IF EXISTS `Course`;
CREATE TABLE `Course` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) NOT NULL,
  `major`varchar(20) NOT NULL,
  `college` varchar(30) NOT NULL,
  `grade` varchar(30) NOT NULL,
  `day` varchar(2) NOT NULL,
  `one` varchar(10) NOT NULL,
  `two` varchar(10) NOT NULL,
  `three` varchar(10) NOT NULL,
  `four` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `Course` VALUES ('1','201501234567','软件工程','计算机学院','2016-3','1','C','CPP','JAVA','Python');


DROP TABLE IF EXISTS `Blog`;
CREATE TABLE `Blog` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `num` varchar(15) NOT NULL,
  `author`varchar(20) NOT NULL,
  `title` varchar(30) NOT NULL,
  `body` varchar(300) NOT NULL,
  `date` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `Blog` VALUES (NULL,'201501234567','张三','Hello World!','Hello World!你好，世界','2018-01-04');
INSERT INTO `Blog` VALUES (NULL,'201601234567','李四','Hello World!','你好，世界','2018-01-04');
INSERT INTO `Blog` VALUES (NULL,'201601234568','王五','Test','这是一篇测试博文。','2018-01-04');




DROP TABLE IF EXISTS `Subject`;
CREATE TABLE `Subject` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `teacher`varchar(20) NOT NULL,
  `credit` varchar(30) NOT NULL,
  `xueshi` varchar(30) NOT NULL,
  `time` varchar(30) NOT NULL,
  `place` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;




INSERT INTO `Subject` VALUES (NULL,'JAVA','张老师','3','36','周一1、2节','JS1-519');
INSERT INTO `Subject` VALUES (NULL,'C','李老师','3','36','周五1、2节','JS1-519');
INSERT INTO `Subject` VALUES (NULL,'CPP','孙老师','3','36','周一3、4节','JS1-519');
INSERT INTO `Subject` VALUES (NULL,'数字逻辑','陈老师','3','36','周二1、2节','JS1-519');
INSERT INTO `Subject` VALUES (NULL,'数据结构','王老师','3','36','周三1、2节','JS1-519');

