#!/bin/bash
git pull
buf mod update
buf generate
go mod tidy
git add .
git commit -m "update"
git push