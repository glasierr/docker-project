# docker-project

1. docker network create mynet

2. docker build -t <your-name>/drivers-storage .

3. docker run -d -P --name storage --network=mynet <your-name>/drivers-storage

4. docker build -t <your-name>/js-client .

5. docker run -d -P --name client --network=mynet <your-name>/js-client

6. docker port client

7. Open in browser localhost:<port>/index.html
