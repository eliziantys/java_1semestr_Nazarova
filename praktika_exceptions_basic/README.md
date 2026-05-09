# Тема: исключения

В этой папке:

- `Practice2.java` — примеры генерации и обработки исключений

## Практика 1

### `Throwable`

`Throwable` — это базовый класс для всех объектов, которые могут быть выброшены оператором `throw` и обработаны механизмом `try-catch`.

От него наследуются:

- `Error`
- `Exception`

### `Error`

`Error` используется для серьезных ошибок среды выполнения или виртуальной машины Java.

Примеры:

- `OutOfMemoryError`
- `StackOverflowError`

Обычно такие ошибки не обрабатывают в программе, потому что они связаны с критическими проблемами выполнения.

### `Exception`

`Exception` используется для ситуаций, которые программа может перехватить и обработать.

Это основной класс для большинства исключений, возникающих в обычной работе программы.

### `RuntimeException`

`RuntimeException` — это подкласс `Exception`, который объединяет исключения времени выполнения.

Они обычно возникают из-за ошибок в логике программы.

Примеры:

- `ArithmeticException`
- `NullPointerException`
- `ClassCastException`
- `IllegalArgumentException`
- `ArrayIndexOutOfBoundsException`

Их не обязательно явно объявлять или обрабатывать, но при необходимости это можно делать.

## Практика 2

В `Practice2.java` приведены примеры генерации и обработки:

- `ArithmeticException`
- `ArrayIndexOutOfBoundsException`
- `IllegalArgumentException`
- `ClassCastException`
- `NullPointerException`

Во всех случаях используется конструкция:

```java
try {
    ...
} catch (...) {
    ...
}
```

## Краткий вывод

- `Error` — критические ошибки среды;
- `Exception` — исключения, которые можно обрабатывать;
- `RuntimeException` — типичные ошибки времени выполнения в коде программы.
