# Перечень автоматизируемых сценариев

**Успешная покупка тура по банковской карте(APROOVED)  
1.Нажимаем кнопку "Купить" 2.Вводим в форму валидные значения  
3.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Проходит оплата и появляется сообщение об успешной покупке тура

Отклоненная покупка тура по банковской карте (DECLINE)  
1.Нажимаем кнопку "Купить"  
2.Вводим в форму валидные значения  
3.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке

Попытка покупки со всеми пустыми полями    
1.Нажимаем кнопку "Купить"    
2.Оставляем все поля пустыми    
3.Нажимаем кнопку "Отправить"    
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Покупка тура с невалидным номером банковской карты  
1.Нажимаем кнопку "Купить"  
2.В поле "Номер карты" вводим 17-ти значный номер карты  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с пустым полем "Номер карты"  
1.Нажимаем кнопку "Купить"  
2.Оставляем поле "Номер карты" пустым  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным месяцем (однозначное число)  
1.Нажимаем кнопку "Купить"  
2.Вводим в поле "Месяц" однозначное число  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным месяцем (проверка граничных значений ниже допустимого)  
1.Нажимаем кнопку "Купить"  
2.Вводим в поле "Месяц" число 00  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным месяцем (проверка граничных значений выше допустимого)
1.Нажимаем кнопку "Купить"
2.Вводим в поле "День" число 13
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с пустым полем "Месяц"
1.Нажимаем кнопку "Купить"
2.Оставляем поле "Месяц" пустым
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным годом ( однозначное число)
1.Нажимаем кнопку "Купить"
2.Вводим в поле "Год" однозначное число
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным годом (нулевое значение)
1.Нажимаем кнопку "Купить"
2.Вводим в поле "Год" число 00
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным годом (неверно указан срок действия карты)  
1.Нажимаем кнопку "Купить"
2.Вводим в поле "Год" вводим значение предыдущего года
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с пустым полем "Год"
1.Нажимаем кнопку "Купить"
2.Оставляем поле "Год" пустым
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным данными владельца ( кириллица)
1.Нажимаем кнопку "Купить"
2.В поле "Владелец" вводим данные на кириллице
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным данными владельца (числовые значения)
1.Нажимаем кнопку "Купить"
2.В поле "Владелец" вводим числовые значения
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным данными владельца (спецсимволы)   
1.Нажимаем кнопку "Купить"
2.В поле "Владелец" вводим спецсимволы
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с введенным в поле "Владелец" одним буквенным значением (минимальная длина поля)
1.Нажимаем кнопку "Купить"
2.В поле "Владелец" вводим одно буквенное значение
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с невалидным CVV (однозначное число)
1.Нажимаем кнопку "Купить"
2.Вводим в поле "CVV" однозначное число
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки с пустым полем "CVV"   
1.Нажимаем кнопку "Купить"
2.Оставляем поле "CVV" пустым
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Успешная покупка тура в кредит по данным банковской карты (APPROVED)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в форму валидные значения
3.Нажимаем кнопку "Отправить"
Ожидаемый результат:Проходит оплата и появляется сообщение об успешной покупке тура

Отклоненная покупка тура в кредит по банковской карте (DECLINED)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в форму валидные значения
3.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке

