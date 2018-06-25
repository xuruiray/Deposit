/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : deposit

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-06-26 01:36:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `card_info`
-- ----------------------------
DROP TABLE IF EXISTS `card_info`;
CREATE TABLE `card_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bank` varchar(20) COLLATE utf8_bin NOT NULL,
  `card_numbers` varchar(20) COLLATE utf8_bin NOT NULL,
  `create_time` datetime(6) NOT NULL,
  `modify_time` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of card_info
-- ----------------------------
INSERT INTO `card_info` VALUES ('100', '中国建设银行', '1', '2018-06-18 23:25:24.000000', '2018-06-18 23:25:26.000000');
INSERT INTO `card_info` VALUES ('101', '中国农业银行', '2', '2018-06-18 23:25:47.000000', '2018-06-18 23:25:50.000000');
INSERT INTO `card_info` VALUES ('102', '中国银行', '3', '2018-06-18 23:26:04.000000', '2018-06-18 23:26:06.000000');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `password` varchar(20) COLLATE utf8_bin NOT NULL,
  `identity_card` varchar(20) COLLATE utf8_bin NOT NULL,
  `create_time` datetime(6) NOT NULL,
  `modify_time` datetime(6) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_index_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('100', 'admin', 'Xx978271541', '131241241514', '2018-06-18 23:24:23.000000', '2018-06-18 23:24:26.000000');
