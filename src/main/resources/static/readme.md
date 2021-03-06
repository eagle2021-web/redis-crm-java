mvc
spring.mvc.async.request-timeout设定async请求的超时时间，以毫秒为单位，如果没有设置的话，以具体实现的超时时间为准，比如tomcat的servlet3的话是10秒.

spring.mvc.date-format设定日期的格式，比如dd/MM/yyyy.

spring.mvc.favicon.enabled是否支持favicon.ico，默认为: true

spring.mvc.ignore-default-model-on-redirect在重定向时是否忽略默认model的内容，默认为true

spring.mvc.locale指定使用的Locale.

spring.mvc.message-codes-resolver-format指定message codes的格式化策略(PREFIX_ERROR_CODE,POSTFIX_ERROR_CODE).

spring.mvc.view.prefix指定mvc视图的前缀.

spring.mvc.view.suffix指定mvc视图的后缀.

messages
spring.messages.basename指定message的basename，多个以逗号分隔，如果不加包名的话，默认从classpath路径开始，默认: messages

spring.messages.cache-seconds设定加载的资源文件缓存失效时间，-1的话为永不过期，默认为-1

spring.messages.encoding设定Message bundles的编码，默认: UTF-8

mobile
spring.mobile.devicedelegatingviewresolver.enable-fallback是否支持fallback的解决方案，默认false

spring.mobile.devicedelegatingviewresolver.enabled是否开始device viewresolver，默认为: false

spring.mobile.devicedelegatingviewresolver.mobile-prefix设定mobile端视图的前缀，默认为:mobile/

spring.mobile.devicedelegatingviewresolver.mobile-suffix设定mobile视图的后缀

spring.mobile.devicedelegatingviewresolver.normal-prefix设定普通设备的视图前缀

spring.mobile.devicedelegatingviewresolver.normal-suffix设定普通设备视图的后缀

spring.mobile.devicedelegatingviewresolver.tablet-prefix设定平板设备视图前缀，默认:tablet/

spring.mobile.devicedelegatingviewresolver.tablet-suffix设定平板设备视图后缀.

spring.mobile.sitepreference.enabled是否启用SitePreferenceHandler，默认为: true

view
spring.view.prefix设定mvc视图的前缀.

spring.view.suffix设定mvc视图的后缀.

resource
spring.resources.add-mappings是否开启默认的资源处理，默认为true

spring.resources.cache-period设定资源的缓存时效，以秒为单位.

spring.resources.chain.cache是否开启缓存，默认为: true

spring.resources.chain.enabled是否开启资源 handling chain，默认为false

spring.resources.chain.html-application-cache是否开启h5应用的cache manifest重写，默认为: false

spring.resources.chain.strategy.content.enabled是否开启内容版本策略，默认为false

