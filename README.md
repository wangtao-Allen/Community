## Allen社区

## 部署
### 依赖
- git-拉取代码
- jdk-项目依赖
- maven-编译代码
- mysql-数据库
### 步骤
- yum update
- yum install git
- mkdir App
- mvn clean compile package-编译打包
- java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar-启动项目

## 资料
- [Spring 文档](https://spring.io/guides)
- [es 社区](https://elasticsearch.cn/)
- [flywaydb](https://flywaydb.org/documentation/)

## 工具
- [git 下载](https://git-scm.com/download)
- [bootstrap](https://v3.bootcss.com/)
- [markdown editor](https://pandao.github.io/editor.md/)

## API
https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/
## git 命令
- 为保证一次commit是一次完整的链路
```cmd
追加不修改描述
git commit --amend --no-edit
```
```cmd
flyway更新表结构命令
mvn flyway:migrate

mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```