Попытка покупки со всеми пустыми полями    
1.Нажимаем кнопку "Купить"    
2.Оставляем все поля пустыми    
3.Нажимаем кнопку "Отправить"    
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Покупка тура в кредит с невалидным номером банковской карты
1.Нажимаем кнопку "Купить в кредит"
2.В поле "Номер карты" вводим 17-ти значный номер карты
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с пустым полем "Номер карты"
1.Нажимаем кнопку "Купить в кредит"
2.Оставляем поле "Номер карты" пустым
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным месяцем (однозначное число)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в поле "Месяц" однозначное число
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным месяцем (проверка граничных значений ниже допустимого)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в поле "Месяц" число 00
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным месяцем (проверка граничных значений выше допустимого)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в поле "День" число 13
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с пустым полем "Месяц"
1.Нажимаем кнопку "Купить в кредит"
2.Оставляем поле "Месяц" пустым
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным годом ( однозначное число)
1.Нажимаем кнопку "Купить в кредит"
2.Вводим в поле "Год" однозначное число
3.Оставшиеся поля заполняем валидными значениями
4.Нажимаем кнопку "Отправить"
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным годом (нулевое значение)  
1.Нажимаем кнопку "Купить в кредит"  
2.Вводим в поле "Год" число 00  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным годом (неверно указан срок действия карты)  
1.Нажимаем кнопку "Купить в кредит"  
2.Вводим в поле "Год" вводим значение предыдущего года  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с пустым полем "Год"  
1.Нажимаем кнопку "Купить в кредит"  
2.Оставляем поле "Год" пустым  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным данными владельца ( кириллица)  
1.Нажимаем кнопку "Купить в кредит"  
2.В поле "Владелец" вводим данные на кириллице  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным данными владельца (числовые значения)    
1.Нажимаем кнопку "Купить в кредит"     
2.В поле "Владелец" вводим числовые значения   
3.Оставшиеся поля заполняем валидными значениями    
4.Нажимаем кнопку "Отправить"    
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным данными владельца (спецсимволы)   
1.Нажимаем кнопку "Купить в кредит"    
2.В поле "Владелец" вводим спецсимволы   
3.Оставшиеся поля заполняем валидными значениями    
4.Нажимаем кнопку "Отправить"    
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с введенным в поле "Владелец" одним буквенным значением (минимальная длина поля)  
1.Нажимаем кнопку "Купить в кредит"  
2.В поле "Владелец" вводим одно буквенное значение  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с невалидным CVV (однозначное число)  
1.Нажимаем кнопку "Купить в кредит"  
2.Вводим в поле "CVC/CCV" однозначное число  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

Попытка покупки тура в кредит с пустым полем "CVV"  
1.Нажимаем кнопку "Купить в кредит"  
2.Оставляем поле "CVC/CCV" пустым  
3.Оставшиеся поля заполняем валидными значениями  
4.Нажимаем кнопку "Отправить"  
Ожидаемый результат: Не проходит оплата и появляется сообщение об ошибке (поле заполнено неверно)

# Перечень используемых инструментов с обоснованием выбора

Intellij IDEA-среда для разработки и создания Java-приложений;

GitHub-облачная платформа для хранения проектов и совместной разработки;

Gradle-система для автоматизации сборки приложений;

Allure-фреймворк для создания простых отчетов автотестов;

Selenide-библиотека для написания UI тестов с открытым исходным кодом. Решает основную часть проблем с таймаутами и
кликами на элементы;

Lombok- библиотека Java, позволяющая сократить шаблонный код;

JUnit- одна из самых популярных сред тестирования в экосистеме Java;

Java JDK 11-это набор инструментов для разработки на Java. С его помощью можно компилировать и запускать написанный код;

Faker-это библиотека,позволяющая генерировать случайные данные, с помощью которой, можно заполнить таблицы в базе
данных, построить корректные XML-документы, сформировать JSON-ответы для REST;

Docker- это платформа контейнеризации с открытым исходным кодом. С ее помощью можно автоматизировать создание приложений
Платформа позволяет быстрее тестировать и выкладывать приложения, запускать на одной машине требуемое количество
контейнеров;

# Перечень и описание возможных рисков при автоматизации

Отсутствие необходимой документации к работе веб-сервера;  
Вероятность возникновения проблемы с SQL из-за необходимости совмещения с двумя БД: MySQL и PostgreSQL;  
Неверное понимание логики работы веб-сервиса,а,следовательно,неверное написание автотестов;  
Поля “Месяц” и “Год” должны быть изменяемыми;  
Поле “Путешествие дня” должно быть изменяемым каждый день в соответствии с изменениями цен;
Изменение дизайна веб-сервиса может привести к некорректному прохождению автотестов;  
Могут возникнуть проблемы с запусками контейнера и SUT.

# Интервальная оценка с учётом рисков в часах

Настройка SUT-15 часов  
Написание автотестов-15 часов  
Прогон автотестов-2 часа  
Поиск и исправление багов-5 часов  
Написание отчетов-15 часов

# План сдачи работ: когда будут готовы автотесты, результаты их прогона

Результаты автотестов будут готовы: 25.08.2023  
Результаты прогона автотестов:26.08.2023  
Отчет по итогам автотестов:29.08.2023  
Отчет по итогам автоматизации:30.08.23  