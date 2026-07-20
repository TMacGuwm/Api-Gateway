# API Gateway Deployment Guide

## Local

Build:

```bash
mvn clean package
```

Run:

```bash
java -jar target/api-gateway.jar
```

## Docker

Build image:

```bash
docker build -t api-gateway:1.0.0 .
```

## Kubernetes

Apply resources:

```bash
kubectl apply -f k8s/
```

## Production Checklist

- Configure secrets
- Configure upstream services
- Enable monitoring
- Verify health endpoints
- Verify rate limits
