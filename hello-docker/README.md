# Build and Run the docker
docker build -t garden/hello-docker .
docker run -p 8080:8080 garden/hello-docker

