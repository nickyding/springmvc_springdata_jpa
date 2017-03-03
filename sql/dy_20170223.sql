DROP TABLE
IF EXISTS `user`;

CREATE TABLE `dy_user` (
	`userId` BIGINT (11) NOT NULL AUTO_INCREMENT,
	`account` CHAR (30) NOT NULL,
	PRIMARY KEY (`userId`)
) ENGINE = InnoDB AUTO_INCREMENT = 0 DEFAULT CHARSET = utf8;

INSERT INTO `dy_user` (userId, account) VALUES (1, '123456');
INSERT INTO `dy_user` (userId, account) VALUES (2, '654321');
