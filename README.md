# kafka-producer
Ejemplo de un producer simple, utilizando Kafka

Este ejemplo es un WS REST simple, que permite mediante un POST, publicar mensajes en un topic de kafka,
para que luego estos puedan ser consumidos por cualquier consumidor.

Para correr este ejemplo se necesita primero tener corriendo un servidor Zookeeper y un servidor Kafka
(Pueden ser locales)

Una vez hecho esto, se debe crear un topic llamado mytopic:

./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mytopic

Ahora ya se puede levantar la aplicación y consumir por POST:

ENDPOINT:
localhost:8080/kafka/produce

BODY:
{
    "text": "Hola mundo Java"
}

El mensaje enviado puede ya ser consumido por cualquier consumidor, pudiendo ser el siguiente:
