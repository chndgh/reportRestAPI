
-- ----------------------------
--  Table structure for `r_shuxing`
-- ----------------------------
DROP TABLE IF EXISTS `r_shuxing`;
CREATE TABLE `r_shuxing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryid` text,
  `month` text,
  `shuxing` text,
  `shuxing_sub` text,
  `xiaoshoue` int(11) DEFAULT NULL,
  `xiaoliang` int(11) DEFAULT NULL,
  `saledproducts` int(11) DEFAULT NULL,
  `avgprice` int(11) DEFAULT NULL,
  `kedanjia` int(11) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `comentcount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `r_dianpu`;
CREATE TABLE `r_dianpu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shopid` text,
  `month` text,
  `categoryid` text,
  `xiaoshoue` int(11) DEFAULT NULL,
  `xiaoliang` int(11) DEFAULT NULL,
  `saledproducts` int(11) DEFAULT NULL,
  `avgprice` int(11) DEFAULT NULL,
  `people` int(11) DEFAULT NULL,
  `pricedist` double DEFAULT NULL,
  `location` text,
  `shopname` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
--  Table structure for `r_dapan`
-- ----------------------------
DROP TABLE IF EXISTS `r_dapan`;
CREATE TABLE `r_dapan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryid` text,
  `xiaoliang` int(11) DEFAULT NULL,
  `xiaoshoue` int(11) DEFAULT NULL,
  `saledproducts` int(11) DEFAULT NULL,
  `avgprice` int(11) DEFAULT NULL,
  `month` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `r_jiage`
-- ----------------------------
DROP TABLE IF EXISTS `r_jiage`;
CREATE TABLE `r_jiage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryid` text,
  `month` text,
  `start_price` int(11) DEFAULT NULL,
  `end_price` int(11) DEFAULT NULL,
  `xiaoshoue` int(11) DEFAULT NULL,
  `xiaoshouehuanbi` double DEFAULT NULL,
  `xiaoliang` int(11) DEFAULT NULL,
  `xiaolianghuanbi` double DEFAULT NULL,
  `saledproducts` int(11) DEFAULT NULL,
  `comentcount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
--  Table structure for `r_maijia`
-- ----------------------------
DROP TABLE IF EXISTS `r_maijia`;
CREATE TABLE `r_maijia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryid` text,
  `month` text,
  `xinji` int(11) DEFAULT NULL,
  `zuanji` int(11) DEFAULT NULL,
  `huangguan` int(11) DEFAULT NULL,
  `jinhuangguan` int(11) DEFAULT NULL,
  `tianmao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
--  Table structure for `r_pinpai`
-- ----------------------------
DROP TABLE IF EXISTS `r_pinpai`;
CREATE TABLE `r_pinpai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand` text,
  `month` text,
  `categoryid` text,
  `xiaoshoue` int(11) DEFAULT NULL,
  `xiaoliang` int(11) DEFAULT NULL,
  `activeshop` int(11) DEFAULT NULL,
  `saledproducts` int(11) DEFAULT NULL,
  `avglistprice` int(11) DEFAULT NULL,
  `avgprice` int(11) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `comentcount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
