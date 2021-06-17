

### 一、适配

* 完成 `AuthAdapter` bean 构建
* 完成 `AuthProcessor` 适配

### 二、应用

* 通过 `AuthAdapter` 的`addRule(...)` 用于添加全局的签权规则
* 使用注解 `@AuthPermissions`、`@AuthRoles` 控制具体的Java函数
* 使用模板标签 `<@authPermissions>`、`<@authRoles>` 控制视图块是否显示

> 其它模板的模板标签参考：demo_beetl, demo_enjoy, demo_freemarker, demo_jsp, demo_thymeleaf, demo_velocity