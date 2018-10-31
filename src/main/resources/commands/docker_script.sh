#!/usr/bin/env bash

docker network create -d bridge kazanok_net
docker run --name kazanok_db --network=kazanok_net --network-alias kazanok_db -p 5432:5432 -e POSTGRES_USER=kazanok_admin -e POSTGRES_PASSWORD=webshop -d postgres:9.6