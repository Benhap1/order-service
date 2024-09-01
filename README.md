# Kafka Order Processing Service

## Описание

Этот проект состоит из двух микросервисов:
1. **Order Service** (`order-service`) — принимает заказы через REST API и отправляет события в Kafka.
2. **Order Status Service** (`order-status-service`) — слушает события из Kafka и отправляет обновления статуса заказа обратно в другой Kafka топик.

## Требования

- Java 17+
- Apache Kafka установлен и запущен локально (можно использовать Docker)
- Maven

## Установка и запуск
Будем считать что расположение дистрибутива Kafka находиться по адресу: C:\Kafka, то запуск Zookeeper в cmd: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties.
Запуск сервера Kafka в cmd: .\bin\windows\kafka-server-start.bat .\config\server.properties.

Запустите микросервисы order-service и order-status-service.

Откройте Postman и сделайте POST- запрос:
http://localhost:8080/api/v1/orders
с примером сообщения:
{
"product": "Laptop",
"quantity": 2
}

Подключение и прослушивание топиков:
1. Откройте cmd и перейдите в папку с Kafka bin\windows;
2. Прослушивание сообщений из топика order-topic:
   kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic order-topic --from-beginning
3. Прослушивание сообщений из топика order-status-topic:
   kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic order-status-topic --from-beginning
