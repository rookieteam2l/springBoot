/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80016
Source Host           : 127.0.0.1:3306
Source Database       : p2p

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-01-03 15:27:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ces
-- ----------------------------
DROP TABLE IF EXISTS `ces`;
CREATE TABLE `ces` (
  `11` time DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `222` date DEFAULT NULL,
  `3333` datetime DEFAULT NULL,
  `4444` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ces
-- ----------------------------
INSERT INTO `ces` VALUES ('10:57:59', '1', '2019-08-08', '2019-08-14 10:58:08', '1.23');

-- ----------------------------
-- Table structure for md_businesslog
-- ----------------------------
DROP TABLE IF EXISTS `md_businesslog`;
CREATE TABLE `md_businesslog` (
  `id` char(36) NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '用户ID',
  `TradeType` varchar(128) DEFAULT NULL COMMENT '交易类型',
  `description` varchar(128) DEFAULT NULL COMMENT '描述',
  `Money` decimal(18,4) DEFAULT NULL COMMENT '金额',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资金流动日志表';

-- ----------------------------
-- Records of md_businesslog
-- ----------------------------

-- ----------------------------
-- Table structure for md_loan
-- ----------------------------
DROP TABLE IF EXISTS `md_loan`;
CREATE TABLE `md_loan` (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '申请人ID',
  `User_Name` varchar(128) NOT NULL COMMENT '借款人姓名',
  `Telephone` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '申请人手机',
  `Address` varchar(128) DEFAULT NULL COMMENT '申请人地址',
  `LoanMoney` decimal(18,4) DEFAULT NULL COMMENT '借款金额',
  `LoanTerm` int(4) DEFAULT NULL COMMENT '借款期限',
  `LoanTime` datetime DEFAULT NULL COMMENT '放款时间',
  `LoanMode` varchar(128) DEFAULT NULL COMMENT '借款方式',
  `LoanUse` varchar(128) DEFAULT NULL COMMENT '借款用途',
  `ApprovalStatus` varchar(128) DEFAULT NULL COMMENT '借款状态',
  `LoanStatus` varchar(128) DEFAULT NULL COMMENT '是否放款',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='借款表';

-- ----------------------------
-- Records of md_loan
-- ----------------------------
INSERT INTO `md_loan` VALUES ('1', '123', '测试', '1', '', '263.0000', '6', '2019-07-12 17:48:28', '', null, null, null, null, null, null, null, null, '123', '2019-07-15 10:39:27', '1', '1', null, '2019-07-15 10:39:39');
INSERT INTO `md_loan` VALUES ('3039a415993f4282b6fd70332982e695', '123456', '张三', '18623710001', '河南开封', '99.0000', '12', '2019-07-15 15:21:29', '1', '6', null, null, null, null, null, null, null, '123', '2019-07-15 15:21:29', '0', '0', '123', '2019-07-15 15:21:29');
INSERT INTO `md_loan` VALUES ('5eb71e39d307426d9a14665649272489', '123456', '李四', '18623710001', '312', '321.0000', '6', '2019-07-15 15:22:30', '1', '1', null, null, null, null, null, null, null, '123', '2019-07-15 15:22:30', '0', '0', '123', '2019-07-15 15:22:30');
INSERT INTO `md_loan` VALUES ('61dabab57c3f4399a6c016c1bb7aefbf', '64321321', '小王', '18623710001', '广东深圳', '2000.0000', '12', '2019-07-16 14:25:55', '3', '2', null, null, null, null, null, null, null, '123', '2019-07-16 14:25:55', '0', '0', '123', '2019-07-16 14:25:55');
INSERT INTO `md_loan` VALUES ('75d3ebb7b2544d6d9b1a57add5c0cefe', '123456', '小李', '18623710001', '321', '321.0000', '12', '2019-07-15 15:23:42', '3', '2', null, null, null, null, null, null, null, '123', '2019-07-15 15:23:42', '0', '0', '123', '2019-07-15 15:23:42');
INSERT INTO `md_loan` VALUES ('88de6eb735394bfca2c78c8347378c76', '123456', '小张', '18623710001', '321', '321.0000', '12', '2019-07-15 15:28:40', '2', '2', null, null, null, null, null, null, null, '123', '2019-07-15 15:28:40', '0', '0', '123', '2019-07-15 15:28:40');
INSERT INTO `md_loan` VALUES ('8d7234150aa6462898a492240305a008', '123456', '王二', '18623710001', '321', '321.0000', '6', '2019-07-15 15:22:55', '3', '2', null, null, null, null, null, null, null, '123', '2019-07-15 15:22:55', '0', '0', '123', '2019-07-15 15:22:55');
INSERT INTO `md_loan` VALUES ('92863e141c0940698167f5940f297c7d', '32142131', '小刘', '18623710001', '重庆市', '66.0000', '6', '2019-07-16 14:28:53', '1', '1', null, null, null, null, null, null, null, '123', '2019-07-16 14:28:53', '0', '0', '123', '2019-07-16 14:28:53');
INSERT INTO `md_loan` VALUES ('a79eae29b121490094fac4f5b25c981d', '123456', '小赵', '18623710001', '河南开封', '99.0000', '6', '2019-07-15 15:19:05', '1', '6', null, null, null, null, null, null, null, '123', '2019-07-15 15:19:05', '0', '0', '123', '2019-07-15 15:19:05');
INSERT INTO `md_loan` VALUES ('c96edb1be86f4366b228ff1bda506720', '123456', '小吴', '18623710001', '河南省郑州市', '100.0000', '6', '2019-07-15 15:11:00', '2', '3', null, null, null, null, null, null, null, '123', '2019-07-15 15:11:00', '0', '0', '123', '2019-07-15 15:11:00');
INSERT INTO `md_loan` VALUES ('d2469d9aefd341db922847d809e1a679', '123456', '小明', '18623710001', '321', '321.0000', '6', '2019-07-15 15:30:23', '1', '2', null, null, null, null, null, null, null, '123', '2019-07-15 15:30:23', '0', '0', '123', '2019-07-15 15:30:23');
INSERT INTO `md_loan` VALUES ('dac5365e93a54390bc6d3bcacabf83a3', '64321321', '小陈', '18623710001', '广东深圳', '2000.0000', '12', '2019-07-16 14:27:23', '3', '2', null, null, null, null, null, null, null, '123', '2019-07-16 14:27:23', '0', '0', '123', '2019-07-16 14:27:23');

-- ----------------------------
-- Table structure for md_oplog
-- ----------------------------
DROP TABLE IF EXISTS `md_oplog`;
CREATE TABLE `md_oplog` (
  `id` char(36) NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '用户ID',
  `TradeType` varchar(128) DEFAULT NULL COMMENT '操作类型',
  `description` varchar(128) DEFAULT NULL COMMENT '描述',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志表';

-- ----------------------------
-- Records of md_oplog
-- ----------------------------

-- ----------------------------
-- Table structure for md_profit
-- ----------------------------
DROP TABLE IF EXISTS `md_profit`;
CREATE TABLE `md_profit` (
  `id` char(36) NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '用户ID',
  `User_Name` varchar(128) DEFAULT NULL COMMENT '用户姓名',
  `ProfitMoney` decimal(18,4) DEFAULT NULL COMMENT '收益金额',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收益记录表';

-- ----------------------------
-- Records of md_profit
-- ----------------------------

-- ----------------------------
-- Table structure for md_project
-- ----------------------------
DROP TABLE IF EXISTS `md_project`;
CREATE TABLE `md_project` (
  `id` char(36) NOT NULL COMMENT '主键',
  `Name` char(36) DEFAULT NULL COMMENT '项目名称',
  `User_ID` char(36) DEFAULT NULL COMMENT '申请人ID',
  `User_Name` varchar(128) DEFAULT NULL COMMENT '申请人姓名',
  `LoanMode` varchar(128) DEFAULT NULL COMMENT '信用类型',
  `LoanMoney` decimal(18,4) DEFAULT NULL COMMENT '贷款金额',
  `LoanRate` varchar(32) DEFAULT NULL COMMENT '年利率',
  `LoanTerm` varchar(128) DEFAULT NULL COMMENT '贷款期限',
  `LoanUse` varchar(128) DEFAULT NULL COMMENT '贷款用途',
  `BiddingPassword` varchar(128) DEFAULT NULL COMMENT '投标密码',
  `BiddingMoneyMin` decimal(18,4) DEFAULT NULL COMMENT '最低投标金额',
  `BiddingMoneyMax` decimal(18,4) DEFAULT NULL COMMENT '最高投标金额',
  `ValidTime` varchar(128) DEFAULT NULL COMMENT '有效时间',
  `PaymentsMode` varchar(128) DEFAULT NULL COMMENT '还款方式',
  `ProjectStatus` char(4) DEFAULT NULL COMMENT '项目状态',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目表';

-- ----------------------------
-- Records of md_project
-- ----------------------------

-- ----------------------------
-- Table structure for md_projectbidding
-- ----------------------------
DROP TABLE IF EXISTS `md_projectbidding`;
CREATE TABLE `md_projectbidding` (
  `id` char(36) NOT NULL COMMENT '主键',
  `project_ID` char(36) DEFAULT NULL COMMENT '项目ID',
  `project_Name` varchar(128) DEFAULT NULL COMMENT '项目名称',
  `Project_Money` varchar(128) DEFAULT NULL COMMENT '项目金额',
  `User_ID` char(36) DEFAULT NULL COMMENT '投标用户ID',
  `User_Name` varchar(128) DEFAULT NULL COMMENT '投标用户姓名',
  `BiddingMoney` decimal(18,4) DEFAULT NULL COMMENT '投标金额',
  `BiddingPassword` varchar(128) DEFAULT NULL COMMENT '投标密码',
  `BiddingMode` varchar(128) DEFAULT NULL COMMENT '投标方式',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目投标记录表';

-- ----------------------------
-- Records of md_projectbidding
-- ----------------------------

-- ----------------------------
-- Table structure for md_repayment
-- ----------------------------
DROP TABLE IF EXISTS `md_repayment`;
CREATE TABLE `md_repayment` (
  `id` char(36) NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '用户ID',
  `User_Name` varchar(128) DEFAULT NULL COMMENT '用户姓名',
  `Loan_ID` char(36) DEFAULT NULL COMMENT '借款ID',
  `LoanMoney` decimal(18,4) DEFAULT NULL COMMENT '贷款金额',
  `TotalAmount` decimal(18,4) DEFAULT NULL COMMENT '已还款总金额',
  `AmountPaid` decimal(18,4) DEFAULT NULL COMMENT '还款金额',
  `PaymentsTime` datetime DEFAULT NULL COMMENT '还款时间',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='还款表';

-- ----------------------------
-- Records of md_repayment
-- ----------------------------

-- ----------------------------
-- Table structure for sm_admin
-- ----------------------------
DROP TABLE IF EXISTS `sm_admin`;
CREATE TABLE `sm_admin` (
  `id` varchar(32) DEFAULT NULL,
  `User_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名',
  `PassWord` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `Name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `Gender` int(1) DEFAULT NULL COMMENT '性别',
  `Birthday` date DEFAULT NULL COMMENT '生日',
  `TelePhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `Email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `HireDate` date DEFAULT NULL COMMENT '入职时间',
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `LoginTime` datetime DEFAULT NULL COMMENT '登陆时间',
  `Reserve1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Reserve2` varchar(255) DEFAULT NULL,
  `Reserve3` varchar(255) DEFAULT NULL,
  `Reserve4` varchar(255) DEFAULT NULL,
  `Reserve5` varchar(255) DEFAULT NULL,
  `Create_Id` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(1) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(1) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_Id` varchar(32) DEFAULT NULL COMMENT '更新ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_admin
-- ----------------------------
INSERT INTO `sm_admin` VALUES ('1', 'ceshi', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sm_adminrole
-- ----------------------------
DROP TABLE IF EXISTS `sm_adminrole`;
CREATE TABLE `sm_adminrole` (
  `id` char(36) NOT NULL COMMENT '主键',
  `User_ID` char(36) DEFAULT NULL COMMENT '用户ID',
  `Role_ID` char(36) DEFAULT NULL COMMENT '角色ID',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员角色表';

-- ----------------------------
-- Records of sm_adminrole
-- ----------------------------

-- ----------------------------
-- Table structure for sm_authorize
-- ----------------------------
DROP TABLE IF EXISTS `sm_authorize`;
CREATE TABLE `sm_authorize` (
  `id` char(36) NOT NULL COMMENT '主键',
  `Au_Code` varchar(128) DEFAULT NULL COMMENT '权限编号',
  `Au_Name` varchar(128) DEFAULT NULL COMMENT '权限名称',
  `description` varchar(128) DEFAULT NULL COMMENT '权限描述',
  `Reserve1` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve2` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve3` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve4` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Reserve5` varchar(128) DEFAULT NULL COMMENT '预留字段',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sm_authorize
-- ----------------------------

-- ----------------------------
-- Table structure for sm_role
-- ----------------------------
DROP TABLE IF EXISTS `sm_role`;
CREATE TABLE `sm_role` (
  `id` varchar(32) DEFAULT NULL,
  `Role_Code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色编码',
  `Role_Name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色名称',
  `description` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `Reserve1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Reserve2` varchar(255) DEFAULT NULL,
  `Reserve3` varchar(255) DEFAULT NULL,
  `Reserve4` varchar(255) DEFAULT NULL,
  `Reserve5` varchar(255) DEFAULT NULL,
  `Create_Id` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(1) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(1) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_Id` varchar(32) DEFAULT NULL COMMENT '更新ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_role
-- ----------------------------

-- ----------------------------
-- Table structure for sm_roleau
-- ----------------------------
DROP TABLE IF EXISTS `sm_roleau`;
CREATE TABLE `sm_roleau` (
  `id` char(36) NOT NULL COMMENT '主键',
  `Role_ID` char(36) DEFAULT NULL COMMENT '角色ID',
  `Au_ID` char(36) DEFAULT NULL COMMENT '权限ID',
  `Create_Id` char(36) DEFAULT NULL COMMENT '创建用户',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(4) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(4) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_ID` char(36) DEFAULT NULL COMMENT '最后更新人ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Records of sm_roleau
-- ----------------------------

-- ----------------------------
-- Table structure for sm_user
-- ----------------------------
DROP TABLE IF EXISTS `sm_user`;
CREATE TABLE `sm_user` (
  `id` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `User_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名',
  `PassWord` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `Name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `Gender` int(1) DEFAULT NULL COMMENT '性别',
  `Birthday` date DEFAULT NULL COMMENT '生日',
  `TelePhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `Email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `Id_Card` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `Adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `LoginTime` datetime DEFAULT NULL COMMENT '登陆时间',
  `Reserve1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Reserve2` varchar(255) DEFAULT NULL,
  `Reserve3` varchar(255) DEFAULT NULL,
  `Reserve4` varchar(255) DEFAULT NULL,
  `Reserve5` varchar(255) DEFAULT NULL,
  `Create_Id` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `Create_Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Delete_Status` char(1) DEFAULT NULL COMMENT '删除状态标志',
  `Enable_Status` char(1) DEFAULT NULL COMMENT '启/禁状态标志',
  `Update_Id` varchar(32) DEFAULT NULL COMMENT '更新ID',
  `Update_Time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_user
-- ----------------------------
