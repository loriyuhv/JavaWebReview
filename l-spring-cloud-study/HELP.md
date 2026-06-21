# 一、nacos docker搭建配置
## 1.0 拉取
```bash
docker pull nacos/nacos-server:v3.0.3
```
## 1.1 配置
```yml
name: my-nacos
services:
  nacos:
    image: nacos/nacos-server:v3.0.3
    container_name: nacos-standalone
    restart: unless-stopped
    environment:
      - MODE=standalone
      - NACOS_AUTH_TOKEN=RpGORLlPPoC/pj9ojAMjp75rTOlTzjQD0x+dI7EgjIA=
      - NACOS_AUTH_IDENTITY_KEY=loriyuhv
      - NACOS_AUTH_IDENTITY_VALUE=wsw0420
      - JVM_XMS=512m
      - JVM_XMX=512m
      - JVM_XMN=256m
      - TIME_ZONE=Asia/Shanghai
    ports:
      - 8080:8080
      - 8848:8848
      - 9848:9848
    volumes:
      - ~/.docker-data/nacos/data:/home/nacos/data
      - ~/.docker-data/nacos/logs:/home/nacos/logs
```

## 1.2 创建目录
```bash
mkdir -p ~/.docker-data/nacos/{data, logs}
```
## 1.3 权限
```bash
sudo chown -R 999:999 ~/.docker-data/nacos/data ~/.docker-data/nacos/logs/
```

## 1.4 生成base64
```bash
openssl rand -base64 32
```
