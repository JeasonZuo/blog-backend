CREATE TABLE post
(
    id          int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    create_time int(10) unsigned NOT NULL DEFAULT '0' COMMENT '数据创建时间',
    modify_time int(10) unsigned NOT NULL DEFAULT '0' COMMENT '数据最后更新时间',
    delete_time int(10) unsigned NOT NULL DEFAULT '0' COMMENT '数据删除时间',
    title       varchar(63)      NOT NULL DEFAULT '' COMMENT '标题',
    content     mediumtext       NOT NULL COMMENT '内容',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='文章表';