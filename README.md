# solon_auth_demo

solon_auth_demo

#### 授权标签例

beetl 示例：

```html
<#authPermissions name="user:del">
我有user:del权限
</#authPermissions>

<#authRoles name="admin">
我有admin角色
</#authRoles>
```

enjoy 示例：

```html
#authPermissions("user:del")
我有user:del权限
#end

#authRoles("admin")
我有admin角色
#end
```

freemarker 示例：

```html
<@authPermissions name="user:del">
我有user:del权限
</@authPermissions>

<@authRoles name="admin">
我有admin角色
</@authRoles>
```
