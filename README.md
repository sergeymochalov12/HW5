## Урок 5. От простого к практике
1) Сделать вариант класса ViewClassEng с текстом на английском языке, подключить к нему интерфейс iGetView. Класс ViewEng подключить к контроллеру.

3) Сделать вариант класса ModelClassHash с хранилищем типа HashMap<Long,Student>, подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.

4) Добавить команду в метод run класса контролер по удалению студента:

    Для этого: Добавить в switch команду DELETE
- запросить у пользователя номер студента на удаление
- вызов удаления у модели(метод добавить в интерфейс iGetModel)
- если такого нромера нет, то сообщить об этом
