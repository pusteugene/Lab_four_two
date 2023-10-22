# Lab_four_two
Lab 4.2


Лабораторна робота 4.2 (Hard)

Мета:

    Розуміти незмінну природу рядків Java.
    Працювати з методами рядка Java та StringBuilder.
    Розуміти регулярні вирази та їх застосування в Java.

Опис завдання:

У далекій галактиці існують повідомлення, зашифровані в дивних шаблонах, які потребують декодування. Вам було доручено написати програму на Java, яка розшифровує ці повідомлення.

Зашифроване повідомлення складається зі слів, розділених розділювачами, і кожне слово може бути закодовано різними методами. Ваша програма повинна виявляти метод кодування та декодувати відповідно.
Методи кодування:

    Кодування заміни голосних: усі голосні (a, e, i, o, u) замінюються на числа: a=1, e=2, i=3, o=4, u=5. Наприклад, "t2st3ng" повинно бути "testing".
    Кодування заміни приголосних: всі приголосні замінюються на наступний приголосний в послідовності. Наприклад, "ufttjoh" повинно бути "testing".

Вимоги:

    Створіть клас Java Decoder зі статичними методами для кожного типу кодування.
    Використовуйте регулярні вирази, щоб визначити, який метод кодування було застосовано до кожного слова.
    Використовуйте StringBuilder для ефективних маніпуляцій з рядками.
    Створіть функцію main для демонстрації вашого декодера з прикладами зашифрованих повідомлень.

Примітка: Це рішення припускає, що методи кодування не перетинаються. У реальному світі може знадобитися додаткові методи для визначення типу кодування з більшою точністю.

2. Покрити тестами функціональність програми.

Формат прийняття лабораторної роботи: 
1. Робота повинна мати план розробки програми та послідовність виконаних дій.
2. Код розробленого додатку прикріпити у вигляді посилання на GitHub
3. GitHub повинен мати комміти як ви зробили на протязі розробки програми. Мова коммітів: Англійська
