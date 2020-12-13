# curl 输入param

不能直接 http:/xxx/param1=xxx 这样， http这段需要用 '' 包起来

curl -X GET 'http://localhost:9000/hello-world?name=garden'

