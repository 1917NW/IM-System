

# 项目描述

该项目是一个即时通讯系统，架构为C/S架构，其中客户端的技术栈为JavaFX、Netty，单体架构的服务器端的技术栈为Netty、SpringBoot、Redis、MySQL，分布式架构的服务器端的技术栈为Netty、SpringBoot、Redis、MySQL、Nacos、Dubbo、RocketMQ。该项目包含的功能为使用手机号注册、登录、搜索好友、添加好友、好友聊天(文字消息、表情消息、文件消息)、创建群组、搜索群组、加入群组、群组聊天、客户端本地消息缓存、服务器端离线消息缓存。

# TODO

## 客户端

* [X] 增加密码框查看密码
* [x] 使用手机号注册
* [x] 使用手机号登录
* [ ] 登录成功时加载动画
* [X] 设置一个很炫酷的按钮
* [X] 删除会话后infoBox显示背景图片
* [ ] 设置图片为圆角（无法实现）
* [ ] 引入头像
* [X] 消息提示
* [X] 实现群聊功能
* [X] 实现选中的功能
* [X] 调整消息样式
* [X] 消息添加右键菜单栏，菜单栏功能包含复制
* [x] 消息填充
* [x] 个人信息界面

## 服务器端



* [x] 密码加密
* [X] 优化netty加密，解密处理器
* [ ] 头像上传功能

* [X] 搜索好友
* [X] 添加好友
* [X] 私聊
  
* [x] 创建群组
* [x] 搜索群组
* [x] 加入群组：初步设想不是微信模式，而是QQ模式，即设置为需要群主同意才可以加入
* [x] 群聊
  
* [x] 文字消息
* [x] 表情
* [x] 文件发送
* [x] 上传文件/下载文件



* [X] 好友申请时的提示信号
* [X] 对同一个人多次发送好友申请，该人只能收到一行好友申请
* [X] 好友申请成功落库
* [X] 客户端下线后，如果有其他客户端给该客户端发送消息，则需要服务器端保存，并在下一次客户端上线后，推送给该客户端
* [x] 离线缓存，客户端下线后，需要将当前客户端的状态进行缓存，包括新的朋友内容，消息，群组，好友，下一次上线后，不再需要去服务器端拉取
* [x] 用户和群组具体信息展示
* [x] 客户端实现本地消息缓存
* [x] 服务器端实现离线消息缓存
* [x] 好友bug，同意添加好友后数据库只插入一次
* [x] 读写文件、上传/下载文件异步优化


* [x] sql优化
* [x] 群组测试(sql优化，离线消息缓存)
* [ ] 接入AI
* [ ] 朋友圈
* [x] 单体测试


## 分布式
* [x] 服务端注册ip + 服务端ip负载均衡
* [x] 搭建nacos
* [x] 分布式下的登录/注册、创建群组、搜索好友/搜索群组功能与单体的功能相同
* [x] 分布式下的添加好友
* [x] 分布式下的好友聊天功能
* [x] 分布式下的群组聊天功能
* [x] 分布式下的申请群组
* [x] 分布式下的服务器端离线缓存
* [x] 搭建dubbo服务
* [x] 用户id : dubbo服务注册到redis中
* [x] 搭建rocketMQ
* [x] 搭建consumer
* [x] dubbo扩展机制调用
* [x] 分布式项目测试





