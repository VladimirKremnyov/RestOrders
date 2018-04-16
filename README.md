# RestOrders
для запуска открыть приложение в intellij idea(или другой подобной IDE) и запустить приложение указав главным класс Main из пакета
restOrders

для генерации новых заказов в базе данных в постмане или любом другом подобном приложении необходимо послать запрос по следующему адресу
http://localhost:8080/orders/generateListOfOrders

перечень доступных REST запросов: 
1)POST:
/orders/create - создает order
/orders/generateListOfOrders - генерирует 40 случайных заказов
/orders/update - обновляет order
2)GET:
/orders - выборка всех order'ов
/ordersOrderedByManagerName - выборка order'ов группированных по имени менеджера 
3)DELETE:
/orders/delete/{id} - удаляет order по id 
/orders/delete/all - удаляет все order'a
