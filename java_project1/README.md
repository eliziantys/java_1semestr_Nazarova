# HuffmanTool

Консольная Java-программа для кодирования и декодирования файлов методом Хаффмана.

## Сборка

```bash
javac HuffmanTool.java
```

## Использование

```bash
java HuffmanTool encode <исходный-файл> <закодированный-файл>
java HuffmanTool decode <закодированный-файл> <результат-декодирования>
java HuffmanTool info <закодированный-файл>
```

## Тестовые примеры

```bash
printf "1111111111" > samples/same10.txt
printf "11111111112222233333" > samples/three20.txt

java HuffmanTool encode samples/same10.txt encoded/same10.huf
java HuffmanTool decode encoded/same10.huf decoded/same10.txt

java HuffmanTool encode samples/three20.txt encoded/three20.huf
java HuffmanTool decode encoded/three20.huf decoded/three20.txt

java HuffmanTool encode HuffmanTool.class encoded/HuffmanTool.class.huf
java HuffmanTool decode encoded/HuffmanTool.class.huf decoded/HuffmanTool.class
```

Описание структуры закодированного файла находится в `FORMAT.txt`.
