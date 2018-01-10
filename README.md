### 主要目标：

1. 掌握Java Web应用开发的基本环境搭建。
2. 掌握Intellij开发环境的使用。
3. 掌握Java Web应用开发前后端相关技术。
4. 掌握Web应用开发的基本流程。 

### 开发环境：

最低配置：cpu:i5xxx 8g内存 ssd硬盘。推荐：i7 16g ssd硬盘。 
- MACOSX（首选）
- LINUX
- WINDOWS
- JDK8
- IntelliJ 13.X
- Mysql(5.7/5.6)

### 学习资料：

- [java lanuage specification(语法规范)](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)
- [java learning by examples(*)](https://beginnersbook.com/java-tutorial-for-beginners-with-examples/)

- 其他java学习文档

    [百度云](https://pan.baidu.com/s/1o9dggYm)，密码: swq9
    1. HB314 你必须知道的261个Java语言问题.pdf (*)
    1. Java国际认证(SCJP)典型试题1000例.pdf (*) 
    1. Java编程思想第四版_完整中文高清版.pdf
    1. Effective Java中文版 第2版_完整版.pdf  
    以上文档中所有与界面开发相关的内容均可忽略。

- html5/css3/javascript  
    1. http://www.w3school.com.cn/html5/index.asp (*)
    1. http://www.w3school.com.cn/css3/index.asp
    1. http://www.w3school.com.cn/js/index.asp
    1. https://www.w3schools.com/bootstrap/default.asp

- Intellij 下载Ultimate版本，并安装
    1. https://www.jetbrains.com/idea/download/ 
    1. http://blog.csdn.net/zx110503/article/details/78734428

- IntelliJ IDEA 使用教程
    1. http://wiki.jikexueyuan.com/project/intellij-idea-tutorial/
    1. http://wiki.jikexueyuan.com/project/intellij-idea-tutorial/keymap-introduce.html(*)
    1. http://wiki.jikexueyuan.com/project/intellij-idea-tutorial/vcs-introduce.html (*)
    1. http://wiki.jikexueyuan.com/project/intellij-idea-tutorial/plugins-settings.html (*)

- Intellij码云插件（gitee）及其使用：  
    https://plugins.jetbrains.com/plugin/8383-gitee  
    下载正确的版本从本地安装插件，重启。  
    新建项目，从gitee获取本项目：https://gitee.com/wydh2010/internship-winter.git

### Maven
- Apache Maven 入门篇

    1. http://www.oracle.com/technetwork/cn/community/java/apache-maven-getting-started-1-406235-zhs.html
    1. http://www.oracle.com/technetwork/cn/community/java/apache-maven-getting-started-2-405568-zhs.html
    
    初步了解一下即可。无需安装maven，Intellij自带maven，以上操作可以在Intellij中直接完成项目创建。参见下面链接：  
    http://v.youku.com/v_show/id_XMTU5NzMzMjE4MA==.html?spm=a2h0k.8191407.0.0&from=s1.8-1-1.2

### Gradle  

   http://wiki.jikexueyuan.com/project/GradleUserGuide-Wiki/  
   初步了解一下即可。重点看java构建和依赖管理的基础知识。

### Junit
   [百度云](https://pan.baidu.com/s/1htgGiEg)，密码: bzhn
   视频中使用的是gradle（相当于maven），后面基本不变。需掌握在Intellij中，编写单元测试（在test目录下），基本annotation的使用，右键运行（单个方法，真个类）。
   https://gitee.com/wydh2010/internship-winter/tree/master/students/zhang-san/code 有基于maven和gradle的例子。

### Mysql

   http://www.runoob.com/mysql/mysql-install.html  
   掌握安装，建库（utf-8/utf8_general_ci)，基本sql语句即可。  
   客户端: navicat for mysql, SQuirreL SQL Client  
   也可以什么都不安装，Intellij自带管理和sql工具（datasource）

### SpringBoot
1.  https://spring.io/guides
1. 	https://spring.io/guides/gs/gradle/ (*)
1. 	https://spring.io/guides/gs/maven/ (*)
1. 	https://spring.io/guides/gs/serving-web-content/ (*)
1. 	https://spring.io/guides/gs/handling-form-submission/ (*)
1. 	https://spring.io/guides/gs/securing-web/ (*)
1. 	https://spring.io/guides/gs/accessing-data-jpa/ (*)
1. 	https://spring.io/guides/gs/managing-transactions/ (*)
1. 	https://spring.io/guides/gs/accessing-data-mysql/ (*)
1. 	https://spring.io/guides/gs/uploading-files/ (*)
1. 	https://spring.io/guides/tutorials/bookmarks/

### Thymeleaf

http://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html (*)  
掌握基本语法

### 以下部分有余力的同学可以先行学习

- Jhipster   
	http://www.jhipster.tech/ 掌握基本环境搭建，运行测试例子，参见下面视频。
	链接: https://pan.baidu.com/s/1htgGiEg 密码: bzhn   
	Get Started with JHipster 4.mp4 

- Angular

	https://angular.io/  
	https://angular.io/guide/quickstart


### (*) 重点掌握

如果同学们遇到困难，请自行查找其他资料。如果发现好的文档，请分享到此文档中。


##### 实习项目：云盘
##### 基本需求：
开发一个类似百度云盘的Web应用，允许用户创建目录，上传文件，下载文件等功能。
##### 主要功能列表：
1. 首页：应用介绍，提供登录，注册链接
2. 登录  
    必须：输入用户名和密码  
    可选：失败3次以上，显示验证码  
3. 注册：  
    必须：输入用户名和密码（重复两次）  
    可选：邮件验证激活
4. 我的云盘：可参照百度云盘。
    必须：显示根目录下的文件夹和文件列表。      
    必须：点击文件夹进入下级文件夹。         
    必须：文件下载。            
    必须：创建文件夹。             
    必须：上传文件。           
    必须：删除文件。            
    必须：删除目录。如果目录不为空，提示确认，并删除所有子目录及文件。         
    必须：按名称搜索。显示符合条件的文件夹和文件。            
    必须：登出系统。           
    必须：修改密码。             
    可选：用户选择列表模式或缩略图模式。在缩略图模式下图片显示预览图。         
    可选：用户可选择按名称，日期，大小排序。          
    可选：显示文件夹的总容量。          
    可选：支持创建分享功能（涉及安全及权限），我的分享。          
    可选：支持回收站。          
    可选：支持文件秒传。          
  
##### 技术要求：

1. SpringBoot, mysql/H2 
2. bootstrap, Thymeleaf

##### 可选技术：

Jhipster + Angular5

##### 开发过程：

0. 确定开发计划。
1. 界面设计：理解功能需求，绘制草图。
2. 架构设计：确定技术路线，包括数据库，前后端技术。
3. 数据库设计：设计表及其字段。创建数据库。
4. 程序开发：
	1. 搭建框架Springboot。实现基本的登录，权限认证等。
	2. 后台业务逻辑开发：DAO层开发。Service层开发。编写单元测试。
	3. 前端页面开发：静态页面框架开发（html，css）。动态页面整合（Thymeleaf, Controller）。
	4. 测试完善。  
		可选：自动化Web测试。
	5. 不断迭代。

每个同学在students目录下，创建以姓名全拼(以-分隔）的根目录，如。张三的目录为 zhang-san（全小写）。
参见：https://gitee.com/wydh2010/internship-winter/tree/master/students/zhang-san

##### 时间节点：
1. 2018-01-20 完成开发环境搭建。包括IntelliJ，mysql（可选），创建java项目，运行单元测试（在此基础上练习java）。
2. 2018-01-27 完成第一个SpringBoot的项目示例。包括：权限，JPA，Service，Controller，MVC，Thymeleaf的使用。
3. 2018-01-31 完成实习项目的初步设计。界面，数据库，程序框架等。
4. 2018-02-05 项目进度第一阶段汇报。 
5. 2018-02-12 项目进度第二阶段汇报。
后面时间待定。
6. 2018-02-28 项目总结汇报。 

##### 沟通机制：
1. 有问题，直接在微信群中留言，不定期回复。
2. 暂定每周五下午1:00-3:00在线沟通（如有变更会提前通知）。请大家准备好问题，在线解答。
