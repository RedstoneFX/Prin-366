import math

radius = 7
area = round(math.pi) * radius ** 2 # Первый коммит в свою ветку, округление числа Пи
circumference = 2 * round(math.pi) * radius # Второй коммит в свою ветку, дополнительное округление числа Пи

print(f"Радиус окружности: {radius}")
print(f"Площадь круга: {round(area, 2)}")
print(f"Длина окружности: {round(circumference, 2)}")
print(f"Проверка: {radius}² * π ≈ {round(radius**2 * 3.14, 2)}")

print(f"Число Пи: {math.pi}") # Первый коммит в мастера, вывод числа пи

print(f"Округленное число Пи: {round(math.pi)}") # Второй коммит в мастера, вывод округленного числа пи

