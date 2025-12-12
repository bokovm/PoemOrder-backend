# Используем официальный образ Java 17
FROM eclipse-temurin:17-jdk-alpine

# Создаем рабочую директорию в контейнере
WORKDIR /app

# Копируем предварительно собранный JAR-файл приложения
# ЗАМЕЧАНИЕ: сначала нужно выполнить `mvn clean package` в вашем проекте
COPY target/*.jar app.jar

# Открываем порт, на котором работает Spring Boot
EXPOSE 8080

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]