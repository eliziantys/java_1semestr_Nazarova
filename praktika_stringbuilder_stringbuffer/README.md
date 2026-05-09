# Тема: StringBuilder и StringBuffer

В этой папке:

- `Practice1.java` — демонстрация 10 методов классов `StringBuilder` и `StringBuffer`
- `Practice2.java` — примеры преобразований между `String`, `StringBuilder` и `StringBuffer`

## Практика 1

В `Practice1.java` показаны следующие методы:

- `append(...)`
- `insert(...)`
- `replace(...)`
- `delete(...)`
- `deleteCharAt(...)`
- `reverse()`
- `charAt(...)`
- `setCharAt(...)`
- `length()`
- `capacity()`

Также дополнительно показан вызов `append(...)` у `StringBuffer`.

У каждого метода в коде есть короткий комментарий.

## Практика 2

В `Practice2.java` показано, как преобразовывать объекты:

- `String -> StringBuilder`
- `String -> StringBuffer`
- `StringBuilder -> String`
- `StringBuffer -> String`
- `StringBuilder -> StringBuffer`
- `StringBuffer -> StringBuilder`

Основные способы:

- через конструкторы `new StringBuilder(...)` и `new StringBuffer(...)`
- через метод `toString()`

## Краткий вывод

- `String` — неизменяемый класс;
- `StringBuilder` — изменяемый и непотокобезопасный;
- `StringBuffer` — изменяемый и потокобезопасный.
