DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMMODITY_ID` int(11) DEFAULT NULL COMMENT '商品ID',
  `COMMODITY_NAME` varchar(63)  DEFAULT NULL COMMENT '商品名',
  `LOCATION` varchar(255)  DEFAULT NULL COMMENT '商品所在地点',
  `PRICE` int(11) DEFAULT NULL COMMENT '商品价格',
  `UNIT` varchar(11)  DEFAULT NULL COMMENT '价格单位（两，斤，千克，件）',
  `CATEGORY` varchar(63)  DEFAULT NULL COMMENT '商品种类',
  `BARCODE` varchar(255)  DEFAULT NULL COMMENT '商品条形码',
  `CURRENCY` varchar(11)  DEFAULT NULL COMMENT '币种',
  `EXCHANGE_RATE` int(11) DEFAULT NULL,
  `REMARK` varchar(255)  DEFAULT NULL COMMENT '备注',
  `GMT_REAL` timestamp NULL DEFAULT NULL COMMENT '商品记录对应的时间',
  `GMT_CREATE` timestamp NULL DEFAULT NULL COMMENT '创建这条记录的时间',
  `BROWSER_USER_AGENT` varchar(255)  DEFAULT NULL,
  PRIMARY KEY (`ID`)
);