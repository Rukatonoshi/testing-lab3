![alt text](https://i.pinimg.com/736x/c2/bc/fc/c2bcfca10c8fe95692cb5c160657b1cb.jpg)

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/5A-G3YaK)
# Лабораторная работа: Тестирование REST API и настройка CI/CD

## Цель работы  
Ознакомиться с процессом настройки CI/CD для автоматического тестирования. В рамках работы будет настроено тестирование Java-приложения с использованием GitHub Actions и автоматическая генерация отчётов о тестировании.

---
## Часть 1: Настройка CI/CD и генерация отчётов

### 1. **Подготовка проекта**
1. Используйте код, который был написан в предыдущей лабораторной работе.
2. Убедитесь, что проект может быть успешно собран и протестирован локально.

### 2. **Настройка CI/CD с GitHub Actions**
1. В корне репозитория создайте директорию `.github/workflows/`.
2. Добавьте файл `ci.yml` для настройки CI-пайплайна с GitHub Actions:
   - Запуск тестов при `push` и `pull request`.
   - Использование `maven test` или `gradle test`.
   - Выгрузка отчётов о тестах в артефакты.
3. Закоммитьте и запушьте изменения, убедитесь, что GitHub Actions запускает тесты при push.

## Часть 2: Настройка CI/CD и генерация отчётов
1.  Подключите JaCoCo для покрытия кода
2.  Добавьте шаг в ci.yml для выгрузки отчёта JaCoCo
3.  Подключите Allure Reports
4.  Теперь при запуске таски test будет создаваться папка с отчётами Allure. Добавьте в ci.yml шаги для генерации и загрузки Allure-отчёта:
5.  Настройте ветку gh-pages, куда GitHub Actions будет публиковать отчёты.
  - Перейдите в Settings → Pages, выберите ветку gh-pages как источник
  - Добавьте в ci.yml шаги для публикации
  - Теперь после каждого коммита отчёт Allure будет доступен по ссылке `https://<your-username>.github.io/<your-repo>/index.html`
6. Добавьте статический анализатор кода (SpotLess || SpotBugs || CodeQL). Выберите один из них, но прочитайте про все обязательно!
7. (Optional, никак оцениваться не будет) Подключить Telegram-бота или Slack-уведомления о статусе тестов.
