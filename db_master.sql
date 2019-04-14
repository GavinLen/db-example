/*
 Navicat Premium Data Transfer

 Source Server         : mysql-localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : db_master

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 14/04/2019 23:33:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_book_0
-- ----------------------------
DROP TABLE IF EXISTS `t_book_0`;
CREATE TABLE `t_book_0`  (
  `id` int(11) UNSIGNED NOT NULL COMMENT 'id',
  `book_name` varchar(511) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍名称',
  `book_author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍作者',
  `book_type` tinyint(4) UNSIGNED NULL DEFAULT NULL COMMENT '书籍类型',
  `book_price` float(6, 2) UNSIGNED NULL DEFAULT NULL COMMENT '书籍价格',
  `isbn` varchar(63) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ISBN',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book_0
-- ----------------------------
INSERT INTO `t_book_0` VALUES (2, '数据据结构与算法', 'Adam Drozdek', 1, 98.00, '978-7-302-37668-2', '2019-04-14 15:04:53');
INSERT INTO `t_book_0` VALUES (4, 'Python 从入门到实践', 'Eric Matthes', 1, 89.00, '979-7-115-42802-8', '2019-04-14 15:06:25');
INSERT INTO `t_book_0` VALUES (6, 'Test_6', 'Author_6', 1, 11.00, '978-7-302-42328-6', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (8, 'Test_8', 'Author_8', 1, 11.00, '978-7-302-42328-8', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (10, 'Test_10', 'Author_10', 1, 11.00, '978-7-302-42328-10', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (12, 'Test_12', 'Author_12', 1, 11.00, '978-7-302-42328-12', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (14, 'Test_14', 'Author_14', 1, 11.00, '978-7-302-42328-14', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (16, 'Test_16', 'Author_16', 1, 11.00, '978-7-302-42328-16', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (18, 'Test_18', 'Author_18', 1, 11.00, '978-7-302-42328-18', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (20, 'Update_Name', 'Author_20', 1, 11.00, '978-7-302-42328-20', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (22, 'Test_22', 'Author_22', 1, 11.00, '978-7-302-42328-22', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (24, 'Test_24', 'Author_24', 1, 11.00, '978-7-302-42328-24', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (26, 'Test_26', 'Author_26', 1, 11.00, '978-7-302-42328-26', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (28, 'Test_28', 'Author_28', 1, 11.00, '978-7-302-42328-28', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (30, 'Test_30', 'Author_30', 1, 11.00, '978-7-302-42328-30', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (32, 'Test_32', 'Author_32', 1, 11.00, '978-7-302-42328-32', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (34, 'Test_34', 'Author_34', 1, 11.00, '978-7-302-42328-34', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (36, 'Test_36', 'Author_36', 1, 11.00, '978-7-302-42328-36', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (38, 'Test_38', 'Author_38', 1, 11.00, '978-7-302-42328-38', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (40, 'Test_40', 'Author_40', 1, 11.00, '978-7-302-42328-40', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (42, 'Test_42', 'Author_42', 1, 11.00, '978-7-302-42328-42', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (44, 'Test_44', 'Author_44', 1, 11.00, '978-7-302-42328-44', '2019-04-14 00:00:00');
INSERT INTO `t_book_0` VALUES (46, 'Test_46', 'Author_46', 1, 11.00, '978-7-302-42328-46', '2019-04-14 00:00:00');

-- ----------------------------
-- Table structure for t_book_1
-- ----------------------------
DROP TABLE IF EXISTS `t_book_1`;
CREATE TABLE `t_book_1`  (
  `id` int(11) UNSIGNED NOT NULL COMMENT 'id',
  `book_name` varchar(511) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍名称',
  `book_author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍作者',
  `book_type` tinyint(4) UNSIGNED NULL DEFAULT NULL COMMENT '书籍类型',
  `book_price` float(6, 2) UNSIGNED NULL DEFAULT NULL COMMENT '书籍价格',
  `isbn` varchar(63) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ISBN',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book_1
-- ----------------------------
INSERT INTO `t_book_1` VALUES (1, 'Go In Action', 'Sau Sheong Chang', 1, 79.00, '978-7-115-3224-0', '2019-04-14 15:01:54');
INSERT INTO `t_book_1` VALUES (3, 'Go 并发编程实践', '郝林', 1, 80.00, '978-7-115-4525-1', '2019-04-14 15:03:21');
INSERT INTO `t_book_1` VALUES (5, '机器学习', '周志华', 1, 88.00, '978-7-302-42328-7', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (7, 'Test_7', 'Author_7', 1, 11.00, '978-7-302-42328-7', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (9, 'Test_9', 'Author_9', 1, 11.00, '978-7-302-42328-9', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (11, 'Test_11', 'Author_11', 1, 11.00, '978-7-302-42328-11', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (13, 'Test_13', 'Author_13', 1, 11.00, '978-7-302-42328-13', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (15, 'Test_15', 'Author_15', 1, 11.00, '978-7-302-42328-15', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (17, 'Test_17', 'Author_17', 1, 11.00, '978-7-302-42328-17', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (19, 'Test_19', 'Author_19', 1, 11.00, '978-7-302-42328-19', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (21, 'Test_21', 'Author_21', 1, 11.00, '978-7-302-42328-21', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (23, 'Test_23', 'Author_23', 1, 11.00, '978-7-302-42328-23', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (25, 'Test_25', 'Author_25', 1, 11.00, '978-7-302-42328-25', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (27, 'Test_27', 'Author_27', 1, 11.00, '978-7-302-42328-27', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (29, 'Test_29', 'Author_29', 1, 11.00, '978-7-302-42328-29', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (31, 'Test_31', 'Author_31', 1, 11.00, '978-7-302-42328-31', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (33, 'Test_33', 'Author_33', 1, 11.00, '978-7-302-42328-33', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (35, 'Test_35', 'Author_35', 1, 11.00, '978-7-302-42328-35', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (37, 'Test_37', 'Author_37', 1, 11.00, '978-7-302-42328-37', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (39, 'Test_39', 'Author_39', 1, 11.00, '978-7-302-42328-39', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (41, 'Test_41', 'Author_41', 1, 11.00, '978-7-302-42328-41', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (43, 'Test_43', 'Author_43', 1, 11.00, '978-7-302-42328-43', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (45, 'Test_45', 'Author_45', 1, 11.00, '978-7-302-42328-45', '2019-04-14 00:00:00');
INSERT INTO `t_book_1` VALUES (47, 'Test_47', 'Author_47', 1, 11.00, '978-7-302-42328-47', '2019-04-14 00:00:00');

-- ----------------------------
-- Table structure for t_book_type
-- ----------------------------
DROP TABLE IF EXISTS `t_book_type`;
CREATE TABLE `t_book_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(511) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `short_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '简称',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `state` bit(1) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book_type
-- ----------------------------
INSERT INTO `t_book_type` VALUES (1, '计算机与科学技术', '计算机', '2019-04-14 14:59:54', b'1');
INSERT INTO `t_book_type` VALUES (2, 'Java程序设计', 'Java', '2019-04-14 15:00:30', b'1');
INSERT INTO `t_book_type` VALUES (3, 'Go程序设计', 'Go', NULL, NULL);

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` bit(1) NULL DEFAULT NULL COMMENT '性别',
  `age` tinyint(4) NULL DEFAULT NULL COMMENT '年龄',
  `create_time` date NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
