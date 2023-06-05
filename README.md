# Магазин, торгующий комплектующими и компьютерами
Данный магазин представляет собой REST API, который позволяет взаимодействовать с базой данных с помощью HTTP запросов.
## Установка и запуск
1. Склонируйте репозиторий: 'git clone https://github.com/Skyforgerr/hardwareGoods.git'
2. Перейдите в директорию проекта: 'cd место, куда вы склонировали репозиторий'
3. Откройте код в редакторе
4. Убедитесь, что у вас запущен клиент PostgreSQL
5. Запустите проект из редактора кода
## Тестирование
1. Откройте Postman
2. Прописывайте указанные ниже запросы для теста приложения
### Работа с ПК:
1. http://localhost:8080/api/v1/desktop/add - добавление нового ПК, POST
В тело запроса передать JSON в формате: 
{
    "series":"test series",
    "manufacturer":"test manufacturer",
    "cost":10.0,
    "amountOfGoodsLeftInTheStorage":2,
    "formFactor":"test"
}
2. http://localhost:8080/api/v1/desktop/list - вывод списка всех ПК, GET
3. http://localhost:8080/api/v1/desktop/delete - удаление ПК по определенному id, DELETE
В параметрах добавить id со значением существующего уже ПК (Если такого нет, то выведется сообщение о том что ПК с таким id не найден).
4. http://localhost:8080/api/v1/desktop/alter - изменение информации о ПК, PUT
В параметрах добавить id со значением существующего уже ПК (Если такого нет, то выведется сообщение о том что ПК с таким id не найден).
В теле запроса передать JSON в формате:
{
    "series":"new series",
    "manufacturer":"new manufacturer",
    "cost":11.0,
    "amountOfGoodsLeftInTheStorage":3,
    "formFactor":"form"
}
### Работа с дисками:
1. http://localhost:8080/api/v1/drive/add - добавление нового диска, POST
В тело запроса передать JSON в формате: 
{
    "series":"test series",
    "manufacturer":"test manufacturer",
    "cost":10.0,
    "amountOfGoodsLeftInTheStorage":2,
    "value":1
}
2. http://localhost:8080/api/v1/drive/list - вывод списка всех дисков, GET
3. http://localhost:8080/api/v1/drive/delete - удаление диска по определенному id, DELETE
В параметрах добавить id со значением существующего уже диска (Если такого нет, то выведется сообщение о том что диск с таким id не найден).
4. http://localhost:8080/api/v1/desktop/alter - изменение информации о диске, PUT
В параметрах добавить id со значением существующего уже диска (Если такого нет, то выведется сообщение о том что диск с таким id не найден).
В теле запроса передать JSON в формате:
{
    "series":"new series",
    "manufacturer":"new manufacturer",
    "cost":11.0,
    "amountOfGoodsLeftInTheStorage":3,
    "value":2
}
