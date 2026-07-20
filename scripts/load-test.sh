#!/bin/bash

TARGET=${1:-http://localhost:8080}
COUNT=${2:-1000}

for i in $(seq 1 $COUNT); do
  curl -s $TARGET >/dev/null &
done

wait
echo "load test finished"