spring.resources.chain.strategy.content.paths指定要应用的版本的路径，多个以逗号分隔，默认为:[/**]

spring.resources.chain.strategy.fixed.enabled是否开启固定的版本策略，默认为false

spring.resources.chain.strategy.fixed.paths指定要应用版本策略的路径，多个以逗号分隔

spring.resources.chain.strategy.fixed.version指定版本策略使用的版本号

spring.resources.static-locations指定静态资源路径，默认为classpath:[/META-INF/resources/,/resources/,/static/, /public/]以及context:/

multipart
spring.http.multipart.enabled是否开启文件上传支持，默认为true

spring.http.multipart.file-size-threshold设定文件写入磁盘的阈值，单位为MB或KB，默认为0。表示收到文件到达这么大后，不在放入缓存，而是写入临时文件。

spring.http.multipart.location指定文件上传路径.

spring.http.multipart.max-file-size指定文件大小最大值，默认1MB

spring.http.multipart.max-request-size指定每次请求的最大值，默认为10MB。由于可能同时上传多个文件，servlet可能会被同时请求，此限制总量。

freemarker
spring.freemarker.allow-request-override指定HttpServletRequest的属性是否可以覆盖controller的model的同名项

spring.freemarker.allow-session-override指定HttpSession的属性是否可以覆盖controller的model的同名项

spring.freemarker.cache是否开启template caching.

spring.freemarker.charset设定Template的编码.

spring.freemarker.check-template-location是否检查templates路径是否存在.

spring.freemarker.content-type设定Content-Type.

spring.freemarker.enabled是否允许mvc使用freemarker.

spring.freemarker.expose-request-attributes设定所有request的属性在merge到模板的时候，是否要都添加到model中.

spring.freemarker.expose-session-attributes设定所有HttpSession的属性在merge到模板的时候，是否要都添加到model中.

spring.freemarker.expose-spring-macro-helpers设定是否以springMacroRequestContext的形式暴露RequestContext给Spring’s macrolibrary使用

spring.freemarker.prefer-file-system-access是否优先从文件系统加载template，以支持热加载，默认为true

spring.freemarker.prefix设定freemarker模板的前缀.

spring.freemarker.request-context-attribute指定RequestContext属性的名.

spring.freemarker.settings设定FreeMarker keys.

spring.freemarker.suffix设定模板的后缀.

spring.freemarker.template-loader-path设定模板的加载路径，多个以逗号分隔，默认: ["classpath:/templates/"]

spring.freemarker.view-names指定使用模板的视图列表.

velocity
spring.velocity.allow-request-override指定HttpServletRequest的属性是否可以覆盖controller的model的同名项

spring.velocity.allow-session-override指定HttpSession的属性是否可以覆盖controller的model的同名项

spring.velocity.cache是否开启模板缓存

spring.velocity.charset设定模板编码

spring.velocity.check-template-location是否检查模板路径是否存在.

spring.velocity.content-type设定ContentType的值

spring.velocity.date-tool-attribute设定暴露给velocity上下文使用的DateTool的名

spring.velocity.enabled设定是否允许mvc使用velocity

spring.velocity.expose-request-attributes是否在merge模板的时候，将request属性都添加到model中

spring.velocity.expose-session-attributes是否在merge模板的时候，将HttpSession属性都添加到model中

spring.velocity.expose-spring-macro-helpers设定是否以springMacroRequestContext的名来暴露RequestContext给Spring’s macro类库使用

spring.velocity.number-tool-attribute设定暴露给velocity上下文的NumberTool的名

spring.velocity.prefer-file-system-access是否优先从文件系统加载模板以支持热加载，默认为true

spring.velocity.prefix设定velocity模板的前缀.

spring.velocity.properties设置velocity的额外属性.

spring.velocity.request-context-attribute设定RequestContextattribute的名.

spring.velocity.resource-loader-path设定模板路径，默认为:classpath:/templates/

spring.velocity.suffix设定velocity模板的后缀.

spring.velocity.toolbox-config-location设定Velocity Toolbox配置文件的路径，比如 /WEB-INF/toolbox.xml.

spring.velocity.view-names设定需要解析的视图名称.

thymeleaf
spring.thymeleaf.cache是否开启模板缓存，默认true

spring.thymeleaf.check-template-location是否检查模板路径是否存在，默认true

spring.thymeleaf.content-type指定Content-Type，默认为: text/html

spring.thymeleaf.enabled是否允许MVC使用Thymeleaf，默认为: true

spring.thymeleaf.encoding指定模板的编码，默认为: UTF-8

spring.thymeleaf.excluded-view-names指定不使用模板的视图名称，多个以逗号分隔.

spring.thymeleaf.mode指定模板的模式，具体查看StandardTemplateModeHandlers，默认为: HTML5

spring.thymeleaf.prefix指定模板的前缀，默认为:classpath:/templates/

spring.thymeleaf.suffix指定模板的后缀，默认为:.html

spring.thymeleaf.template-resolver-order指定模板的解析顺序，默认为第一个.

spring.thymeleaf.view-names指定使用模板的视图名，多个以逗号分隔.

mustcache
spring.mustache.cache是否Enable template caching.

spring.mustache.charset指定Template的编码.

spring.mustache.check-template-location是否检查默认的路径是否存在.

spring.mustache.content-type指定Content-Type.

spring.mustache.enabled是否开启mustcache的模板支持.

spring.mustache.prefix指定模板的前缀，默认: classpath:/templates/

spring.mustache.suffix指定模板的后缀，默认: .html

spring.mustache.view-names指定要使用模板的视图名.

groovy模板
spring.groovy.template.allow-request-override指定HttpServletRequest的属性是否可以覆盖controller的model的同名项

spring.groovy.template.allow-session-override指定HttpSession的属性是否可以覆盖controller的model的同名项

spring.groovy.template.cache是否开启模板缓存.

spring.groovy.template.charset指定Template编码.

spring.groovy.template.check-template-location是否检查模板的路径是否存在.

spring.groovy.template.configuration.auto-escape是否在渲染模板时自动排查model的变量，默认为: false

spring.groovy.template.configuration.auto-indent是否在渲染模板时自动缩进，默认为false

spring.groovy.template.configuration.auto-indent-string如果自动缩进启用的话，是使用SPACES还是TAB，默认为: SPACES

spring.groovy.template.configuration.auto-new-line渲染模板时是否要输出换行，默认为false

spring.groovy.template.configuration.base-template-class指定template baseclass.

spring.groovy.template.configuration.cache-templates是否要缓存模板，默认为true

spring.groovy.template.configuration.declaration-encoding在写入declaration header时使用的编码

spring.groovy.template.configuration.expand-empty-elements

是使用<br/>这种形式，还是<br></br>这种展开模式，默认为: false)

spring.groovy.template.configuration.locale指定template locale.

spring.groovy.template.configuration.new-line-string当启用自动换行时，换行的输出，默认为系统的line.separator属性的值

spring.groovy.template.configuration.resource-loader-path指定groovy的模板路径，默认为classpath:/templates/

spring.groovy.template.configuration.use-double-quotes指定属性要使用双引号还是单引号，默认为false

spring.groovy.template.content-type指定Content-Type.

spring.groovy.template.enabled是否开启groovy模板的支持.

spring.groovy.template.expose-request-attributes设定所有request的属性在merge到模板的时候，是否要都添加到model中.

spring.groovy.template.expose-session-attributes设定所有request的属性在merge到模板的时候，是否要都添加到model中.

spring.groovy.template.expose-spring-macro-helpers设定是否以springMacroRequestContext的形式暴露RequestContext给Spring’s macrolibrary使用

spring.groovy.template.prefix指定模板的前缀.

spring.groovy.template.request-context-attribute指定RequestContext属性的名.

spring.groovy.template.resource-loader-path指定模板的路径，默认为:classpath:/templates/

spring.groovy.template.suffix指定模板的后缀

spring.groovy.template.view-names指定要使用模板的视图名称.

http
spring.hateoas.apply-to-primary-object-mapper设定是否对object mapper也支持HATEOAS，默认为: true

spring.http.converters.preferred-json-mapper是否优先使用JSON mapper来转换.

spring.http.encoding.charset指定http请求和相应的Charset，默认: UTF-8

spring.http.encoding.enabled是否开启http的编码支持，默认为true

spring.http.encoding.force是否强制对http请求和响应进行编码，默认为true

json
spring.jackson.date-format指定日期格式，比如yyyy-MM-dd HH:mm:ss，或者具体的格式化类的全限定名

spring.jackson.deserialization是否开启Jackson的反序列化

spring.jackson.generator是否开启json的generators.

spring.jackson.joda-date-time-format指定Joda date/time的格式，比如yyyy-MM-ddHH:mm:ss). 如果没有配置的话，dateformat会作为backup

spring.jackson.locale指定json使用的Locale.

spring.jackson.mapper是否开启Jackson通用的特性.

spring.jackson.parser是否开启jackson的parser特性.

spring.jackson.property-naming-strategy指定PropertyNamingStrategy(CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES)或者指定PropertyNamingStrategy子类的全限定类名.

spring.jackson.serialization是否开启jackson的序列化.

spring.jackson.serialization-inclusion指定序列化时属性的inclusion方式，具体查看JsonInclude.Include枚举.

spring.jackson.time-zone指定日期格式化时区，比如America/Los_Angeles或者GMT+10.

jersey

spring.jersey.filter.order指定Jersey filter的order，默认为: 0

spring.jersey.init指定传递给Jersey的初始化参数.

spring.jersey.type指定Jersey的集成类型，可以是servlet或者filter.

server配置
server.address指定server绑定的地址

server.compression.enabled是否开启压缩，默认为false.

server.compression.excluded-user-agents指定不压缩的user-agent，多个以逗号分隔，默认值为:text/html,text/xml,text/plain,text/css

server.compression.mime-types指定要压缩的MIME type，多个以逗号分隔.

server.compression.min-response-size执行压缩的阈值，默认为2048

server.context-parameters.[param name]设置servlet context 参数

server.context-path设定应用的context-path.

server.display-name设定应用的展示名称，默认: application

server.jsp-servlet.class-name设定编译JSP用的servlet，默认: org.apache.jasper.servlet.JspServlet)

server.jsp-servlet.init-parameters.[param name]设置JSP servlet 初始化参数.

server.jsp-servlet.registered设定JSP servlet是否注册到内嵌的servlet容器，默认true

server.port设定http监听端口

server.servlet-path设定dispatcher servlet的监听路径，默认为: /

cookie、session配置
server.session.cookie.comment指定session cookie的comment

server.session.cookie.domain指定session cookie的domain

server.session.cookie.http-only是否开启HttpOnly.

server.session.cookie.max-age设定session cookie的最大age.

server.session.cookie.name设定Session cookie 的名称.

server.session.cookie.path设定session cookie的路径.

server.session.cookie.secure设定session cookie的“Secure” flag.

server.session.persistent重启时是否持久化session，默认false

server.session.timeout session的超时时间

server.session.tracking-modes设定Session的追踪模式(cookie, url, ssl).

ssl配置
server.ssl.ciphers是否支持SSL ciphers.

server.ssl.client-auth设定client authentication是wanted 还是 needed.

server.ssl.enabled是否开启ssl，默认: true

server.ssl.key-alias设定key store中key的别名.

server.ssl.key-password访问key store中key的密码.

server.ssl.key-store设定持有SSL certificate的key store的路径，通常是一个.jks文件.

server.ssl.key-store-password设定访问key store的密码.

server.ssl.key-store-provider设定key store的提供者.

server.ssl.key-store-type设定key store的类型.

server.ssl.protocol使用的SSL协议，默认: TLS

server.ssl.trust-store持有SSL certificates的Trust store.

server.ssl.trust-store-password访问trust store的密码.

server.ssl.trust-store-provider设定trust store的提供者.

server.ssl.trust-store-type指定trust store的类型.

tomcat
server.tomcat.access-log-enabled是否开启access log ，默认: false)

server.tomcat.access-log-pattern设定access logs的格式，默认: common

server.tomcat.accesslog.directory设定log的目录，默认: logs

server.tomcat.accesslog.enabled是否开启access log，默认: false

server.tomcat.accesslog.pattern设定access logs的格式，默认: common

server.tomcat.accesslog.prefix设定Log 文件的前缀，默认: access_log

server.tomcat.accesslog.suffix设定Log 文件的后缀，默认: .log

server.tomcat.background-processor-delay后台线程方法的Delay大小: 30

server.tomcat.basedir设定Tomcat的base 目录，如果没有指定则使用临时目录.

server.tomcat.internal-proxies设定信任的正则表达式，默认:“10\.\d{1,3}\.\d{1,3}\.\d{1,3}| 192\.168\.\d{1,3}\.\d{1,3}| 169\.254\.\d{1,3}\.\d{1,3}| 127\.\d{1,3}\.\d{1,3}\.\d{1,3}| 172\.1[6-9]{1}\.\d{1,3}\.\d{1,3}| 172\.2[0-9]{1}\.\d{1,3}\.\d{1,3}|172\.3[0-1]{1}\.\d{1,3}\.\d{1,3}”

server.tomcat.max-http-header-size设定http header的最小值，默认: 0

server.tomcat.max-threads设定tomcat的最大工作线程数，默认为: 0

server.tomcat.port-header设定http header使用的，用来覆盖原来port的value.

server.tomcat.protocol-header设定Header包含的协议，通常是 X-Forwarded-Proto，如果remoteIpHeader有值，则将设置为RemoteIpValve.

server.tomcat.protocol-header-https-value设定使用SSL的header的值，默认https.

server.tomcat.remote-ip-header设定remote IP的header，如果remoteIpHeader有值，则设置为RemoteIpValve

server.tomcat.uri-encoding设定URI的解码字符集.

undertow
server.undertow.access-log-dir设定Undertow access log 的目录，默认: logs

server.undertow.access-log-enabled是否开启access log，默认: false

server.undertow.access-log-pattern设定access logs的格式，默认: common

server.undertow.accesslog.dir设定access log 的目录.

server.undertow.buffer-size设定buffer的大小.

server.undertow.buffers-per-region设定每个region的buffer数

server.undertow.direct-buffers设定堆外内存

server.undertow.io-threads设定I/O线程数.

server.undertow.worker-threads设定工作线程数

datasource
spring.dao.exceptiontranslation.enabled是否开启PersistenceExceptionTranslationPostProcessor，默认为true

spring.datasource.abandon-when-percentage-full设定超时被废弃的连接占到多少比例时要被关闭或上报

spring.datasource.allow-pool-suspension使用Hikari pool时，是否允许连接池暂停，默认为: false

spring.datasource.alternate-username-allowed是否允许替代的用户名.

spring.datasource.auto-commit指定updates是否自动提交.

spring.datasource.catalog指定默认的catalog.

spring.datasource.commit-on-return设置当连接被归还时，是否要提交所有还未完成的事务

spring.datasource.connection-init-sql指定连接被创建，再被添加到连接池之前执行的sql.

spring.datasource.connection-init-sqls使用DBCP connection pool时，指定初始化时要执行的sql

spring.datasource.connection-properties.[key]在使用DBCP connection pool时指定要配置的属性

spring.datasource.connection-test-query指定校验连接合法性执行的sql语句

spring.datasource.connection-timeout指定连接的超时时间，毫秒单位.

spring.datasource.continue-on-error在初始化数据库时，遇到错误是否继续，默认false

spring.datasource.data指定Data (DML)脚本

spring.datasource.data-source-class-name指定数据源的全限定名.

spring.datasource.data-source-jndi指定jndi的地址

spring.datasource.data-source-properties.[key]使用Hikariconnectionpool时，指定要设置的属性

spring.datasource.db-properties使用Tomcatconnectionpool，指定要设置的属性

spring.datasource.default-auto-commit是否自动提交.

spring.datasource.default-catalog指定连接默认的catalog.

spring.datasource.default-read-only是否设置默认连接只读.

spring.datasource.default-transaction-isolation指定连接的事务的默认隔离级别.

spring.datasource.driver-class-name指定driver的类名，默认从jdbcurl中自动探测.

spring.datasource.fair-queue是否采用FIFO返回连接.

spring.datasource.health-check-properties.[key]使用Hikariconnectionpool时，在心跳检查时传递的属性

spring.datasource.idle-timeout指定连接多久没被使用时，被设置为空闲，默认为10ms

spring.datasource.ignore-exception-on-pre-load当初始化连接池时，是否忽略异常.

spring.datasource.init-sql当连接创建时，执行的sql

spring.datasource.initial-size指定启动连接池时，初始建立的连接数量

spring.datasource.initialization-fail-fast当创建连接池时，没法创建指定最小连接数量是否抛异常

spring.datasource.initialize指定初始化数据源，是否用data.sql来初始化，默认: true

spring.datasource.isolate-internal-queries指定内部查询是否要被隔离，默认为false

spring.datasource.jdbc-interceptors使用Tomcatconnectionpool时，指定jdbc拦截器，分号分隔

spring.datasource.jdbc-url指定JDBCURL.

spring.datasource.jmx-enabled是否开启JMX，默认为: false

spring.datasource.jndi-name指定jndi的名称.

spring.datasource.leak-detection-threshold使用Hikariconnectionpool时，多少毫秒检测一次连接泄露.

spring.datasource.log-abandoned使用DBCPconnectionpool，是否追踪废弃statement或连接，默认为: false

spring.datasource.log-validation-errors当使用Tomcatconnectionpool是否打印校验错误.

spring.datasource.login-timeout指定连接数据库的超时时间.

spring.datasource.max-active指定连接池中最大的活跃连接数.

spring.datasource.max-age指定连接池中连接的最大年龄

spring.datasource.max-idle指定连接池最大的空闲连接数量.

spring.datasource.max-lifetime指定连接池中连接的最大生存时间，毫秒单位.

spring.datasource.max-open-prepared-statements指定最大的打开的preparedstatements数量.

spring.datasource.max-wait指定连接池等待连接返回的最大等待时间，毫秒单位.

spring.datasource.maximum-pool-size指定连接池最大的连接数，包括使用中的和空闲的连接.

spring.datasource.min-evictable-idle-time-millis指定一个空闲连接最少空闲多久后可被清除.

spring.datasource.min-idle指定必须保持连接的最小值(ForDBCPandTomcatconnectionpools)

spring.datasource.minimum-idle指定连接维护的最小空闲连接数，当使用HikariCP时指定.

spring.datasource.name指定数据源名.

spring.datasource.num-tests-per-eviction-run指定运行每个idleobjectevictor线程时的对象数量

spring.datasource.password指定数据库密码.

spring.datasource.platform指定schema要使用的Platform(schema-${platform}.sql)，默认为: all

spring.datasource.pool-name指定连接池名字.

spring.datasource.pool-prepared-statements指定是否池化statements.

spring.datasource.propagate-interrupt-state在等待连接时，如果线程被中断，是否传播中断状态.

spring.datasource.read-only当使用Hikari connection pool时，是否标记数据源只读

spring.datasource.register-mbeans指定Hikari connection pool是否注册JMX MBeans.

spring.datasource.remove-abandoned指定当连接超过废弃超时时间时，是否立刻删除该连接.

spring.datasource.remove-abandoned-timeout指定连接应该被废弃的时间.

spring.datasource.rollback-on-return在归还连接时，是否回滚等待中的事务.

spring.datasource.schema指定Schema (DDL)脚本.

spring.datasource.separator指定初始化脚本的语句分隔符，默认: ;

spring.datasource.sql-script-encoding指定SQL scripts编码.

spring.datasource.suspect-timeout指定打印废弃连接前的超时时间.

spring.datasource.test-on-borrow当从连接池借用连接时，是否测试该连接.

spring.datasource.test-on-connect创建时，是否测试连接

spring.datasource.test-on-return在连接归还到连接池时是否测试该连接.

spring.datasource.test-while-idle当连接空闲时，是否执行连接测试.

spring.datasource.time-between-eviction-runs-millis指定空闲连接检查、废弃连接清理、空闲连接池大小调整之间的操作时间间隔

spring.datasource.transaction-isolation指定事务隔离级别，使用Hikari connection pool时指定

spring.datasource.url指定JDBC URL.

spring.datasource.use-disposable-connection-facade是否对连接进行包装，防止连接关闭之后被使用.

spring.datasource.use-equals比较方法名时是否使用String.equals()替换==.

spring.datasource.use-lock是否对连接操作加锁

spring.datasource.username指定数据库名.

spring.datasource.validation-interval指定多少ms执行一次连接校验.

spring.datasource.validation-query指定获取连接时连接校验的sql查询语句.

spring.datasource.validation-query-timeout指定连接校验查询的超时时间.

spring.datasource.validation-timeout设定连接校验的超时时间，当使用Hikari connection pool时指定

spring.datasource.validator-class-name用来测试查询的validator全限定名.

spring.datasource.xa.data-source-class-name指定数据源的全限定名.

spring.datasource.xa.properties指定传递给XAdatasource的属性

JPA
spring.jpa.database指定目标数据库.

spring.jpa.database-platform指定目标数据库的类型.

spring.jpa.generate-ddl是否在启动时初始化schema，默认为false

spring.jpa.hibernate.ddl-auto指定DDL mode(none, validate, update, create, create-drop). 当使用内嵌数据库时，默认是create-drop，否则为none.

spring.jpa.hibernate.naming-strategy指定命名策略.

spring.jpa.open-in-view是否注册OpenEntityManagerInViewInterceptor，绑定JPA EntityManager到请求线程中，默认为: true

spring.jpa.properties添加额外的属性到JPA provider.

spring.jpa.show-sql是否开启sql的log，默认为: false

jooq
spring.jooq.sql-dialect指定JOOQ使用的SQLDialect，比如POSTGRES.

h2
spring.h2.console.enabled是否开启控制台，默认为false

spring.h2.console.path指定控制台路径，默认为: /h2-console

JTA
spring.jta.allow-multiple-lrc是否允许 multiple LRC，默认为: false

spring.jta.asynchronous2-pc指定两阶段提交是否可以异步，默认为: false

spring.jta.background-recovery-interval指定多少分钟跑一次recovery process，默认为: 1

spring.jta.background-recovery-interval-seconds指定多久跑一次recovery process，默认: 60

spring.jta.current-node-only-recovery是否过滤掉其他非本JVM的recovery，默认为: true

spring.jta.debug-zero-resource-transaction是否追踪没有使用指定资源的事务，默认为: false

spring.jta.default-transaction-timeout设定默认的事务超时时间，默认为60

spring.jta.disable-jmx是否禁用jmx，默认为false

spring.jta.enabled是否开启JTA support，默认为: true

spring.jta.exception-analyzer设置指定的异常分析类

spring.jta.filter-log-status使用Bitronix Transaction Manager时，是否写mandatory logs，开启的话，可以节省磁盘空间，但是调试会复杂写，默认为false

spring.jta.force-batching-enabled使用Bitronix Transaction Manager时，是否批量写磁盘，默认为true.

spring.jta.forced-write-enabled使用Bitronix Transaction Manager时，是否强制写日志到磁盘，默认为true

spring.jta.graceful-shutdown-interval当使用Bitronix Transaction Manager，指定shutdown时等待事务结束的时间，超过则中断，默认为60

spring.jta.jndi-transaction-synchronization-registry-name当使用Bitronix Transaction Manager时，在JNDI下得事务同步registry，默认为: java:comp/TransactionSynchronizationRegistry

spring.jta.jndi-user-transaction-name指定在JNDI使用Bitronix Transaction Manager的名称，默认:java:comp/UserTransaction

spring.jta.journal当使用Bitronix Transaction Manager，指定The journal是否disk还是null还是一个类的全限定名，默认disk

spring.jta.log-dirTransaction logs directory.

spring.jta.log-part1-filename指定The journal fragment文件1的名字，默认: btm1.tlog

spring.jta.log-part2-filename指定The journal fragment文件2的名字，默认: btm2.tlog

spring.jta.max-log-size-in-mb指定journal fragments大小的最大值. 默认: 2M

spring.jta.resource-configuration-filename指定Bitronix Transaction Manager配置文件名.

spring.jta.server-id指定Bitronix Transaction Manager实例的id.

spring.jta.skip-corrupted-logs是否忽略corrupted log files文件，默认为false.

spring.jta.transaction-manager-id指定Transaction manager的唯一标识.

spring.jta.warn-about-zero-resource-transaction当使用Bitronix Transaction Manager时，是否对没有使用指定资源的事务进行警告，默认为: true

cache
spring.cache.cache-names指定要创建的缓存的名称，逗号分隔(若该缓存实现支持的话)

spring.cache.ehcache.config指定初始化EhCache时使用的配置文件的位置指定.

spring.cache.guava.spec指定创建缓存要使用的spec，具体详见CacheBuilderSpec.

spring.cache.hazelcast.config指定初始化Hazelcast时的配置文件位置

spring.cache.infinispan.config指定初始化Infinispan时的配置文件位置.

spring.cache.jcache.config指定jcache的配置文件.

spring.cache.jcache.provider指定CachingProvider实现类的全限定名.

spring.cache.type指定缓存类型

mongodb
spring.mongodb.embedded.features指定要开启的特性，逗号分隔.

spring.mongodb.embedded.version指定要使用的版本，默认: 2.6.10

redis
spring.redis.database指定连接工厂使用的Database index，默认为: 0

spring.redis.host指定Redis server host，默认为: localhost

spring.redis.password指定Redis server的密码

spring.redis.pool.max-active指定连接池最大的活跃连接数，-1表示无限，默认为8

spring.redis.pool.max-idle指定连接池最大的空闲连接数，-1表示无限，默认为8

spring.redis.pool.max-wait指定当连接池耗尽时，新获取连接需要等待的最大时间，以毫秒单位，-1表示无限等待

spring.redis.pool.min-idle指定连接池中空闲连接的最小数量，默认为0

spring.redis.port指定redis服务端端口，默认: 6379

spring.redis.sentinel.master指定redis server的名称

spring.redis.sentinel.nodes指定sentinel节点，逗号分隔，格式为host:port.

spring.redis.timeout指定连接超时时间，毫秒单位，默认为0

springdata
spring.data.elasticsearch.cluster-name指定es集群名称，默认: elasticsearch

spring.data.elasticsearch.cluster-nodes指定es的集群，逗号分隔，不指定的话，则启动client node.

spring.data.elasticsearch.properties指定要配置的es属性.

spring.data.elasticsearch.repositories.enabled是否开启es存储，默认为: true

spring.data.jpa.repositories.enabled是否开启JPA支持，默认为: true

spring.data.mongodb.authentication-database指定鉴权的数据库名

spring.data.mongodb.database指定mongodb数据库名

spring.data.mongodb.field-naming-strategy指定要使用的FieldNamingStrategy.

spring.data.mongodb.grid-fs-database指定GridFS database的名称.

spring.data.mongodb.host指定Mongo server host.

spring.data.mongodb.password指定Mongo server的密码.

spring.data.mongodb.port指定Mongo server port.

spring.data.mongodb.repositories.enabled是否开启mongodb存储，默认为true

spring.data.mongodb.uri指定Mongo database URI.默认:mongodb://localhost/test

spring.data.mongodb.username指定登陆mongodb的用户名.

spring.data.rest.base-path指定暴露资源的基准路径.

spring.data.rest.default-page-size指定每页的大小，默认为: 20

spring.data.rest.limit-param-name指定limit的参数名，默认为: size

spring.data.rest.max-page-size指定最大的页数，默认为1000

spring.data.rest.page-param-name指定分页的参数名，默认为: page

spring.data.rest.return-body-on-create当创建完实体之后，是否返回body，默认为false

spring.data.rest.return-body-on-update在更新完实体后，是否返回body，默认为false

spring.data.rest.sort-param-name指定排序使用的key，默认为: sort

spring.data.solr.host指定Solr host，如果有指定了zk的host的话，则忽略。默认为: http://127.0.0.1:8983/solr

spring.data.solr.repositories.enabled是否开启Solr repositories，默认为: true

spring.data.solr.zk-host指定zk的地址，格式为HOST:PORT.

activemq
spring.activemq.broker-url指定ActiveMQ broker的URL，默认自动生成.

spring.activemq.in-memory是否是内存模式，默认为true.

spring.activemq.password指定broker的密码.

spring.activemq.pooled是否创建PooledConnectionFactory，而非ConnectionFactory，默认false

spring.activemq.user指定broker的用户.

artemis(HornetQ捐献给apache后的版本)
spring.artemis.embedded.cluster-password指定集群的密码，默认是启动时随机生成.

spring.artemis.embedded.data-directory指定Journal文件的目录.如果不开始持久化则不必要指定.

spring.artemis.embedded.enabled是否开启内嵌模式，默认true

spring.artemis.embedded.persistent是否开启persistent store，默认false.

spring.artemis.embedded.queues指定启动时创建的队列，多个用逗号分隔，默认: []

spring.artemis.embedded.server-id指定Server ID. 默认是一个自增的数字，从0开始.

spring.artemis.embedded.topics指定启动时创建的topic，多个的话逗号分隔，默认: []

spring.artemis.host指定Artemis broker 的host. 默认: localhost

spring.artemis.mode指定Artemis 的部署模式, 默认为auto-detected(也可以为native or embedded).

spring.artemis.port指定Artemis broker 的端口，默认为: 61616

rabbitmq
spring.rabbitmq.addresses指定client连接到的server的地址，多个以逗号分隔.

spring.rabbitmq.dynamic是否创建AmqpAdmin bean. 默认为: true

spring.rabbitmq.host指定RabbitMQ host.默认为: localhost

spring.rabbitmq.listener.acknowledge-mode指定Acknowledge的模式.

spring.rabbitmq.listener.auto-startup是否在启动时就启动mq，默认: true)

spring.rabbitmq.listener.concurrency指定最小的消费者数量.

spring.rabbitmq.listener.max-concurrency指定最大的消费者数量.

spring.rabbitmq.listener.prefetch指定一个请求能处理多少个消息，如果有事务的话，必须大于等于transaction数量.

spring.rabbitmq.listener.transaction-size指定一个事务处理的消息数量，最好是小于等于prefetch的数量.

spring.rabbitmq.password指定broker的密码

spring.rabbitmq.port指定RabbitMQ 的端口，默认: 5672

spring.rabbitmq.requested-heartbeat指定心跳超时，0为不指定.

spring.rabbitmq.ssl.enabled是否开始SSL，默认: false)

spring.rabbitmq.ssl.key-store指定持有SSL certificate的key store的路径

spring.rabbitmq.ssl.key-store-password指定访问key store的密码.

spring.rabbitmq.ssl.trust-store指定持有SSL certificates的Trust store.

spring.rabbitmq.ssl.trust-store-password指定访问trust store的密码

spring.rabbitmq.username指定登陆broker的用户名

spring.rabbitmq.virtual-host指定连接到broker的Virtual host.

hornetq
spring.hornetq.embedded.cluster-password指定集群的密码，默认启动时随机生成.

spring.hornetq.embedded.data-directory指定Journal file 的目录. 如果不开启持久化则不必指定.

spring.hornetq.embedded.enabled是否开启内嵌模式，默认:true

spring.hornetq.embedded.persistent是否开启persistent store，默认: false

spring.hornetq.embedded.queues指定启动是创建的queue，多个以逗号分隔，默认: []

spring.hornetq.embedded.server-id指定Server ID. 默认使用自增数字，从0开始.

spring.hornetq.embedded.topics指定启动时创建的topic，多个以逗号分隔，默认: []

spring.hornetq.host指定HornetQ broker 的host，默认: localhost

spring.hornetq.mode指定HornetQ 的部署模式，默认是auto-detected，也可以指定native或者 embedded.

spring.hornetq.port指定HornetQ broker 端口，默认: 5445

jms
spring.jms.jndi-name指定Connection factory JNDI 名称.

spring.jms.listener.acknowledge-mode指定ack模式，默认自动ack.

spring.jms.listener.auto-startup是否启动时自动启动jms，默认为: true

spring.jms.listener.concurrency指定最小的并发消费者数量.

spring.jms.listener.max-concurrency指定最大的并发消费者数量.

spring.jms.pub-sub-domain是否使用默认的destination type来支持 publish/subscribe，默认: false

spring security是springboot支持的权限控制系统
security.basic.authorize-mode要使用权限控制模式.

security.basic.enabled是否开启基本的鉴权，默认为true

security.basic.path需要鉴权的path，多个的话以逗号分隔，默认为[/**]

security.basic.realmHTTP basic realm 的名字，默认为Spring

security.enable-csrf是否开启cross-site request forgery校验，默认为false.

security.filter-orderSecurity filter chain的order，默认为0

security.headers.cache是否开启http头部的cache控制，默认为false.

security.headers.content-type是否开启X-Content-Type-Options头部，默认为false.

security.headers.frame是否开启X-Frame-Options头部，默认为false.

security.headers.hsts指定HTTP Strict Transport Security(HSTS)模式(none, domain, all).

security.headers.xss是否开启cross-site scripting(XSS)保护，默认为false.

security.ignored指定不鉴权的路径，多个的话以逗号分隔.

security.oauth2.client.access-token-uri指定获取access token的URI.

security.oauth2.client.access-token-validity-seconds指定access token失效时长.

security.oauth2.client.additional-information.[key]设定要添加的额外信息.

security.oauth2.client.authentication-scheme指定传输不记名令牌(bearer token)的方式(form, header, none,query)，默认为header

security.oauth2.client.authorities指定授予客户端的权限.

security.oauth2.client.authorized-grant-types指定客户端允许的grant types.

security.oauth2.client.auto-approve-scopes对客户端自动授权的scope.

security.oauth2.client.client-authentication-scheme传输authentication credentials的方式(form, header, none, query)，默认为header方式

security.oauth2.client.client-id指定OAuth2 client ID.

security.oauth2.client.client-secret指定OAuth2 client secret. 默认是一个随机的secret.

security.oauth2.client.grant-type指定获取资源的access token的授权类型.

security.oauth2.client.id指定应用的client ID.

security.oauth2.client.pre-established-redirect-uri服务端pre-established的跳转URI.

security.oauth2.client.refresh-token-validity-seconds指定refresh token的有效期.

security.oauth2.client.registered-redirect-uri指定客户端跳转URI，多个以逗号分隔.

security.oauth2.client.resource-ids指定客户端相关的资源id，多个以逗号分隔.

security.oauth2.client.scopeclient的scope

security.oauth2.client.token-name指定token的名称

security.oauth2.client.use-current-uri是否优先使用请求中URI，再使用pre-established的跳转URI. 默认为true

security.oauth2.client.user-authorization-uri用户跳转去获取access token的URI.

security.oauth2.resource.id指定resource的唯一标识.

security.oauth2.resource.jwt.key-uriJWT token的URI. 当key为公钥时，或者value不指定时指定.

security.oauth2.resource.jwt.key-valueJWT token验证的value. 可以是对称加密或者PEMencoded RSA公钥. 可以使用URI作为value.

security.oauth2.resource.prefer-token-info是否使用token info，默认为true

security.oauth2.resource.service-id指定service ID，默认为resource.

security.oauth2.resource.token-info-uritoken解码的URI.

security.oauth2.resource.token-type指定当使用userInfoUri时，发送的token类型.

security.oauth2.resource.user-info-uri指定user info的URI

security.oauth2.sso.filter-order如果没有显示提供WebSecurityConfigurerAdapter时指定的Filter order.

security.oauth2.sso.login-path跳转到SSO的登录路径默认为/login.

security.require-ssl是否对所有请求开启SSL，默认为false.

security.sessions指定Session的创建策略(always, never, if_required, stateless).

security.user.name指定默认的用户名，默认为user.

security.user.password默认的用户密码.

security.user.role默认用户的授权角色.

SpringBoot支持了两种数据库迁移工具
一个是flyway，一个是liquibase。其本身也支持sql script，在初始化数据源之后执行指定的脚本。

flyway
flyway.baseline-description对执行迁移时基准版本的描述.

flyway.baseline-on-migrate当迁移时发现目标schema非空，而且带有没有元数据的表时，是否自动执行基准迁移，默认false.

flyway.baseline-version开始执行基准迁移时对现有的schema的版本打标签，默认值为1.

flyway.check-location检查迁移脚本的位置是否存在，默认false.

flyway.clean-on-validation-error当发现校验错误时是否自动调用clean，默认false.

flyway.enabled是否开启flywary，默认true.

flyway.encoding设置迁移时的编码，默认UTF-8.

flyway.ignore-failed-future-migration当读取元数据表时是否忽略错误的迁移，默认false.

flyway.init-sqls当初始化好连接时要执行的SQL.

flyway.locations迁移脚本的位置，默认db/migration.

flyway.out-of-order是否允许无序的迁移，默认false.

flyway.password目标数据库的密码.

flyway.placeholder-prefix设置每个placeholder的前缀，默认${.

flyway.placeholder-replacementplaceholders是否要被替换，默认true.

flyway.placeholder-suffix设置每个placeholder的后缀，默认}.

flyway.placeholders.[placeholder name]设置placeholder的value

flyway.schemas设定需要flywary迁移的schema，大小写敏感，默认为连接默认的schema.

flyway.sql-migration-prefix迁移文件的前缀，默认为V.

flyway.sql-migration-separator迁移脚本的文件名分隔符，默认__

flyway.sql-migration-suffix迁移脚本的后缀，默认为.sql

flyway.tableflyway使用的元数据表名，默认为schema_version

flyway.target迁移时使用的目标版本，默认为latest version

flyway.url迁移时使用的JDBC URL，如果没有指定的话，将使用配置的主数据源

flyway.user迁移数据库的用户名

flyway.validate-on-migrate迁移时是否校验，默认为true.

liquibase
liquibase.change-logChange log 配置文件的路径，默认值为classpath:/db/changelog/db.changelog-master.yaml

liquibase.check-change-log-location是否坚持change log的位置是否存在，默认为true.

liquibase.contexts逗号分隔的运行时context列表.

liquibase.default-schema默认的schema.

liquibase.drop-first是否首先drop schema，默认为false

liquibase.enabled是否开启liquibase，默认为true.

liquibase.password目标数据库密码

liquibase.url要迁移的JDBC URL，如果没有指定的话，将使用配置的主数据源.

liquibase.user目标数据用户名

aop
spring.aop.auto是否支持@EnableAspectJAutoProxy，默认为: true

spring.aop.proxy-target-classtrue为使用CGLIB代理，false为JDK代理，默认为false

application
spring.application.admin.enabled是否启用admin特性，默认为: false

spring.application.admin.jmx-name指定admin MBean的名称，默认为: org.springframework.boot:type=Admin,name=SpringApplication

autoconfig
spring.autoconfigure.exclude配置要排除的Auto-configuration classes.

batch
spring.batch.initializer.enabled是否在必要时创建batch表，默认为true

spring.batch.job.enabled是否在启动时开启batch job，默认为true

spring.batch.job.names指定启动时要执行的job的名称，逗号分隔，默认所有job都会被执行

spring.batch.schema指定要初始化的sql语句路径，默认:classpath:org/springframework/batch/core/schema-@@platform@@.sql)

spring.batch.table-prefix指定批量处理的表的前缀.

jmx
spring.jmx.default-domain指定JMX domain name.

spring.jmx.enabled是否暴露jmx，默认为true

spring.jmx.server指定MBeanServer bean name. 默认为: mbeanServer)

mail
spring.mail.default-encoding指定默认MimeMessage的编码，默认为: UTF-8

spring.mail.host指定SMTP server host.

spring.mail.jndi-name指定mail的jndi名称

spring.mail.password指定SMTP server登陆密码.

spring.mail.port指定SMTP server port.

spring.mail.properties指定JavaMail session属性.

spring.mail.protocol指定SMTP server使用的协议，默认为: smtp

spring.mail.test-connection指定是否在启动时测试邮件服务器连接，默认为false

spring.mail.username指定SMTP server的用户名.

sendgrid
spring.sendgrid.password指定SendGrid password.

spring.sendgrid.proxy.host指定SendGrid proxy host.

spring.sendgrid.proxy.port指定SendGrid proxy port.

spring.sendgrid.username指定SendGrid username.

social
spring.social.auto-connection-views是否开启连接状态的视图，默认为false

spring.social.facebook.app-id指定应用id

spring.social.facebook.app-secret指定应用密码

spring.social.linkedin.app-id指定应用id

spring.social.linkedin.app-secret指定应用密码

spring.social.twitter.app-id指定应用ID.

spring.social.twitter.app-secret指定应用密码