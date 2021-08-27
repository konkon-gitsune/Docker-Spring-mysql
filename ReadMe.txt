# Spring + Mysql Docker(※dockerfile 未使用)

1.SpringBootのDocker-imageを作成する
　ーー ./gradlew build -x test
  (JPAがビルドの際に、テストに引っかかるため、テストを割愛しています。[-x test])
　ーー docker build -t spring-app .
　（imageに名前をつける[-t] [.]は現在のディレクトリにあるDockerfileを参照しています。）

2.Mysqlのイメージを取得
　ーー docker pull mysql:5.6
　（docker-imageを引っ張ってくる）
　ーー docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6
　（[--name] プロセスに名前をつける　[-e] 環境変数　[-d] バックグラウンドで実行）

3.SpringとMysqlを連携起動
　ーー docker run -d -p 8089:8089 --name spring-mysql --link mysql-standalone:mysql spring-app
　（[-p host:container]） 