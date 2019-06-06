`curl -X POST 'http://localhost:7200/oauth/token' -d 'grant_type=password&username=user&password=pwd'  -H 'Authorization: Basic bXktY2xpZW50OnNlY3JldA=='`

`curl -H 'Authorization: Basic bXktY2xpZW50OnNlY3JldA==' 'http://localhost:7200/private?access_token=token'`