FROM ubuntu:24.04
WORKDIR /app
RUN mkdir swagger
COPY swagger/woorizip.swagger.json swagger/woorizip.swagger.json
COPY main .
RUN chmod +x main
RUN ls -l
ENTRYPOINT ["./main"]