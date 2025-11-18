FROM myoung34/github-runner:latest

RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean
