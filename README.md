# Spring IoC Container Basics Homework

## 作业描述

阅读以下问题描述，按要求实现。

### Problem 1

分支：p1-starts-from-here

主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？
答案请写在对应分支的 README.md 文件中
@Componet和@Bean 是有不同的功能的。
@Componet(and @Service and @Repository and @Controller)是通过clathpath扫描来自动检测和配置bean，是class level的。@Bean是直接声明一个bean，不需要Sring检测，是method level的annotation。
有时候Spring的自动配置不可用，比如想要从第三方库里wire一个component，由于我们没有第三方库的源代码，我们不能够annotate @Component想用的那个class。这个时候只能用@Bean返回一个object，这样Spring就可以在application context里将其注册为bean。简单讲就是：We cannot create a bean of a class using @Component, if the class is outside spring container whereas we can create a bean of a class using @Bean even if the class is present outside the spring container.

### Problem 2

分支：p2-starts-from-here

GreetingService 现在必须为 prototype scope，如何保证每次 GreetingController 的 greet() 方法被调用时都会创建新的 greetingService bean？
至少2种解决方法且
GreetingController 仍为 singleton scope。
每种方案分别提交到单独的分支上，这些分支都需从 p2-starts-from-here 分出来，依次命名为 p2s1、p2s2即可。

附参考文章：https://www.baeldung.com/spring-inject-prototype-bean-into-singleton

### Problem 3

分支：p3-starts-from-here

有两个 beans：Foo 和 Bar。两者之间互相依赖，如何在 Spring Boot Application 中处理此种情况？
至少3种解决方法且
不可通过改变设计去除循环依赖
每种方案分别提交到单独的分支上，这些分支都需从 p3-starts-from-here 分出来，依次命名为 p3s1、p3s2、p3s3 即可。

附参考文章：https://www.baeldung.com/circular-dependencies-in-spring
