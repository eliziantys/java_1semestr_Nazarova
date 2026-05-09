# Тема: перегрузка методов

## Практика 1

Дан код:

```java
public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11 };

        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }

        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
```

## Что выведет программа

```text
Number=1
Number=11
Number=1.11
Number=11.11
Integer = 1
int = 11
Float = 1.1100
Number=11.11
```

## Почему в цикле результат другой

Причина в том, что **перегрузка определяется на этапе компиляции**.

Компилятор выбирает метод не по реальному объекту во время выполнения, а по **типу переменной**, через которую передается аргумент.

### 1. Что происходит в цикле

В цикле переменная объявлена так:

```java
for (Number n : num)
```

Значит, для компилятора переменная `n` всегда имеет тип `Number`, даже если внутри массива реально лежат:

- `Integer`
- `Integer` после автоупаковки числа `11`
- `Float`
- `Double`

Поэтому в строке

```java
a.printNum(n);
```

компилятор видит аргумент типа `Number` и выбирает метод:

```java
printNum(Number n)
```

Именно поэтому в цикле все 4 вызова идут в `printNum(Number)`.

### 2. Что происходит в отдельных вызовах

Здесь компилятор видит конкретные аргументы:

```java
a.printNum(new Integer(1));
```

Аргумент имеет тип `Integer`, значит выбирается:

```java
printNum(Integer i)
```

Дальше:

```java
a.printNum(11);
```

Число `11` имеет тип `int`, значит выбирается:

```java
printNum(int i)
```

Дальше:

```java
a.printNum(1.11f);
```

Число `1.11f` имеет тип `float`, при автоупаковке оно становится `Float`, значит выбирается:

```java
printNum(Float f)
```

И последний вызов:

```java
a.printNum(11.11);
```

Число `11.11` имеет тип `double`. Метода `printNum(double)` или `printNum(Double)` здесь нет. Поэтому значение автоупаковывается в `Double`, а затем подходит под параметр типа `Number`.

Выбирается:

```java
printNum(Number n)
```

## Итог

В цикле все элементы передаются через переменную типа `Number`, поэтому всегда вызывается `printNum(Number)`.

Во второй части компилятор видит конкретные типы аргументов, поэтому выбирает более подходящие перегруженные методы:

- `Integer` -> `printNum(Integer)`
- `int` -> `printNum(int)`
- `float` -> `printNum(Float)`
- `double` -> `printNum(Number)`
