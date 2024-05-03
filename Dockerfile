FROM ubuntu:24.04
WORKDIR /app
RUN mkdir swagger
COPY woorizip.swagger.json woorizip.swagger.json
COPY main .
RUN chmod +x main
RUN ls -l
ENTRYPOINT ["./main"]