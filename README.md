# 市场商品价格记录管理系统

## 开始使用

1. 首先执行deploy中的init.sql脚本初始化数据库

2. 将MCPLM-FE文件夹放入nginx或apache等web服务器

3. 修改index.html中的服务端ip端口信息

4. 启动jar包

``` nohup java -jar  mcplm-0.0.1-SNAPSHOT.jar > mcplm.log 2>&1 & ```

5. 访问index.html

<img src="https://github.com/Lycine/MCPLM/blob/master/shortcut/shortcut1.jpg">

## 说明

- 默认使用了h2内存数据库，由于和mysql有所区别，快速演示时可以使用h2没问题，但是正常使用最好还是使用mysql

- 在application.yml中将spring.profile.active注释其中一个，即可使另一个生效，达到切换h2和mysql数据库目的

## change-log

### 0.0.2-20180819

- 增加change log

- maven打包文件名格式修改

- 修改查询接口参数,增加swagger查询接口默认值

### 0.0.1-20180819

- init