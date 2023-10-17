№ Процедура запуска автотестов

Предусловие - запущен Docker Desktop

Запускаем проект QA-diplom в IntelliJ IDEA

В 1-ом терминале запускаем контейнеры с образами Баз Данных (MySql, PostgresQl) и симулятором gate-simulator командой
Docker-compose up

Во 2-ом терминале запускаем наше приложение с базой MySQL командой
java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar aqa-shop.jar

Или во 2-ом терминале запускаем наше приложение с базой PostgresSQL командой
java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar aqa-shop.jar

Запускаем тесты:
Команда для MySQL ./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"
Команда для Postgres ./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"

Отчет о тестировании:
Отчет формируется через Allure, при использовании команды ./gradlew allureServe

Отчетные документы: Report и Summary
