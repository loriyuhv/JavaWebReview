# javaweb-review

# 一、概要

**描述：**

本项目是一个用于记录JavaWeb全栈学习路径的代码仓库。内容涵盖Maven、Servlet/JSP、JDBC、Spring框架、Spring MVC、MyBatis、MyBatis Plus、Redis缓存、Spring Boot以及Spring Cloud微服务。项目采用多模块结构，每个技术点都有对应的独立学习模块，并通过Git分支和Tag进行版本管理，体现了循序渐进的学习过程。

**核心特点：**

📚 结构化学习路径 - 从基础到高级的渐进式模块设计

🧩 模块化代码组织 - 每个技术点都有独立可运行的示例

🏷️ 版本标签管理 - 使用 Git Tag 标记每个学习里程碑

🌳 标准 Git 工作流 - 功能分支开发，定期合并到主分支

🚀 实战导向 - 包含单体和微服务两个综合项目

**技术栈：**Java • Servlet • Spring • MyBatis • Redis • MySQL • Spring Boot • Spring Cloud

# 二、项目结构

```lua
javaweb-review/           # 项目根目录
│
├── README.md                       # 项目总说明
├── .gitignore						# 
├── pom.xml                         # 父POM：统一依赖管理
│
├── a-maven/                # Maven专题
│   ├── maven-01-quickstart/
│   ├── maven-02-dependency-management/
│   ├── maven-03-multi-module/
│   └── maven-04-plugins-profiles/
│
├── b-database-foundation/  # 数据库基础
│   ├── mysql-01-basics/            # MySQL基础
│   ├── mysql-02-ddl-dml/           # DDL与DML
│   ├── mysql-03-constraints-index/ # 约束与索引
│   ├── mysql-04-advanced-query/    # 高级查询
│   ├── mysql-05-transaction/       # 事务与锁
│   └── mysql-06-optimization/      # SQL优化
│
├── c-servlet-jsp/          # Servlet & JSP专题
│   ├── servlet-01-basics/
│   ├── servlet-02-request-response/
│   ├── servlet-03-session-cookies/
│   └── servlet-04-filters-listeners/
│
├── d-jdbc/                 # JDBC编程
│   ├── jdbc-01-basics/
│   ├── jdbc-02-preparedstatement/
│   ├── jdbc-03-transaction/
│   └── jdbc-04-datasource-pool/
│
├── e-spring-core/          # Spring核心
│   ├── spring-01-ioc-container/
│   ├── spring-02-bean-definition/
│   ├── spring-03-di/
│   ├── spring-04-aop/
│   ├── spring-05-annotation-config/
│   └── spring-06-java-config/
│
├── f-spring-mvc/           # Spring MVC
│   ├── spring-mvc-01-dispatcher/
│   ├── spring-mvc-02-controllers/
│   ├── spring-mvc-03-request-mapping/
│   ├── spring-mvc-04-view-resolver/
│   └── spring-mvc-05-rest/
│
├── g-mybatis/              # MyBatis
│   ├── mybatis-01-quickstart/
│   ├── mybatis-02-mapper-xml/
│   ├── mybatis-03-dynamic-sql/
│   └── mybatis-04-spring-integration/
│
├── h-mybatis-plus/         # MyBatis Plus
│   ├── mybatis-plus-01-crud/
│   ├── mybatis-plus-02-conditional/
│   └── mybatis-plus-03-pagination/
│
├── i-redis/                # Redis专题
│   ├── redis-01-basics/            # Redis基础
│   ├── redis-02-data-types/        # 数据类型操作
│   ├── redis-03-spring-integration/ # Spring集成
│   ├── redis-04-transaction/       # 事务与管道
│   ├── redis-05-persistence/       # 持久化机制
│   ├── redis-06-high-availability/ # 高可用与集群
│   └── redis-07-cache-patterns/    # 缓存模式
│
├── j-spring-boot/          # Spring Boot
│   ├── spring-boot-01-quickstart/
│   ├── spring-boot-02-config/
│   ├── spring-boot-03-web/
│   ├── spring-boot-04-data/        # 数据访问(MySQL+MyBatis)
│   ├── spring-boot-05-redis/       # Redis集成
│   ├── spring-boot-06-aop/
│   ├── spring-boot-07-transaction/
│   ├── spring-boot-08-cache/       # 缓存抽象(整合Redis)
│   ├── spring-boot-09-testing/
│   └── spring-boot-10-actuator/
│
└── l-spring-cloud/         # Spring Cloud微服务
    ├── spring-cloud-01-introduction/ # 微服务介绍
    ├── spring-cloud-02-eureka/     # 服务注册与发现
    ├── spring-cloud-03-ribbon/     # 客户端负载均衡
    ├── spring-cloud-04-feign/      # 声明式服务调用
    ├── spring-cloud-05-hystrix/    # 服务熔断与降级
    ├── spring-cloud-06-gateway/    # API网关
    ├── spring-cloud-07-config/     # 分布式配置中心
    ├── spring-cloud-08-sleuth/     # 分布式链路追踪
    ├── spring-cloud-09-security/   # 微服务安全
    └── spring-cloud-10-admin/      # 服务监控
```

