#!/usr/bin/env bash

protoc   -I=com/example/quartz/emails/grpc/protos   --java_out=. --grpc-java_out=.  com/example/quartz/emails/grpc/protos/email_service.proto