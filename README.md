# OA_system
a oa system (unfinish)
redis路径：
# systemctl stop firewalld
cd /usr/local/redis/bin  路径
./redis-server redis.conf  启动服务

ps aux | grep redis  查看服务
ps -ef|grep redis 查看主从服务

./reids-server *:6379 #主从哨兵服务
               *:6380
               *:6381

./redis-cli -p 6379 -a root  开启客户端

./redis-sentinel /opt/redis/conf/sentinel-26379.conf
./redis-sentinel /opt/redis/conf/sentinel-26380.conf
./redis-sentinel /opt/redis/conf/sentinel-26381.conf
开启哨兵

rabbitmq
cd ~
systemctl start rabbitmq-server.service  启动服务
192.168.201.128:15672 访问路径


前端
npm run serve
后台
http:localhost:8181/doc.html



