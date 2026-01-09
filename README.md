## 🎁 Head First. Паттерны проектирования
В этом репозитории представлен программный код 
шаблонов проектирования **"Head First Design Patters"** (2-е издание книги, выпущенное в декабре 2020 года).

### 🚀 Как запустить программный код?
Для запуска Вы можете использовать либо утилиту `make`, либо же `Gradle Wrapper`.

Список make-команд, которые доступны для работы:
```bash
make help

# Available Commands:
#  make build          - Build project
#  make run-X          - Launch project (example, make run-Ducks)
#  make test           - Run the tests
#  make lint           - Check the code style
```

Для того чтобы запустить программный код, расположенный, допустим, в пакете `ducks`,
нужно выполнить следующую команду:
```bash
make run-Ducks
```

Если использовать Gradle Wrapper, то нужно воспользоваться
следующей командой:
```bash
./gradlew runDucks
```
Для вывода содержимого в текстовый файл, можно использовать
следующую команду:
```bash
./gradlew runDucks > example.txt
```

### ▶️ Модульные тесты
Для запуска тестов вы можете использовать следующую команду:
```bash
make test
```

### 📥 Упражнения
* [DuckSimulator](src/main/java/ducks)