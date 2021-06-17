# solon_auth_demo

solon_auth_demo

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

demo_freemarker 示例：

```html
<@authPermissions name="user:del">
我有user:del权限
</@authPermissions>

<@authRoles name="admin">
我有admin角色
</@authRoles>
```
