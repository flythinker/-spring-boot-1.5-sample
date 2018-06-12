## Spring Boot-1.5-Sample
公司选型spring boot 1.5 例子计划。公司20人左右的团队。其中一半左右后端团队。

#### 快速上手
  开发环境的详细默认信息。（[默认信息](default_dev_env.md) ）
  
  Spring boot  1.4 中文文档 
http://blog.didispace.com/books/spring-boot-reference/

Spring Framework 4 中文文档 
http://blog.didispace.com/books/spring-framework-4-reference/

#### 选型思考
* 为什么选择 spring boot 1.5.
```
   成熟 & 稳定。
       较spring boot 2.0 版本更加成熟，Bug会少一点。我们的团队也有一定的使用经验。
   提供快速开发的支持。
       spring boot 对 spring 的先前版本有很大的改进，方便支持快速开发,增加了新的更好的设计模式。
```   
* Redis VS kafka
```
   kafka 各方面都很好，但是引入会增加运维成本(HA & 日常运维)。在 redis不能满足要求时再考虑引入。
   虽然已经充分研究过了，虽然也有成功使用的实战经验，考虑到工作量，暂时不引入。
```
