FROM ubuntu:24.04
WORKDIR /app
COPY swagger/ .
COPY main .
RUN chmod +x main
RUN ls -l
ENTRYPOINT ["./main"]