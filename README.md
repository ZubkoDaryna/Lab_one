# Lab_one
1. humanIMB → HumanBMI(у PascalCase).

2. imb → bmi — Body Mass Index (BMI), а не imt.

3. W, H → weight, height(замість однолітерних змінних).

4. Статична змінна imb(має бути нестатичною,адже кожна людина має свій індекс маси тіла).
   
5. takeW() → getWeight(), putW() → setWeight()(відповідно до стандартів JavaBeans).

6. Result() → getResult() (выдповыдно до норм називання методыв як дії).

7. & → && (повинно бути логічне І, а не побітова &).

8. Видалено зайву ініціалізацію string = null.

9. Обчислення BMI винесено в окремий метод calculateBMI().

10. Всі змінні класу оголошено як private — інкапсуляція.
