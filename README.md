<h1 align="center" style="text-align:center;">
<img src="solon_icon.png" width="128" />
<br />
Solon Java Framework
</h1>
<p align="center">
	<strong>Java 新的生态型应用开发框架，更小、更快、更简单！</strong>
</p>
<p align="center">
	<a href="https://solon.noear.org/">https://solon.noear.org</a>
</p>

<p align="center">
    <a target="_blank" href="https://central.sonatype.com/search?q=org.noear%2520solon-parent">
        <img src="https://img.shields.io/maven-central/v/org.noear/solon.svg?label=Maven%20Central" alt="Maven" />
    </a>
    <a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.txt">
		<img src="https://img.shields.io/:License-Apache2-blue.svg" alt="Apache 2" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/JDK-8-green.svg" alt="jdk-8" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-11-green.svg" alt="jdk-11" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-17-green.svg" alt="jdk-17" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-21-green.svg" alt="jdk-21" />
	</a>
    <br />
    <a target="_blank" href='https://gitee.com/noear/solon/stargazers'>
		<img src='https://gitee.com/noear/solon/badge/star.svg' alt='gitee star'/>
	</a>
    <a target="_blank" href='https://github.com/noear/solon/stargazers'>
		<img src="https://img.shields.io/github/stars/noear/solon.svg?logo=github" alt="github star"/>
	</a>
</p>

<br/>
<p align="center">
	<a href="https://jq.qq.com/?_wv=1027&k=kjB5JNiC">
	<img src="https://img.shields.io/badge/QQ交流群-22200020-orange"/></a>
</p>


<hr />

启动快 5 ～ 10 倍；qps 高 2～ 3 倍；运行时内存节省 1/3 ~ 1/2；打包可以缩到 1/2 ~ 1/10


<hr />

## solon_auth_demo


#### 授权标签

demo_beetl 示例：

```html
<#authPermissions name="user:del">
我有user:del权限
</#authPermissions>

<#authRoles name="admin">
我有admin角色
</#authRoles>
```

demo_enjoy 示例：

```html
#authPermissions("user:del")
我有user:del权限
#end

#authRoles("admin")
我有admin角色
#end
```

demo_thymeleaf 示例：

```html
<auth:permissions name="user:del">
    我有user:del权限
</auth:permissions>

<auth:roles name="admin">
    我有admin角色
</auth:roles>
```

demo_freemarker 示例：

```html
<@authPermissions name="user:del">
我有user:del权限
</@authPermissions>

<@authRoles name="admin">
我有admin角色
</@authRoles>
```

demo_velocity 示例：

```html
#authPermissions("user:del")
我有user:del权限
#end

#authRoles("admin")
我有admin角色
#end
```

demo_jsp 示例：

```html
<auth:permissions name="user:del">
我有user:del权限
</auth:permissions>

<auth:roles name="admin">
我有admin角色
</auth:roles>
```
