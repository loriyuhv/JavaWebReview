```mysql
CREATE TABLE `user`  (
  `id` bigint(20) PRIMARY KEY COMMENT '用户账号Id',
  `username` VARCHAR(30)  NOT NULL COMMENT 'zhang'hao',
  `password` VARCHAR(30)  NOT NULL COMMENT '密码',
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';
```

