# SpringCloud

## 项目说明</br>

|序号		| 项目名					|应用名				|端口		|说明	|
|:---	|:---					|:---				|:---	|:---|
|1		|springCloudEureka		|register-center	|8761	|注册中心|	
|2		|springCloudConfigServer|config-center		|8888	|配置中心|
|3		|springCloudZuulGateway	|gateway			|8111	|网关|
|4		|springCloudMonitor		|monitor			|9999	|监控,可以用来监控spring-boot项目的基本信息，详细的Health信息、内存信息、JVM信息、垃圾回收信息、各种配置信息（比如数据源、缓存列表和命中率）等|

## 启动顺序
 springCloudEureka —> springCloudConfigServer -> springCloudMonitor -> springCloudZuulGateway ……	</br>
 （springCloudEureka —> springCloudConfigServer的启动顺序必须遵守，其余启动顺序没有严格要求）


## springCloudZuulGateway
Zuul网关

### 过滤器
Zuul大部分功能都是通过过滤器来实现的。Zuul中定义了四种标准过滤器类型，这些过滤器类型对应于请求的典型生命周期。
* PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
* ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务。
* POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
* ERROR：在其他阶段发生错误时执行该过滤器。</br>
 	除了默认的过滤器类型，Zuul还允许我们创建自定义的过滤器类型。例如，我们可以定制一种STATIC类型的过滤器，直接在Zuul中生成响应，而不将请求转发到后端的微服务。
请参考前置过滤器PreZuulFilter