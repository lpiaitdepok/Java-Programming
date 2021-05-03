
CREATE TABLE `users` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`username` varchar(255) DEFAULT NULL,
`nama_lengkap` varchar(255) DEFAULT NULL,
`email` varchar(255) DEFAULT NULL,
`no_hp` varchar(255) DEFAULT NULL,
`password` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'Mari Belajar Coding', null, null, 'admin');
