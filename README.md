# BSP -- 图书共享系统(Book Sharing Platform)

## 简介
该项目是西柚图书共享系统，主要是用户可以将自己的书放在系统上，然后其他用户感兴趣便可以进行 借阅| 收藏 | 预约(当前喜欢的书已经被其他人借走)，分为两套界面，实现功能如下：

- 登陆 | 注册
  - 用户可以注册
  - 管理员不可以注册
- 用户界面
  - 收藏图书
  - 预约图书
  - 借阅图书
  - 修改手机号
  - 修改密码
  - 上传自己的图书
- 管理员界面
  - 审核图书
  - 删除用户
  - 下架书籍
  - 逾期用户查询

## 界面展示
![注册页面][1]
![此处输入图片的描述][2]
![此处输入图片的描述][3]
![此处输入图片的描述][4]

## 接口文档
采用 ShowDoc 编写了文档
链接：https://www.showdoc.cc/229091588001200

## 技术
1、使用了 mybatis 持久化框架
2、利用过滤器实现了跨域和token申请验证

## 感悟
由于这次是和小伙伴利用 git 进行版本管理，很大程度提升了 git 的使用能力；对 java web 的前后端分离有了清晰的认识


  [1]: https://img2018.cnblogs.com/blog/1199740/201812/1199740-20181219220532240-829856476.png
  [2]: https://img2018.cnblogs.com/blog/1199740/201812/1199740-20181219220547656-437094560.png
  [3]: https://img2018.cnblogs.com/blog/1199740/201812/1199740-20181219220825796-388795277.png
  [4]: https://img2018.cnblogs.com/blog/1199740/201812/1199740-20181219220855541-1728331772.png
