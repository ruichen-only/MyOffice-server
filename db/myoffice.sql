/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : myoffice

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 05/05/2022 09:37:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accessoryfile
-- ----------------------------
DROP TABLE IF EXISTS `accessoryfile`;
CREATE TABLE `accessoryfile`  (
  `AccessoryId` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件附件Id',
  `FileId` int(11) NOT NULL COMMENT '文件Id',
  `AccessoryName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '附件名称',
  `AccessorySize` int(11) NOT NULL COMMENT '附件大小',
  `AccessoryType` int(255) NOT NULL COMMENT '附件类型',
  `CreateDate` datetime(0) NOT NULL COMMENT '创建日期',
  `AccessoryPath` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '附件路径',
  PRIMARY KEY (`AccessoryId`) USING BTREE,
  INDEX `FileId`(`FileId`) USING BTREE,
  INDEX `AccessoryType`(`AccessoryType`) USING BTREE,
  CONSTRAINT `AccessoryType` FOREIGN KEY (`AccessoryType`) REFERENCES `filetypeinfo` (`FileTypeId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FileId` FOREIGN KEY (`FileId`) REFERENCES `fileinfo` (`FileId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for branchinfo
-- ----------------------------
DROP TABLE IF EXISTS `branchinfo`;
CREATE TABLE `branchinfo`  (
  `BranchId` int(11) NOT NULL AUTO_INCREMENT COMMENT '机构id',
  `BranchName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '机构名称',
  `BranchShortName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '机构简称',
  PRIMARY KEY (`BranchId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for departinfo
-- ----------------------------
DROP TABLE IF EXISTS `departinfo`;
CREATE TABLE `departinfo`  (
  `DepartId` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `DepartName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '部门名称',
  `PrincipalUser` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '部门负责人',
  `ConnectTelNo` bigint(20) NULL DEFAULT NULL COMMENT '联系电话',
  `ConnectMobileTelNo` bigint(20) NULL DEFAULT NULL COMMENT '移动电话',
  `Faxes` bigint(255) NULL DEFAULT NULL COMMENT '传真',
  `BranchId` int(11) NOT NULL COMMENT '所属机构',
  PRIMARY KEY (`DepartId`) USING BTREE,
  INDEX `PrincipalUser`(`PrincipalUser`) USING BTREE,
  INDEX `BranchId`(`BranchId`) USING BTREE,
  CONSTRAINT `BranchId` FOREIGN KEY (`BranchId`) REFERENCES `branchinfo` (`BranchId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `PrincipalUser` FOREIGN KEY (`PrincipalUser`) REFERENCES `userinfo` (`UserId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo`  (
  `FileId` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件Id',
  `FileName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '文件名称',
  `FileType` int(255) NOT NULL COMMENT '文件类型',
  `Remark` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '备注',
  `FileOwner` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '创建者',
  `CreateDate` datetime(0) NOT NULL COMMENT '创建日期',
  `ParentId` int(11) NOT NULL COMMENT '父节点Id',
  `FilePath` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '文件路径',
  `IfDelete` int(255) NOT NULL COMMENT '是否已删除。1：已删除、2：未删除',
  PRIMARY KEY (`FileId`) USING BTREE,
  INDEX `FileType`(`FileType`) USING BTREE,
  CONSTRAINT `FileType` FOREIGN KEY (`FileType`) REFERENCES `filetypeinfo` (`FileTypeId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for filetypeinfo
-- ----------------------------
DROP TABLE IF EXISTS `filetypeinfo`;
CREATE TABLE `filetypeinfo`  (
  `FileTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件类型id',
  `FileTypeName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '文件类型名',
  `FileTypeImage` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '文件类型对应的图标',
  `FileTypeSuffix` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '文件类型后缀',
  PRIMARY KEY (`FileTypeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for loginlog
-- ----------------------------
DROP TABLE IF EXISTS `loginlog`;
CREATE TABLE `loginlog`  (
  `LoginId` int(11) NOT NULL AUTO_INCREMENT COMMENT '登录日志id',
  `UserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '登录者',
  `LoginTime` datetime(0) NOT NULL COMMENT '登录时间',
  `IfSuccess` int(255) NOT NULL COMMENT '登录是否成功。1：成功、0失败。',
  `LoginUserIp` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '登录用户IP',
  `LoginDesc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '登录备注',
  PRIMARY KEY (`LoginId`) USING BTREE,
  INDEX `UserId2`(`UserId`) USING BTREE,
  CONSTRAINT `UserId2` FOREIGN KEY (`UserId`) REFERENCES `userinfo` (`UserId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manualsign
-- ----------------------------
DROP TABLE IF EXISTS `manualsign`;
CREATE TABLE `manualsign`  (
  `SignId` int(11) NOT NULL AUTO_INCREMENT COMMENT '签卡Id',
  `UserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户id',
  `SignTime` datetime(0) NOT NULL COMMENT '签卡时间',
  `SignDesc` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '签卡备注',
  `SignTag` int(255) NOT NULL COMMENT '签卡标记',
  PRIMARY KEY (`SignId`) USING BTREE,
  INDEX `UserId`(`UserId`) USING BTREE,
  CONSTRAINT `UserId` FOREIGN KEY (`UserId`) REFERENCES `userinfo` (`UserId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for meetinginfo
-- ----------------------------
DROP TABLE IF EXISTS `meetinginfo`;
CREATE TABLE `meetinginfo`  (
  `MeetingId` int(11) NOT NULL AUTO_INCREMENT COMMENT '会议类型Id',
  `MeetingName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '会议类型名称',
  PRIMARY KEY (`MeetingId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `MessageId` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息Id',
  `Title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '消息标题',
  `Content` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '消息内容',
  `Type` int(255) NOT NULL COMMENT '消息类型',
  `BeginTime` datetime(0) NOT NULL COMMENT '开始有效时间',
  `EndTime` datetime(0) NOT NULL COMMENT '有效结束时间',
  `FromUserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '发送者',
  `IfPublish` int(255) NOT NULL COMMENT '是否已发布',
  `RecordTime` datetime(0) NOT NULL COMMENT '发送时间',
  PRIMARY KEY (`MessageId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for messagetouser
-- ----------------------------
DROP TABLE IF EXISTS `messagetouser`;
CREATE TABLE `messagetouser`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号Id',
  `MessageId` int(11) NOT NULL COMMENT '消息Id',
  `ToUserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '发送对象Id',
  `IfRead` int(255) NOT NULL COMMENT '是否已读。1：已读、0：未读',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `MessageId`(`MessageId`) USING BTREE,
  INDEX `ToUserId`(`ToUserId`) USING BTREE,
  CONSTRAINT `MessageId` FOREIGN KEY (`MessageId`) REFERENCES `message` (`MessageId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `ToUserId` FOREIGN KEY (`ToUserId`) REFERENCES `userinfo` (`UserId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for messagetype
-- ----------------------------
DROP TABLE IF EXISTS `messagetype`;
CREATE TABLE `messagetype`  (
  `MessageTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息类型Id',
  `MessageTypeName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '消息类型名称',
  `MessageDesc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '消息类型描述',
  PRIMARY KEY (`MessageTypeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mynote
-- ----------------------------
DROP TABLE IF EXISTS `mynote`;
CREATE TABLE `mynote`  (
  `NoteId` int(11) NOT NULL AUTO_INCREMENT COMMENT '便签id',
  `NoteTitle` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '便签标题',
  `NoteContent` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '便签内容',
  `CreateTime` datetime(0) NOT NULL COMMENT '创建时间',
  `CreateUser` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '创建者',
  PRIMARY KEY (`NoteId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for operatelog
-- ----------------------------
DROP TABLE IF EXISTS `operatelog`;
CREATE TABLE `operatelog`  (
  `OperateId` int(11) NOT NULL AUTO_INCREMENT COMMENT '操作日志Id',
  `UserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '操作者',
  `OperateName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '操作名称',
  `ObjectId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '操作对象Id',
  `OperateDesc` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '操作描述',
  `OperateTime` datetime(0) NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`OperateId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for precontract
-- ----------------------------
DROP TABLE IF EXISTS `precontract`;
CREATE TABLE `precontract`  (
  `PreContractId` int(11) NOT NULL AUTO_INCREMENT COMMENT '预约序号Id',
  `ScheduleId` int(11) NOT NULL COMMENT '日程Id',
  `UserId` varbinary(50) NOT NULL COMMENT '预约人',
  PRIMARY KEY (`PreContractId`) USING BTREE,
  INDEX `ScheduleId`(`ScheduleId`) USING BTREE,
  CONSTRAINT `ScheduleId` FOREIGN KEY (`ScheduleId`) REFERENCES `schedule` (`ScheduleId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for readcommonmessage
-- ----------------------------
DROP TABLE IF EXISTS `readcommonmessage`;
CREATE TABLE `readcommonmessage`  (
  `ReadId` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号Id',
  `MessageId` int(11) NOT NULL COMMENT '消息Id',
  `UserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '消息读取者',
  PRIMARY KEY (`ReadId`) USING BTREE,
  INDEX `MessageId1`(`MessageId`) USING BTREE,
  INDEX `UserId1`(`UserId`) USING BTREE,
  CONSTRAINT `MessageId1` FOREIGN KEY (`MessageId`) REFERENCES `message` (`MessageId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `UserId1` FOREIGN KEY (`UserId`) REFERENCES `userinfo` (`UserId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for roleinfo
-- ----------------------------
DROP TABLE IF EXISTS `roleinfo`;
CREATE TABLE `roleinfo`  (
  `RoleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `RoleName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色名称',
  `RoleDesc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`RoleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for roleright
-- ----------------------------
DROP TABLE IF EXISTS `roleright`;
CREATE TABLE `roleright`  (
  `RoleRightId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色权限id',
  `RoleId` int(11) NOT NULL COMMENT '角色id',
  `NodeId` int(11) NOT NULL COMMENT '菜单节点id',
  PRIMARY KEY (`RoleRightId`) USING BTREE,
  INDEX `RoleId`(`RoleId`) USING BTREE,
  INDEX `NodeId`(`NodeId`) USING BTREE,
  CONSTRAINT `NodeId` FOREIGN KEY (`NodeId`) REFERENCES `sysfun` (`NodeId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `RoleId` FOREIGN KEY (`RoleId`) REFERENCES `roleinfo` (`RoleId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for schedule
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule`  (
  `ScheduleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '日程Id',
  `Title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '日程标题',
  `Address` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '会议地址',
  `MeetingId` int(11) NOT NULL COMMENT '会议类型',
  `BeginTime` datetime(0) NOT NULL COMMENT '日程开始时间',
  `EndTime` datetime(0) NOT NULL COMMENT '日程结束时间',
  `SchContent` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '日程内容',
  `CreateUser` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '创建者',
  `CreateTime` datetime(0) NOT NULL COMMENT '创建时间',
  `IfPrivate` int(255) NOT NULL COMMENT '是否私有',
  PRIMARY KEY (`ScheduleId`) USING BTREE,
  INDEX `MeetingId`(`MeetingId`) USING BTREE,
  CONSTRAINT `MeetingId` FOREIGN KEY (`MeetingId`) REFERENCES `meetinginfo` (`MeetingId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sysfun
-- ----------------------------
DROP TABLE IF EXISTS `sysfun`;
CREATE TABLE `sysfun`  (
  `NodeId` int(11) NOT NULL COMMENT '菜单节点id',
  `DisplayName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '菜单名称',
  `NodeURL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '菜单连接地址',
  `DisplayOrder` int(255) NOT NULL COMMENT '菜单显示顺序',
  `ParentNodeId` int(11) NOT NULL COMMENT '父节点id',
  PRIMARY KEY (`NodeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `UserId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户唯一标识',
  `UserName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '真实姓名',
  `Password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '密码',
  `DepartId` int(11) NOT NULL COMMENT '所在部门',
  `Gender` int(255) NOT NULL COMMENT '性别',
  `RoleId` int(11) NOT NULL COMMENT '用户角色',
  `UserState` int(255) NOT NULL COMMENT '用户状态',
  PRIMARY KEY (`UserId`) USING BTREE,
  INDEX `UserState`(`UserState`) USING BTREE,
  CONSTRAINT `UserState` FOREIGN KEY (`UserState`) REFERENCES `userstate` (`UserStateId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userstate
-- ----------------------------
DROP TABLE IF EXISTS `userstate`;
CREATE TABLE `userstate`  (
  `UserStateId` int(50) NOT NULL AUTO_INCREMENT COMMENT '1：正常状态；0：被屏蔽',
  `UserStateName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`UserStateId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for worktime
-- ----------------------------
DROP TABLE IF EXISTS `worktime`;
CREATE TABLE `worktime`  (
  `WorkTimeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '工作时间Id',
  `OnDutyTime` datetime(0) NOT NULL COMMENT '上班时间',
  `OffDutyTime` datetime(0) NOT NULL COMMENT '下班时间',
  PRIMARY KEY (`WorkTimeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
